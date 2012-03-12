class A/*<owner>*/{}
class B/*<O>*/ extends A{}

class D/*<P>*/{
  A/*<P>*/ foo() {return  null;}
}

class E/*<Q>*/ extends D{
  A/*<Q>*/ foo() {return  null;}
}