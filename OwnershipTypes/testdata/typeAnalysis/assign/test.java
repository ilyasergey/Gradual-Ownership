class D/*<owner>*/ {
  D/*<this>*/ food;
}

class Main {
  void test() {
    final D d1 = new D/*<world>*/();

    d1.food = d1; // fail
  }
}