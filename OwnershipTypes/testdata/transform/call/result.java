class D {
  final private Object o1;
  final private Object o2;
  public Object __owner(){ return D.this.o1;}
  public D __updateDependent_D(java.util.Map map, String position) {
    map.put("dep_" + position + "_" + "D" + "_o1", D.this.o1);
    map.put("dep_" + position + "_" + "D" + "_o2", D.this.o2);
    map.put("fixedThis_" + position, this);
    return this;
  }
  public D __castAs_D(Object o1, Object o2) {
    final Object _o1 = D.this.o1;
    if (_o1.equals("WorldOwner") && o1.equals("WorldOwner")) { /* it's ok */}
     else if (o1.equals("UnknownOwner")) { /* it's ok */}
     else if (o1 != _o1) { throw new Error("Owner parameter equality error") ;}
    final Object _o2 = D.this.o2;
    if (_o2.equals("WorldOwner") && o2.equals("WorldOwner")) { /* it's ok */}
     else if (o2.equals("UnknownOwner")) { /* it's ok */}
     else if (o2 != _o2) { throw new Error("Owner parameter equality error") ;}
    return this;
  }
  public D food;
  public void foo(D d, D dd) {
  }
  D(Object o1, Object o2) {
    super();
    this.o1 = o1;
    this.o2 = o2;
  }
}
class Test {
  private  static D D_cast(D _arg, Object o1, Object o2) {
    return _arg == null ? _arg : _arg.__castAs_D(o1, o2);
  }
  void test() {
    final java.util.Map _depMap = new java.util.HashMap();
    D d1 = new D(Test.this, "WorldOwner");
    D arg1 = new D("WorldOwner", "WorldOwner");
    final D arg2 = new D("WorldOwner", "WorldOwner");
    d1.__updateDependent_D(_depMap, "13_5").foo(D_cast(arg1, _depMap.get("dep_13_5_D_o1"), _depMap.get("dep_13_5_D_o2")), D_cast(arg2, _depMap.get("dep_13_5_D_o2"), _depMap.get("dep_13_5_D_o2")));
  }
  Test() {
    super();
  }
}