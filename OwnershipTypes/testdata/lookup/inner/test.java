class F/*<owner>*/ {}


class D/*<owner>*/ {

  final F/*<this>*/ outerF = new F/*<this>*/();
  final F/*<world>*/ worldF = new F/*<world>*/();

  class E {
    void foo () {
      F/*<D.this>*/ innerF = outerF;
//      F/*<D.this>*/ innerF = worldF;
    }
  }

}