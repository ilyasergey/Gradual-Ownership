abstract class D/*<owner>*/ {
  void foo() {
    D d = new D/*<world>*/() {}; // ok
    D d1 = new D() {}; // fail
  }
}