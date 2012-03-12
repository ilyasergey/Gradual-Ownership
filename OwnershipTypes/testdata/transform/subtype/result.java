interface Iterator {
  Iterator __updateDependent_Iterator(java.util.Map map, String position);
  Object __owner();
  Iterator __castAs_Iterator(Object O);
}
class LinkedList {
  private transient Entry header;
  private class Entry {
  final private Object owner;
  public Object __owner(){ return LinkedList.Entry.this.owner;}
  public LinkedList.Entry __updateDependent_LinkedList_Entry(java.util.Map map, String position) {
    map.put("dep_" + position + "_" + "LinkedList_Entry" + "_owner", LinkedList.Entry.this.owner);
    map.put("fixedThis_" + position, this);
    return this;
  }
  public LinkedList.Entry __castAs_LinkedList_Entry(Object owner) {
    final Object _owner = LinkedList.Entry.this.owner;
    if (_owner.equals("WorldOwner") && owner.equals("WorldOwner")) { /* it's ok */}
     else if (owner.equals("UnknownOwner")) { /* it's ok */}
     else if (owner != _owner) { throw new Error("Owner parameter equality error") ;}
    return this;
  }
    private Entry(Object owner) {
      super();
    this.owner = owner;
    }
  }
  Iterator getIterator() {
    return new ListItr();
  }
  private class ListItr implements Iterator {
  public Object __owner(){ return LinkedList.this;}
  public Iterator __updateDependent_Iterator(java.util.Map map, String position) {
    map.put("dep_" + position + "_" + "LinkedList_ListItr" + "_O", LinkedList.this);
    map.put("fixedThis_" + position, this);
    return this;
  }
  public Iterator __castAs_Iterator(Object O) {
    final Object _O = LinkedList.this;
    if (_O.equals("WorldOwner") && O.equals("WorldOwner")) { /* it's ok */}
     else if (O.equals("UnknownOwner")) { /* it's ok */}
     else if (O != _O) { throw new Error("Owner parameter equality error") ;}
    return this;
  }
  public LinkedList.ListItr __updateDependent_LinkedList_ListItr(java.util.Map map, String position) {
    map.put("fixedThis_" + position, this);
    return this;
  }
  public LinkedList.ListItr __castAs_LinkedList_ListItr() {
    return this;
  }
    private Entry lastReturned = header;
    private ListItr() {
      super();
    }
  }
  LinkedList() {
    super();
  }
}
class OtherLinkedList extends LinkedList {
  private transient OtherEntry header;
  private class OtherEntry {
  final private Object owner;
  public Object __owner(){ return OtherLinkedList.OtherEntry.this.owner;}
  public OtherLinkedList.OtherEntry __updateDependent_OtherLinkedList_OtherEntry(java.util.Map map, String position) {
    map.put("dep_" + position + "_" + "OtherLinkedList_OtherEntry" + "_owner", OtherLinkedList.OtherEntry.this.owner);
    map.put("fixedThis_" + position, this);
    return this;
  }
  public OtherLinkedList.OtherEntry __castAs_OtherLinkedList_OtherEntry(Object owner) {
    final Object _owner = OtherLinkedList.OtherEntry.this.owner;
    if (_owner.equals("WorldOwner") && owner.equals("WorldOwner")) { /* it's ok */}
     else if (owner.equals("UnknownOwner")) { /* it's ok */}
     else if (owner != _owner) { throw new Error("Owner parameter equality error") ;}
    return this;
  }
    private OtherEntry(Object owner) {
      super();
    this.owner = owner;
    }
  }
  Iterator getIterator() {
    return new OtherListItr();
  }
  private class OtherListItr implements Iterator {
  public Object __owner(){ return OtherLinkedList.this;}
  public Iterator __updateDependent_Iterator(java.util.Map map, String position) {
    map.put("dep_" + position + "_" + "OtherLinkedList_OtherListItr" + "_O", OtherLinkedList.this);
    map.put("fixedThis_" + position, this);
    return this;
  }
  public Iterator __castAs_Iterator(Object O) {
    final Object _O = OtherLinkedList.this;
    if (_O.equals("WorldOwner") && O.equals("WorldOwner")) { /* it's ok */}
     else if (O.equals("UnknownOwner")) { /* it's ok */}
     else if (O != _O) { throw new Error("Owner parameter equality error") ;}
    return this;
  }
  public OtherLinkedList.OtherListItr __updateDependent_OtherLinkedList_OtherListItr(java.util.Map map, String position) {
    map.put("fixedThis_" + position, this);
    return this;
  }
  public OtherLinkedList.OtherListItr __castAs_OtherLinkedList_OtherListItr() {
    return this;
  }
    private OtherEntry lastReturned = header;
    private OtherListItr() {
      super();
    }
  }
  OtherLinkedList() {
    super();
  }
}