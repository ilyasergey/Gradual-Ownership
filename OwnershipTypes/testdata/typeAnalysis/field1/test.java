class F/*<o1, o2>*/ {
  public F/*<o1, world>*/ testField = new F/*<o1, world>*/();
}

class B {
  Object bar;
}

class D/*<owner>*/ {

  void foo() {
     F/*<?, world>*/ bar = (new F/*<owner, world>*/()).testField; // ok

     F/*<world, ?>*/ boo = (new F/*<owner, world>*/()).testField; // should fail
  }

}