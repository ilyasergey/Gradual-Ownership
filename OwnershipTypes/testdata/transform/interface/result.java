package a.b.c;
interface D {
  a.b.c.D __updateDependent_a_b_c_D(java.util.Map map, String position);
  Object __owner();
  a.b.c.D __castAs_a_b_c_D(Object owner, Object otherOwner);
  void foo(int i);
}
interface E extends D {
  a.b.c.E __updateDependent_a_b_c_E(java.util.Map map, String position);
  Object __owner();
  a.b.c.D __castAs_a_b_c_D(Object owner, Object otherOwner);
  a.b.c.E __castAs_a_b_c_E(Object P);
  void bar(String s);
}