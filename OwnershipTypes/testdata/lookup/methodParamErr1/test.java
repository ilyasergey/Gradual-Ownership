class E/*<owner1>*/ {}

class D/*<owner>*/ {
  void foo(final Object arg1, final Object owner) {
    E/*<owner>*/ e = new E/*<owner>*/();
  }
}