class E/*<owner1, owner2>*/ {}

class D/*<owner>*/ {
  void foo() {
    new E/*<this, owner>*/();
  }
}