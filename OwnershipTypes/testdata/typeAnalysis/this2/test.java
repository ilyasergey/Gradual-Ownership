class D/*<owner>*/ {
  D/*<this>*/ f = new D/*<this>*/();
  D/*<owner>*/ e = new D/*<owner>*/();
}

class Test {
  void foo() {
    final D d0 = new D/*<this>*/(); //ok

    final D/*<d0>*/ d1 = d0.f.e; // ok

    D/*<d0>*/ d2 = d1.e; // ok

    D/*<d1>*/ d3 = d1.f; // ok

    D/*<world>*/ d4 = d0.f.e; // fail
  }
}