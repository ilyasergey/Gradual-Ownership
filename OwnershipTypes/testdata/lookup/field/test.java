class E/*<owner1, owner2>*/ {}

class D/*<owner>*/ {
  final E/*<owner, world>*/ arg1 = null;

  void foo(final Object arg2) {
    final D/*<arg1>*/ d = new D/*<arg1>*/();

    E/*<d, arg1>*/ e1 = new E/*<d,arg1>*/();

    final E e2 = new E/*<d, owner>*/();
  }
}