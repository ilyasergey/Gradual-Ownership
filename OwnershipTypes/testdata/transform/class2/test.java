class E/*<O>*/ {}

class D/*<owner, otherOwner>*/ extends E/*<owner>*/{

  public D(int i, int j) {
  }

  public D(int k) {
    this(k, 0);
  }

  void foo(int i) {}
}