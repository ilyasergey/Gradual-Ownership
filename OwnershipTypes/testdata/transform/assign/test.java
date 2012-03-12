class D/*<owner>*/ {
  D/*<owner>*/ bar;
  D baz;

  void foo() {
    D d = new D/*<world>*/();
    baz.bar = d.bar;
  }
}