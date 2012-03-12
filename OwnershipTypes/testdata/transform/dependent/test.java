class D/*<owner>*/ {
  D/*<owner>*/ foo;
  D bar;
}

class Main {
  void main() {
    final D d = new D/*<this>*/();
    d.bar.foo = d;
  }
}