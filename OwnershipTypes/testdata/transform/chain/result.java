class D {
  final private Object owner;
  public Object __owner(){ return D.this.owner;}
  public D __updateDependent_D(java.util.Map map, String position) {
    map.put("dep_" + position + "_" + "D" + "_owner", D.this.owner);
    map.put("fixedThis_" + position, this);
    return this;
  }
  public D __castAs_D(Object owner) {
    final Object _owner = D.this.owner;
    if (_owner.equals("WorldOwner") && owner.equals("WorldOwner")) { /* it's ok */}
     else if (owner.equals("UnknownOwner")) { /* it's ok */}
     else if (owner != _owner) { throw new Error("Owner parameter equality error") ;}
    return this;
  }
  public D __safeUpdate_bar(D o) {
    if (o == null) return o;
    boolean result;
    try { result = this.__insideOwnerOf(o); } catch (Exception e) {throw new Error("Unexpected error in the method __insideOwnerOf()");}
    if (result) return (this.bar = o); else throw new Error("Ownership invariant violation");
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
  D bar;
  D foo;
  public D(Object owner) {
    super();
    this.owner = owner;
    this.__safeUpdate_bar(null);
  }
}
class Main {
  void bar() {
    final D d1 = new D(Main.this);
    d1.foo.__safeUpdate_bar(d1);
  }
  Main() {
    super();
  }
}