class D/*<owner>*/ {
  D/*<owner>*/ foo() { return null; };
  D/*<this>*/ bar() { return null; };
}

class Main {
  void foo() {
    final D d = new D/*<this>*/();

    final D/*<this>*/ dd = d.foo();

    D/*<d>*/ ddd = d.bar();
  }
}