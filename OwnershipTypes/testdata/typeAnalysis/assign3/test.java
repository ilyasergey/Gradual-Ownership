class D/*<owner, other>*/ {
  D/*<owner, other>*/ f;
  D e; // unknown
}

class Main {
  void foo() {
    final D d = new D/*<this, world>*/();
    D/*<this, world>*/ dd = (d.f = d.e);
  }
}