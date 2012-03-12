interface Iterator {
  Iterator __updateDependent_Iterator(java.util.Map map, String position);
  Object __owner();
  Iterator __castAs_Iterator(Object owner, Object other);
}
class Test {
  void foo() {
    Iterator iter = new Iterator() {
  public Object __owner(){ return "WorldOwner";}
  public Iterator __updateDependent_Iterator(java.util.Map map, String position) {
    map.put("dep_" + position + "_" + "Test_Anonymous0" + "_owner", "WorldOwner");
    map.put("dep_" + position + "_" + "Test_Anonymous0" + "_other", "WorldOwner");
    map.put("fixedThis_" + position, this);
    return this;
  }
  public Iterator __castAs_Iterator(Object owner, Object other) {
    final Object _owner = new Object(){public String toString() { return "WorldOwner"; }};
    if (_owner.equals("WorldOwner") && owner.equals("WorldOwner")) { /* it's ok */}
     else if (owner.equals("UnknownOwner")) { /* it's ok */}
     else if (owner != _owner) { throw new Error("Owner parameter equality error") ;}
    final Object _other = new Object(){public String toString() { return "WorldOwner"; }};
    if (_other.equals("WorldOwner") && other.equals("WorldOwner")) { /* it's ok */}
     else if (other.equals("UnknownOwner")) { /* it's ok */}
     else if (other != _other) { throw new Error("Owner parameter equality error") ;}
    return this;
  }
    };
  }
  Test() {
    super();
  }
}