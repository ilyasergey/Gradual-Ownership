interface Enumeration {
}
interface Iterator {
  Iterator __updateDependent_Iterator(java.util.Map map, String position);
  Object __owner();
  Iterator __castAs_Iterator(Object o1, Object o2);
}
class Itr implements Enumeration, Iterator {
  public Object __owner(){ return "WorldOwner";}
  public Iterator __updateDependent_Iterator(java.util.Map map, String position) {
    map.put("dep_" + position + "_" + "Itr" + "_o1", "WorldOwner");
    map.put("dep_" + position + "_" + "Itr" + "_o2", "WorldOwner");
    map.put("fixedThis_" + position, this);
    return this;
  }
  public Iterator __castAs_Iterator(Object o1, Object o2) {
    final Object _o1 = new Object(){public String toString() { return "WorldOwner"; }};
    if (_o1.equals("WorldOwner") && o1.equals("WorldOwner")) { /* it's ok */}
     else if (o1.equals("UnknownOwner")) { /* it's ok */}
     else if (o1 != _o1) { throw new Error("Owner parameter equality error") ;}
    final Object _o2 = new Object(){public String toString() { return "WorldOwner"; }};
    if (_o2.equals("WorldOwner") && o2.equals("WorldOwner")) { /* it's ok */}
     else if (o2.equals("UnknownOwner")) { /* it's ok */}
     else if (o2 != _o2) { throw new Error("Owner parameter equality error") ;}
    return this;
  }
  public Itr __updateDependent_Itr(java.util.Map map, String position) {
    map.put("fixedThis_" + position, this);
    return this;
  }
  public Itr __castAs_Itr() {
    return this;
  }
  public Enumeration __updateDependent_Enumeration(java.util.Map map, String position) {
    map.put("fixedThis_" + position, this);
    return this;
  }
  public Enumeration __castAs_Enumeration() {
    return this;
  }
  Itr() {
    super();
  }
}