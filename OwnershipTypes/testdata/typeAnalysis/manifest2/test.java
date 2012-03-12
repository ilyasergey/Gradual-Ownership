interface Iterator/*<owner>*/ {
}

public class LinkedHashMap {

  private static class Entry {}

  private abstract class LinkedHashIterator implements Iterator {
    Entry nextEntry() {
      return null;
    }
  }

  private class KeyIterator extends LinkedHashIterator {
    public Entry next() {
      return nextEntry();
    }
  }


}
