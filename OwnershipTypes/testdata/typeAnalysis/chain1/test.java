class F/*<o1, o2>*/ {
  public F/*<o1, world>*/ f1 = new F/*<o1, world>*/();
  public F f2 = new F/*<o1, o2>*/();
  public F/*<o1, world>*/ f3 = new F/*<o1, world>*/();
}

class B {
  Object bar;
}

class D/*<owner, owner2>*/ {

  void foo() {
     F/*<?, owner>*/ bar = (new F/*<owner, owner2>*/()).f2.f1.f3; // should fail
  }

}