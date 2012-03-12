interface Iterator/*<O>*/ {}

class LinkedList/*<owner>*/ {

  private transient Entry/*<this>*/ header;

  private class Entry/*<owner>*/{}

  Iterator/*<owner>*/ getIterator() {
    return new ListItr();
  }

  private class ListItr implements Iterator/*<LinkedList.this>*/{
    private Entry/*<LinkedList.this>*/ lastReturned = header;
  }

}