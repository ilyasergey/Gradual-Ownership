class E/*<owner1, owner2, owner3>*/ {}

class D/*<owner>*/ {
  void foo(final Object arg1, final Object arg2) {
    final D/*<arg1>*/ d1 = new D/*<arg1>*/();
    final D/*<d1>*/ d2 = new D/*<d1>*/();
    E/*<d2, d1, arg1>*/ e = new E/*<d2, d1, arg1>*/();
  }
}