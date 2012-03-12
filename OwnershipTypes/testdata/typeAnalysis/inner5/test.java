interface Iter/*<o1, o2>*/ {}
class E/*<owner>*/ {}

class D/*<owner>*/ {
  class MyItr implements Iter/*<D.this, D.this.owner>*/ {
    D/*<D.this.owner>*/ foo() { return null;}
    E/*<D.this.owner>*/ myE = new E/*<D.this.owner>*/();
  }
  public MyItr getItr() {
    return  new MyItr();
  }
}

class Main {
  void main() {
    final D d = new D/*<this>*/();
    Iter/*<d, this>*/ newD = d.getItr(); // ok
    E/*<this>*/ e1 = d.getItr().myE; // ok
    E/*<world>*/ e2 = d.getItr().myE; // should fail
  }
}