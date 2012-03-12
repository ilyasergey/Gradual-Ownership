abstract class D/*<owner>*/ {
  void foo() {
    D d = new D/*<owner>*/() {};
  }
}