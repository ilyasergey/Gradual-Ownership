interface Iterator/*<O>*/ {}

class LinkedList {

  private transient Entry/*<this>*/ header;

  private class Entry/*<owner>*/{}

  Iterator/*<this>*/ getIterator() {
    return new ListItr();
  }

  private class ListItr implements Iterator/*<LinkedList.this>*/{
    private Entry/*<LinkedList.this>*/ lastReturned = header;
  }

}

class Main {
  void test() {
    final LinkedList l = new LinkedList();
    Iterator/*l*/ iter = l.getIterator();
  }
}