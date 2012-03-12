interface Iterator/*<owner, other>*/ {}

class MyIter implements Iterator {}

class Test {
  void foo() {
    Iterator/*<world, world>*/ iter = new MyIter();
  }
}