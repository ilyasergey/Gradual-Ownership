class A {
  private B b = new B(new A());

  A foo(B b) {
    System.out.println(b);
    return this;
  }
}