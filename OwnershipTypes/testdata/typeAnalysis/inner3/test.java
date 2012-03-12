abstract class Map {
  interface Entry/*<owner>*/ {}

  void deleteEntry(Object e) {}
}

class TreeMap extends Map {

  private class MyEntry implements Entry {}

  void foo(MyEntry e) {
    deleteEntry(e);
  }

}