class Data/*<p>*/ {}

class Link/*<owner, d>*/ {
  Link next;
  Data data;
  Link(Link next, Data data) {
    this.next = next;
    this.data = data;
  }
}

class List/*<owner, data>*/ {
  Link head;
  void add(Data d){
    head = new Link/*<this, data>*/ (head, d);
  }
  Iterator makeIterator() {
    return new Iterator/*<this, data>*/(head);
  }
}

class Iterator/*<o, d>*/ {
  Link current;
  Iterator(Link first) {
    current = first;
  }
  void next() {
    current = current.next;
  }
  Data elem() {
    return current.data;
  }
  boolean done() {
    return (current == null);
  }
}
  
class Main {
  List list;

  public Main() {
    list = new List/*<this, world>*/();
  }

  void populate() {
    list.add(new Data/*<world>*/());
    list.add(new Data/*<world>*/());
  }

  static void main() {
    Main main = new Main();
    main.populate();
  }
}