class D/*<owner>*/ {
  D bar;
  D/*<owner>*/ foo;

  public D() {
    bar = null;
  }
}

class Main {
  void bar() {
    final D d1 = new D/*<this>*/();
    d1.foo.bar = d1;
  }
}