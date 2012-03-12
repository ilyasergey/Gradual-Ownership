interface Iterator/*<owner>*/ {

}

class Test {
  void foo() {
    Iterator iter = new Iterator() {
    };
  }
}