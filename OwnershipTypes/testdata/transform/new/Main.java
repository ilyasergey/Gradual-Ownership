class D {
  final private Object owner;
  final private Object other;
  public Object __owner(){ return D.this.owner;}
  public D __updateDependent_D(java.util.Map map, String position) {
    map.put("dep_" + position + "_" + "D" + "_owner", D.this.owner);
    map.put("dep_" + position + "_" + "D" + "_other", D.this.other);
    map.put("fixedThis_" + position, this);
    return this;
  }
  public D __castAs_D(Object owner, Object other) {
    final Object _owner = D.this.owner;
    if (_owner.equals("WorldOwner") && owner.equals("WorldOwner")) { /* it's ok */}
     else if (owner.equals("UnknownOwner")) { /* it's ok */}
     else if (owner != _owner) { throw new Error("Owner parameter equality error") ;}
    final Object _other = D.this.other;
    if (_other.equals("WorldOwner") && other.equals("WorldOwner")) { /* it's ok */}
     else if (other.equals("UnknownOwner")) { /* it's ok */}
     else if (other != _other) { throw new Error("Owner parameter equality error") ;}
    return this;
  }
  public static class _Helper {
    public static D cast(D _arg, Object owner, Object other) {
      return _arg == null ? _arg : _arg.__castAs_D(owner, other);
    }
    public static D put(D _arg, java.util.Map map, String position) {
      return _arg == null ? _arg : _arg.__updateDependent_D(map, position);
    }
  }
  public D __safeUpdate_e(D o) {
    if (o == null) return o;
    boolean result;
    try { result = this.__insideOwnerOf(o); } catch (Exception e) {throw new Error("Unexpected error in the method __insideOwnerOf()");}
    if (result) return (this.e = o); else throw new Error("Ownership invariant violation");
  }
  private boolean __insideOwnerOf(Object o) throws java.lang.IllegalAccessException, java.lang.ClassNotFoundException, java.lang.reflect.InvocationTargetException {
    java.lang.reflect.Method m;
    try {m = o.getClass().getMethod("__owner", new Class[0]);} catch (NoSuchMethodException e) {return true; /* o's owner is world (implicitly) */}
    Object result = m.invoke(o, new Object[0]); // get o's owner
    if (result == this) return true; // reflexivity
    if (result.equals("WorldOwner")) return true; // o's owner is world (explicitly)
    Object myOwner = this.__owner();  // my owner -- to check via transitivity
    if (myOwner == result || myOwner == o) return true;
    java.lang.reflect.Method m1;
    try {m1 = myOwner.getClass().getMethod("__owner", new Class[0]);} catch (NoSuchMethodException e) {return false; /* o's owner is not world, but this is world */}
    java.lang.reflect.Method insideOwner;
    try {insideOwner = myOwner.getClass().getMethod("__insideOwnerOf", new Class[]{Class.forName("java.lang.Object")});} catch (NoSuchMethodException e) {return false;}
    Object[] ownerArgs = new Object[]{result};
    if (insideOwner != null) return ((Boolean)insideOwner.invoke(myOwner, ownerArgs)).booleanValue(); // transitivity
    return false; // failed check
  }
  D f;
  D e;
  D(Object owner, Object other) {
    super();
    this.owner = owner;
    this.other = other;
  }
}
public class Main {
  void foo() {
    final D d = new D(Main.this, "WorldOwner");
    D d1 = new D(Main.this, "WorldOwner");
    d.__safeUpdate_e(d1);
    D dd = (d.f = D._Helper.cast(d.e, Main.this, "WorldOwner"));
    System.out.println("done!");
  }
  public static void main(String[] args) {
    Main main = new Main();
    main.foo();
  }
  Main() {
    super();
  }
}