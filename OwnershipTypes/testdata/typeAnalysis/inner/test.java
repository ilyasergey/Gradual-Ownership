class F/*<owner>*/ {}
interface Owned/*<Param>*/{}

class D/*<owner>*/ {

  final F/*<this>*/ outerF = new F/*<this>*/();
  final F/*<world>*/ worldF = new F/*<world>*/();

  class E implements Owned/*<D.this>*/ {
    void foo () {
      F/*<D.this>*/ innerF = outerF; // ok

      F/*<D.this>*/ f1 = new F/*<this>*/(); // fail
    }
  }

}
