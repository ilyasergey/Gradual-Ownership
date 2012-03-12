class E/*<owner1, owner2>*/ {}

class D/*<owner>*/ {
  void foo(final Object arg1, final Object arg2) {
    final D/*<arg1>*/ d = new D/*<arg1>*/();
    E/*<d, arg1>*/ e = new E/*<d,arg1>*/();
  }
}