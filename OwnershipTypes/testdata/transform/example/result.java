class E {
  final private Object P;
  public Object __owner(){ return E.this.P;}
  public E __updateDependent_E(java.util.Map map, String position) {
    map.put("dep_" + position + "_" + "E" + "_P", E.this.P);
    map.put("fixedThis_" + position, this);
    return this;
  }
  public E __castAs_E(Object P) {
    final Object _P = E.this.P;
    if (_P.equals("WorldOwner") && P.equals("WorldOwner")) { /* it's ok */}
     else if (P.equals("UnknownOwner")) { /* it's ok */}
     else if (P != _P) { throw new Error("Owner parameter equality error") ;}
    return this;
  }
  public D __safeUpdate_d(D o) {
    if (o == null) return o;
    boolean result;
    try { result = this.__insideOwnerOf(o); } catch (Exception e) {throw new Error("Unexpected error in the method __insideOwnerOf()");}
    if (result) return (this.d = o); else throw new Error("Ownership invariant violation");
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
  D d = new D(E.this.P);
  E(Object P) {
    super();
    this.P = P;
  }
}
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
  private  static E E_cast(E _arg, Object P) {
    return _arg == null ? _arg : _arg.__castAs_E(P);
  }
  private  static D D_put(D _arg, java.util.Map map, String position) {
    return _arg == null ? _arg : _arg.__updateDependent_D(map, position);
  }
  E e;
  void use(D arg) {
  }
  void exploit(E arg) {
    this.e = arg;
  }
  void test() {
    final java.util.Map _depMap = new java.util.HashMap();
    final E e = new E(D.this);
    final D d = D_put(e.d, _depMap, "11_19");
    d.use(d);
    d.exploit(E_cast(e, _depMap.get("dep_11_19_D_owner")));
  }
  D(Object owner) {
    super();
    this.owner = owner;
  }
}