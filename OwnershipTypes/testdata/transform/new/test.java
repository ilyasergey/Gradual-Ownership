class D/*<owner, other>*/ {
  D/*<owner, other>*/ f;
  D e; // unknown
}

class Main {
  void foo() {
    final D d = new D/*<this, world>*/();
    D d1 = new D/*<this, world>*/();
    d.e = d1;
    D/*<this, world>*/ dd = (d.f = d.e);
    System.out.println("done!");
  }

  public static void main(String[] args) {
    Main main = new Main();
    main.foo();
  }
}