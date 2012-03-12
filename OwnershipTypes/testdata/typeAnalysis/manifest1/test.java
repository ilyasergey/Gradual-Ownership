class F/*<owner>*/ {}
interface Iterator/*<O>*/ {}
///////////////////////////////

class D {

 final F/*<this>*/ outerF = new F/*<this>*/();

 class E implements Iterator/*<D.this>*/{
   F/*<D.this>*/ innerF = outerF; // ok
 }

 void bar() {
   final E e = new E();

   F/*<this>*/ f = e.innerF; //ok

   F/*<world>*/ fffail = e.innerF; // fail
 }

 }
