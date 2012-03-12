class E /*<P>*/ {
  D d = new D/*<P>*/();
}
class D/*<owner>*/ {
  E/*<owner>*/ e;
  void use(D/*<owner>*/ arg) {}
  void exploit(E/*<owner>*/ arg) { this.e = arg; }

  void test() {
    final E e = new E/*<this>*/();
    final D d = e.d;
    d.use(d);
    d.exploit(e);
  }
}
