class D/*<o1, o2>*/ {
  public  D/*<o1, o2>*/ food;
  public void foo(D/*<o1, o2>*/ d, D/*<o2, o2>*/ dd) {}
}

class Test {
  void test() {
    D d1 = new D/*<this, world>*/();

    D/*<?, world>*/ arg1 = new D/*<world, world>*/();
    final D arg2 = new D/*<world, world>*/();

    d1.foo(arg1, arg2);
  }
}