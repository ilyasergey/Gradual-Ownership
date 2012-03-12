class F/*<o1, o2>*/ {
  public F/*<o1, world>*/ testField = new F/*<o1, world>*/();
}

class D/*<owner>*/ {

  void foo() {
     F bar = (new F/*<owner, world>*/()).testField; // ok

     F/*<?, world>*/ baz = bar.testField; // ok

     F/*<?, owner>*/ boo = bar.testField; // should fail
  }

}