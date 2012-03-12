class E/*<e, d>*/ {}

class D/*<son, father>*/ {
  void foo() {
    new E/*<son, father>*/();
    new E/*<father, world>*/();

    new E/*<father, son>*/(); // should be an error
  }
}