interface A/*<o1, o2>*/ {}
class B/*<q, t>*/ implements A/*<q, t>*/{}

class D/*<owner>*/ extends B/*<owner, world>*/ {

  A a = new D/*<world>*/(); // ok

  B/*<world, world>*/ b1 = new D/*<world>*/(); // ok

  B/*<world, ?>*/ b2 = new D/*<world>*/(); // ok

  B/*<?, owner>*/ b3 = new D/*<owner>*/(); // should be an error

  B/*<?, world>*/ b4 = new D/*<owner>*/(); // ok
}