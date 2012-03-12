class E/*<owner1, owner2>*/ {}

class D/*<owner>*/ {
  void foo(final Object arg1) {
    final Object var = "";
    E/*<this, owner>*/ e = new E/*<this, owner>*/();
  }
}