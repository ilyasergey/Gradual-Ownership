class D {
  final private Object owner;
  final private Object otherOwner;
  public Object __owner(){ return D.this.owner;}
  public D __updateDependent_D(java.util.Map map, String position) {
    map.put("dep_" + position + "_" + "D" + "_owner", D.this.owner);
    map.put("dep_" + position + "_" + "D" + "_otherOwner", D.this.otherOwner);
    map.put("fixedThis_" + position, this);
    return this;
  }
  public D __castAs_D(Object owner, Object otherOwner) {
    final Object _owner = D.this.owner;
    if (_owner.equals("WorldOwner") && owner.equals("WorldOwner")) { /* it's ok */}
     else if (owner.equals("UnknownOwner")) { /* it's ok */}
     else if (owner != _owner) { throw new Error("Owner parameter equality error") ;}
    final Object _otherOwner = D.this.otherOwner;
    if (_otherOwner.equals("WorldOwner") && otherOwner.equals("WorldOwner")) { /* it's ok */}
     else if (otherOwner.equals("UnknownOwner")) { /* it's ok */}
     else if (otherOwner != _otherOwner) { throw new Error("Owner parameter equality error") ;}
    return this;
  }
  public D(Object owner, Object otherOwner, int i, int j) {
    super();
    this.owner = owner;
    this.otherOwner = otherOwner;
  }
  public D(Object owner, Object otherOwner, int k) {
    this(owner, otherOwner, k, 0);
  }
  void foo(int i) {
  }
}