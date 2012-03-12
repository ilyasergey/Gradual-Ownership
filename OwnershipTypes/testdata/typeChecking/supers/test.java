class A/*<T, O>*/ {}
class B/*<S, U, K>*/ extends A/*<S, K>*/{}
class C/*<V, P>*/ extends B/*<V, world, P>*/{}

class D/*<owner, owner2>*/ extends C/*<owner, owner2>*/{}