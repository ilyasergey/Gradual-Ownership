class D/*<owner>*/ {
  D/*<owner>*/ food;
}

class Main {
  void test() {
    final D d1 = new D/*<this>*/();

    d1.food = d1; // fail
  }
}