class C {}
class F/*<r>*/ {}
class E/*<o1, o2>*/ {}

class D/*<owner>*/ {
  void foo() {
    E e = new E/*<owner, world>*/();
    C c = new C();
  }
}