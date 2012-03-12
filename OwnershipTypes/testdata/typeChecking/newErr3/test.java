class E/*<e, d>*/ {}

class D/*<owner>*/ {
  void foo() {
    E/*<?>*/ e = new E/*<owner>*/();
  }
}