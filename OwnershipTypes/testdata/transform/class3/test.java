class E/*<O, P>*/ {}

class D/*<owner>*/ extends E/*<owner, world>*/{

  public D(int i, int j) {
  }

  public D(int k) {
    this(k, 0);
  }

  void foo(int i) {}
}