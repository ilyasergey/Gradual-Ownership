class F/*<S>*/ {}
class E/*<T>*/ extends F/*<T>*/{}

class D/*<owner>*/ extends E /*<owner>*/{
  void foo() {
    E/*<owner>*/ e = new D/*<owner>*/();
//    F/*<owner>*/ f1 = e;
    F/*<world>*/ f2 = e; // should fail
  }
}