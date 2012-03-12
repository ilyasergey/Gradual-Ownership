class C/*<o1, o2>*/ {}

class D/*<t1, t2>*/ extends C/*<t1, t2>*/{
  C/*<t1, t2>*/ c = new C/*<t1, t2>*/();
}

class E/*<s1, s2>*/ extends D/*<s1, s2>*/{}

class Foo/*<owner1, owner2>*/ {
  void foo() {
    final D d = new E/*<owner1, owner2>*/();
    final C c1 = d.c;
    C/*<owner1, owner2>*/ c_ok = c1; // ok
    C/*<owner1, owner1>*/ c_fail = c1; //fail
  }
}