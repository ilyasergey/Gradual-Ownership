class Data/*<p>*/ {}

class Link/*<owner, d>*/ {
  Link/*<owner, d>*/ next;
  Data/*<d>*/ data;
  Link(Link/*<owner, d>*/ next, Data/*<d>*/ data) {
    this.next = next;
    this.data = data;
  }
}

class List/*<owner, data>*/ {
  Link/*<this,data>*/head;
  void add(Data/*<data>*/ d){
    head = new Link/*<this, data>*/ (head, d);
  }
  Iterator/*<this,data>*/ makeIterator() {
    return new Iterator/*<this, data>*/(head);
  }
}

class Iterator/*<o, d>*/ {
  Link/*<o, d>*/ current;
  Iterator(Link/*<o, d>*/ first) {
    current = first;
  }
  void next() {
    current = current.next;
  }
  Data/*<d>*/ elem() {
    return current.data;
  }
  boolean done() {
    return (current == null);
  }
}
  
class Main {
  List/*<this,world>*/ list;

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