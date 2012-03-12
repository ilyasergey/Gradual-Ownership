class D/*<o1, o2>*/ {
  public void foo(D/*<o1, o2>*/ d, D/*<o2, o2>*/ dd) {}
}

class Main {
  void test() {
    final D d1 = new D/*<this, world>*/();

    D/*<?, world>*/ arg1 = new D/*<world, world>*/();
    final D arg2 = new D/*<world, world>*/();

    d1.foo(arg1, arg2);
  }
}