class E/*<owner1, owner2>*/ {}

class D/*<owner>*/ {
  void foo(final Object arg1) {
    Object var = "";
    E/*<var, owner>*/ e = new E/*<var, owner>*/();
  }
}