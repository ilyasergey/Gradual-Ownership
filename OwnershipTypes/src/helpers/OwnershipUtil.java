package helpers;

import AST.*;

/**
 * @author ilyas
 */
public abstract class OwnershipUtil {

  /**
   * An ad-hoc fold-left implementation for ownership parameter list
   * yielding an owner substitution
   *
   * @param list a list of ownership declaration of a class/interface
   * @return a substitution from names to syntactic parameters
   */
  public static Substitution fromParameterList(List<? extends OwnerDeclaration> list) {
    Substitution result = Substitution.empty();
    for (OwnerDeclaration decl : list) {
      result = result.update(decl.name(), decl);
    }
    return result;
  }

//  public static OwnershipType fromTypeDecl(TypeDecl td, Substitution subst) throws CloneNotSupportedException {
//    final TypeDecl clone = td.clone();
//    return new OwnershipType(td.getModifiers(), td.getID(), td.getBodyDecls(), td, subst);
//  }

  public static <Dom extends ASTNode, Im extends ASTNode> List<Im> map(List<Dom> list, Fun<Dom, Im> fun) {
    List<Im> result = new List<Im>();
    for (Dom elem : list) {
      result = result.add(fun.apply(elem));
    }
    return (result);
  }

}
