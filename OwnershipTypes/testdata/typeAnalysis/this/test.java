class D/*<owner>*/ {
  D/*<this>*/ f = new D/*<this>*/();
}

class Test {
  void foo(final D p) {
    D/*<p>*/ d1 = p.f; // ok

    D/*<world>*/ d2 = p.f; // should fail
  }
}