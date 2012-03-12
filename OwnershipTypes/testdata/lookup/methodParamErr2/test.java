class E/*<owner1, owner2>*/ {}

class D/*<owner>*/ {
  void foo(final Object arg1, Object arg2) {
    new E/*<arg2, owner>*/();
  }
}