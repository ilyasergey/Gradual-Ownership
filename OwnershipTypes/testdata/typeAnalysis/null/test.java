class D/*<owner>*/ {
  D/*<owner>*/ f;
  D e; // unknown
}

class Main {
  void foo() {
    final D d = null;
    D/*<this>*/ dd = d.f;
  }
}