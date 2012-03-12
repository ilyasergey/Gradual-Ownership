interface A/*<T, O>*/ {}
interface B/*<S, U, K>*/ extends A/*<S, K>*/{}

class C/*<V, P>*/ implements B/*<V, world, P>*/{}

class D/*<owner, owner2>*/ extends C/*<owner, owner2>*/ implements B/*<owner, owner, owner2>*/, A/*<owner, owner2>*/{}