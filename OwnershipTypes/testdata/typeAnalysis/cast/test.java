class D/*<o1, o2>*/ {}

class E/*<p>*/ extends D/*<p, world>*/{}

class Main {
  void foo() {
    final D d = new E/*<this>*/();

    D d1 = (D/*<?, world>*/)d; // ok

    D d2 = (D/*<world, world>*/)d; //fail
  }
}