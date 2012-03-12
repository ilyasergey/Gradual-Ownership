interface Iter {
  Iter __updateDependent_Iter(java.util.Map map, String position);
  Object __owner();
  Iter __castAs_Iter(Object o1, Object o2);
}
class E {
  final private Object owner;
  public Object __owner(){ return E.this.owner;}
  public E __updateDependent_E(java.util.Map map, String position) {
    map.put("dep_" + position + "_" + "E" + "_owner", E.this.owner);
    map.put("fixedThis_" + position, this);
    return this;
  }
  public E __castAs_E(Object owner) {
    final Object _owner = E.this.owner;
    if (_owner.equals("WorldOwner") && owner.equals("WorldOwner")) { /* it's ok */}
     else if (owner.equals("UnknownOwner")) { /* it's ok */}
     else if (owner != _owner) { throw new Error("Owner parameter equality error") ;}
    return this;
  }
  E(Object owner) {
    super();
    this.owner = owner;
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
  class MyItr implements Iter {
  public Object __owner(){ return D.this;}
  public Iter __updateDependent_Iter(java.util.Map map, String position) {
    map.put("dep_" + position + "_" + "D_MyItr" + "_o1", D.this);
    map.put("dep_" + position + "_" + "D_MyItr" + "_o2", D.this.owner);
    map.put("fixedThis_" + position, this);
    return this;
  }
  public Iter __castAs_Iter(Object o1, Object o2) {
    final Object _o1 = D.this;
    if (_o1.equals("WorldOwner") && o1.equals("WorldOwner")) { /* it's ok */}
     else if (o1.equals("UnknownOwner")) { /* it's ok */}
     else if (o1 != _o1) { throw new Error("Owner parameter equality error") ;}
    final Object _o2 = D.this.owner;
    if (_o2.equals("WorldOwner") && o2.equals("WorldOwner")) { /* it's ok */}
     else if (o2.equals("UnknownOwner")) { /* it's ok */}
     else if (o2 != _o2) { throw new Error("Owner parameter equality error") ;}
    return this;
  }
  public D.MyItr __updateDependent_D_MyItr(java.util.Map map, String position) {
    map.put("fixedThis_" + position, this);
    return this;
  }
  public D.MyItr __castAs_D_MyItr() {
    return this;
  }
    D foo() {
      return null;
    }
    E myE = new E(D.this.owner);
    MyItr() {
      super();
    }
  }
  public MyItr getItr() {
    return new MyItr();
  }
  D(Object owner) {
    super();
    this.owner = owner;
  }
}
class Main {
  void main() {
    final D d = new D(Main.this);
    Iter newD = d.getItr();
    E e1 = d.getItr().myE;
    E e2 = d.getItr().myE;
  }
  Main() {
    super();
  }
}