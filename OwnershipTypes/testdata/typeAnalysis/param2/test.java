class A/*<owner>*/{}
class B/*<O>*/ extends A{}

class D/*<P>*/{
  void foo(A/*<this>*/ a) {}
}

class E/*<Q>*/ extends D{
  void foo(A/*<this>*/ b) {}
}

class Main {
  void main() {
    final E e = new E/*<this>*/();
    e.foo(new A/*<e>*/());
  }
}