package helpers;

import AST.OwnerDeclaration;
import AST.Variable;

import java.util.*;

/**
 * @author ilyas
 */
public abstract class Substitution implements Fun<String, OwnerDeclaration> {

  public static Substitution empty() {
    return new Substitution() {
    };
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Substitution) {
      Substitution other = (Substitution) obj;
      final List<String> myDomain = getDomainAsSortedList();
      final List<String> otherDomain = other.getDomainAsSortedList();
      final int size = myDomain.size();
      if (otherDomain.size() != size) return false;
      for (int i = 0; i < size ; i++) {
        final OwnerDeclaration myElem = this.apply(myDomain.get(i));
        final OwnerDeclaration otherElem = other.apply(otherDomain.get(i));
        if (myElem != otherElem) return false;
      }
      return true;
    } else {
      return false;
    }
  }

  @Override
  public int hashCode() {
    final List<String> myDomain = getDomainAsSortedList();
    final StringBuffer buffer = new StringBuffer();
    for (String s : myDomain) {
      buffer.append(s).append(apply(s).hashCode());
    }
    return toString().hashCode();
  }

  private List<String> myDomain = null;

  public List<String> getDomainAsSortedList() {
    if (myDomain != null) return  myDomain;
    final ArrayList<String> list = new ArrayList<String>();
    for (String s : getDomain()) {
      list.add(s);
    }
    Collections.sort(list);
    myDomain = list;
    return myDomain;
  }

  public String toString() {
    final StringBuffer buffer = new StringBuffer();
    buffer.append("[");
    final ArrayList<String> list = new ArrayList<String>();
    for (String s : getDomain()) {
      list.add(s);
    }
    Collections.sort(list);
    for (String name : list) {
      final OwnerDeclaration declaration = apply(name);
      buffer.append(";(").append(name).append("->");
      buffer.append(declaration instanceof AST.Variable ? declaration.name() : declaration.toString());
      buffer.append(")");
    }
    buffer.append("]");
    return buffer.toString();
  }

  public Set<String> getDomain() {
    return new HashSet<String>();
  }

  public boolean isDefined(String str) {
    return getDomain().contains(str);
  }

  public int getDomainSize() {
    return getDomain().size();
  }

  public int getDomainSizeNoThis() {
    final Set<String> domain = getDomain();
    domain.remove("this");
    return domain.size();
  }

  public OwnerDeclaration apply(String name) {
    throw new CannotSubstituteException(name);
  }

  /**
   * Create a brand new substitution without sharing domains
   *
   * @param newName a new name
   * @param value   a corresponding value
   * @return new substitution
   */
  public Substitution update(final String newName, final OwnerDeclaration value) {
    return new Substitution() {
      @Override
      public Set<String> getDomain() {
        final Set<String> domain = Substitution.this.getDomain();
        domain.add(newName);
        return domain;
      }

      @Override
      public OwnerDeclaration apply(String name) throws CannotSubstituteException {
        if (newName.equals(name)) {
          return value;
        }
        return Substitution.this.apply(name);
      }
    };
  }

  /**
   * @param inner inner substitution
   * @return a composition of substitutions: (this o inner)
   */
  public Substitution compose(final Substitution inner) {
    Substitution result = inner;
    for (String name : inner.getDomain()) {
      if ("this".equals(name)) continue;
      final OwnerDeclaration innerResult = inner.apply(name);
      final String innerName = innerResult.name();
      if (isDefined(innerName)) {
        final OwnerDeclaration decl = this.apply(innerName);
        result = result.update(name, decl);
      } else {
        result = result.update(name, innerResult);
      }
    }
    if (isDefined("this")) {
      result = result.update("this", apply("this"));
    }
    return result;
  }
}
