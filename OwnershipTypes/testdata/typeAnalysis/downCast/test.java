class D/*<o1, o2>*/ {}

class E/*<p>*/ extends D/*<p, world>*/{}

class Main {
  void foo() {
    final D d = new E/*<this>*/();

    E e1 = (E/*<this>*/)d; // ok

    E e2 = (E/*<world>*/)d; // fail
  }
}