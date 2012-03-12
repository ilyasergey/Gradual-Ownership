interface I/*<P>*/ {}

class E/*<O>*/ {}

// implicit owner substitution
class D/*<owner>*/ extends E implements I {}

class Main {
  void foo() {
     final D d = new D/*<this>*/();
     E/*<this>*/ e = d;
     I/*<this>*/ i = d;
  }
}