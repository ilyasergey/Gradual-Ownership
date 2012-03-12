class D/*<o1, o2>*/ {}

class E/*<p>*/ extends D/*<p, world>*/{}

class Main {
  void foo(boolean cond) {
    final E e = new E/*<this>*/();
    final D d = new D/*<world, world>*/();
    D d1 = new D/*<world, world>*/();

    D result = cond ? e : d1; // ok

    D result2 = cond ? e : d; // fail
  }
}