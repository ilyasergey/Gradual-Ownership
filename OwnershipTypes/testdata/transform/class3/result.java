class E {
  final private Object O;
  final private Object P;
  public Object __owner(){ return E.this.O;}
  public E __updateDependent_E(java.util.Map map, String position) {
    map.put("dep_" + position + "_" + "E" + "_O", E.this.O);
    map.put("dep_" + position + "_" + "E" + "_P", E.this.P);
    map.put("fixedThis_" + position, this);
    return this;
  }
  public E __castAs_E(Object O, Object P) {
    final Object _O = E.this.O;
    if (_O.equals("WorldOwner") && O.equals("WorldOwner")) { /* it's ok */}
     else if (O.equals("UnknownOwner")) { /* it's ok */}
     else if (O != _O) { throw new Error("Owner parameter equality error") ;}
    final Object _P = E.this.P;
    if (_P.equals("WorldOwner") && P.equals("WorldOwner")) { /* it's ok */}
     else if (P.equals("UnknownOwner")) { /* it's ok */}
     else if (P != _P) { throw new Error("Owner parameter equality error") ;}
    return this;
  }
  E(Object O, Object P) {
    super();
    this.O = O;
    this.P = P;
  }
}
class D extends E {
  final private Object owner;
  public Object __owner(){ return D.this.owner;}
  public E __updateDependent_E(java.util.Map map, String position) {
    map.put("dep_" + position + "_" + "D" + "_O", D.this.owner);
    map.put("dep_" + position + "_" + "D" + "_P", "WorldOwner");
    map.put("fixedThis_" + position, this);
    return this;
  }
  public E __castAs_E(Object O, Object P) {
    final Object _O = D.this.owner;
    if (_O.equals("WorldOwner") && O.equals("WorldOwner")) { /* it's ok */}
     else if (O.equals("UnknownOwner")) { /* it's ok */}
     else if (O != _O) { throw new Error("Owner parameter equality error") ;}
    final Object _P = new Object(){public String toString() { return "WorldOwner"; }};
    if (_P.equals("WorldOwner") && P.equals("WorldOwner")) { /* it's ok */}
     else if (P.equals("UnknownOwner")) { /* it's ok */}
     else if (P != _P) { throw new Error("Owner parameter equality error") ;}
    return this;
  }
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
  public D(Object owner, int i, int j) {
    super(owner, "WorldOwner");
    this.owner = owner;
  }
  public D(Object owner, int k) {
    this(owner, k, 0);
  }
  void foo(int i) {
  }
}