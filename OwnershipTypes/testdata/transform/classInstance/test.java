interface Iterator/*<owner, other>*/ {

}

class Test {
  void foo() {
    Iterator iter = new Iterator() {
    };
  }
}