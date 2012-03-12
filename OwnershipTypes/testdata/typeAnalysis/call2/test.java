class D/*<owner>*/ {
  D/*<owner>*/ foo(D/*<owner>*/ d) { return null; };
}

class Main {
  void foo() {
    final D d = new D/*<this>*/();

    D/*<this>*/ dd = d.foo(d);
  }
}