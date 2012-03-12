class D/*<owner>*/ {
  D/*<this>*/ food;
  void feed(D/*<this>*/ food) {}
}

class Main {
  void test() {
    final D d1 = new D/*<world>*/();

    d1.feed(d1.food); // ok

//    d1.feed(d1); // fail
  }
}