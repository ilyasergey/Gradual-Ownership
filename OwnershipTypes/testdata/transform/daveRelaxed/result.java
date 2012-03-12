class Data {
  final private Object p;
  public Object __owner(){ return Data.this.p;}
  public Data __updateDependent_Data(java.util.Map map, String position) {
    map.put("dep_" + position + "_" + "Data" + "_p", Data.this.p);
    map.put("fixedThis_" + position, this);
    return this;
  }
  public Data __castAs_Data(Object p) {
    final Object _p = Data.this.p;
    if (_p.equals("WorldOwner") && p.equals("WorldOwner")) { /* it's ok */}
     else if (p.equals("UnknownOwner")) { /* it's ok */}
     else if (p != _p) { throw new Error("Owner parameter equality error") ;}
    return this;
  }
  Data(Object p) {
    super();
    this.p = p;
  }
}
class Link {
  final private Object owner;
  final private Object d;
  public Object __owner(){ return Link.this.owner;}
  public Link __updateDependent_Link(java.util.Map map, String position) {
    map.put("dep_" + position + "_" + "Link" + "_owner", Link.this.owner);
    map.put("dep_" + position + "_" + "Link" + "_d", Link.this.d);
    map.put("fixedThis_" + position, this);
    return this;
  }
  public Link __castAs_Link(Object owner, Object d) {
    final Object _owner = Link.this.owner;
    if (_owner.equals("WorldOwner") && owner.equals("WorldOwner")) { /* it's ok */}
     else if (owner.equals("UnknownOwner")) { /* it's ok */}
     else if (owner != _owner) { throw new Error("Owner parameter equality error") ;}
    final Object _d = Link.this.d;
    if (_d.equals("WorldOwner") && d.equals("WorldOwner")) { /* it's ok */}
     else if (d.equals("UnknownOwner")) { /* it's ok */}
     else if (d != _d) { throw new Error("Owner parameter equality error") ;}
    return this;
  }
  public Link __safeUpdate_next(Link o) {
    if (o == null) return o;
    boolean result;
    try { result = this.__insideOwnerOf(o); } catch (Exception e) {throw new Error("Unexpected error in the method __insideOwnerOf()");}
    if (result) return (this.next = o); else throw new Error("Ownership invariant violation");
  }
  public Data __safeUpdate_data(Data o) {
    if (o == null) return o;
    boolean result;
    try { result = this.__insideOwnerOf(o); } catch (Exception e) {throw new Error("Unexpected error in the method __insideOwnerOf()");}
    if (result) return (this.data = o); else throw new Error("Ownership invariant violation");
  }
  private boolean __insideOwnerOf(Object o) throws java.lang.IllegalAccessException, java.lang.ClassNotFoundException, java.lang.reflect.InvocationTargetException {
    java.lang.reflect.Method m;
    try {m = o.getClass().getMethod("__owner", new Class[0]);} catch (NoSuchMethodException e) {return true; /* o's owner is world (implicitly) */}
    Object result = m.invoke(o, new Object[0]); // get o's owner
    if (result == this) return true; // reflexivity
    if (result.equals("WorldOwner")) return true; // o's owner is world (explicitly)
    Object myOwner = this.__owner();  // my owner -- to check via transitivity
    if (myOwner == result || myOwner == o) return true;
    java.lang.reflect.Method m1;
    try {m1 = myOwner.getClass().getMethod("__owner", new Class[0]);} catch (NoSuchMethodException e) {return false; /* o's owner is not world, but this is world */}
    java.lang.reflect.Method insideOwner;
    try {insideOwner = myOwner.getClass().getMethod("__insideOwnerOf", new Class[]{Class.forName("java.lang.Object")});} catch (NoSuchMethodException e) {return false;}
    Object[] ownerArgs = new Object[]{result};
    if (insideOwner != null) return ((Boolean)insideOwner.invoke(myOwner, ownerArgs)).booleanValue(); // transitivity
    return false; // failed check
  }
  Link next;
  Data data;
  Link(Object owner, Object d, Link next, Data data) {
    super();
    this.owner = owner;
    this.d = d;
    this.__safeUpdate_next(next);
    this.__safeUpdate_data(data);
  }
}
class List {
  final private Object owner;
  final private Object data;
  public Object __owner(){ return List.this.owner;}
  public List __updateDependent_List(java.util.Map map, String position) {
    map.put("dep_" + position + "_" + "List" + "_owner", List.this.owner);
    map.put("dep_" + position + "_" + "List" + "_data", List.this.data);
    map.put("fixedThis_" + position, this);
    return this;
  }
  public List __castAs_List(Object owner, Object data) {
    final Object _owner = List.this.owner;
    if (_owner.equals("WorldOwner") && owner.equals("WorldOwner")) { /* it's ok */}
     else if (owner.equals("UnknownOwner")) { /* it's ok */}
     else if (owner != _owner) { throw new Error("Owner parameter equality error") ;}
    final Object _data = List.this.data;
    if (_data.equals("WorldOwner") && data.equals("WorldOwner")) { /* it's ok */}
     else if (data.equals("UnknownOwner")) { /* it's ok */}
     else if (data != _data) { throw new Error("Owner parameter equality error") ;}
    return this;
  }
  public Link __safeUpdate_head(Link o) {
    if (o == null) return o;
    boolean result;
    try { result = this.__insideOwnerOf(o); } catch (Exception e) {throw new Error("Unexpected error in the method __insideOwnerOf()");}
    if (result) return (this.head = o); else throw new Error("Ownership invariant violation");
  }
  private boolean __insideOwnerOf(Object o) throws java.lang.IllegalAccessException, java.lang.ClassNotFoundException, java.lang.reflect.InvocationTargetException {
    java.lang.reflect.Method m;
    try {m = o.getClass().getMethod("__owner", new Class[0]);} catch (NoSuchMethodException e) {return true; /* o's owner is world (implicitly) */}
    Object result = m.invoke(o, new Object[0]); // get o's owner
    if (result == this) return true; // reflexivity
    if (result.equals("WorldOwner")) return true; // o's owner is world (explicitly)
    Object myOwner = this.__owner();  // my owner -- to check via transitivity
    if (myOwner == result || myOwner == o) return true;
    java.lang.reflect.Method m1;
    try {m1 = myOwner.getClass().getMethod("__owner", new Class[0]);} catch (NoSuchMethodException e) {return false; /* o's owner is not world, but this is world */}
    java.lang.reflect.Method insideOwner;
    try {insideOwner = myOwner.getClass().getMethod("__insideOwnerOf", new Class[]{Class.forName("java.lang.Object")});} catch (NoSuchMethodException e) {return false;}
    Object[] ownerArgs = new Object[]{result};
    if (insideOwner != null) return ((Boolean)insideOwner.invoke(myOwner, ownerArgs)).booleanValue(); // transitivity
    return false; // failed check
  }
  Link head;
  void add(Data d) {
    this.__safeUpdate_head(new Link(List.this, List.this.data, head, d));
  }
  Iterator makeIterator() {
    return new Iterator(List.this, List.this.data, head);
  }
  List(Object owner, Object data) {
    super();
    this.owner = owner;
    this.data = data;
  }
}
class Iterator {
  final private Object o;
  final private Object d;
  public Object __owner(){ return Iterator.this.o;}
  public Iterator __updateDependent_Iterator(java.util.Map map, String position) {
    map.put("dep_" + position + "_" + "Iterator" + "_o", Iterator.this.o);
    map.put("dep_" + position + "_" + "Iterator" + "_d", Iterator.this.d);
    map.put("fixedThis_" + position, this);
    return this;
  }
  public Iterator __castAs_Iterator(Object o, Object d) {
    final Object _o = Iterator.this.o;
    if (_o.equals("WorldOwner") && o.equals("WorldOwner")) { /* it's ok */}
     else if (o.equals("UnknownOwner")) { /* it's ok */}
     else if (o != _o) { throw new Error("Owner parameter equality error") ;}
    final Object _d = Iterator.this.d;
    if (_d.equals("WorldOwner") && d.equals("WorldOwner")) { /* it's ok */}
     else if (d.equals("UnknownOwner")) { /* it's ok */}
     else if (d != _d) { throw new Error("Owner parameter equality error") ;}
    return this;
  }
  public Link __safeUpdate_current(Link o) {
    if (o == null) return o;
    boolean result;
    try { result = this.__insideOwnerOf(o); } catch (Exception e) {throw new Error("Unexpected error in the method __insideOwnerOf()");}
    if (result) return (this.current = o); else throw new Error("Ownership invariant violation");
  }
  private boolean __insideOwnerOf(Object o) throws java.lang.IllegalAccessException, java.lang.ClassNotFoundException, java.lang.reflect.InvocationTargetException {
    java.lang.reflect.Method m;
    try {m = o.getClass().getMethod("__owner", new Class[0]);} catch (NoSuchMethodException e) {return true; /* o's owner is world (implicitly) */}
    Object result = m.invoke(o, new Object[0]); // get o's owner
    if (result == this) return true; // reflexivity
    if (result.equals("WorldOwner")) return true; // o's owner is world (explicitly)
    Object myOwner = this.__owner();  // my owner -- to check via transitivity
    if (myOwner == result || myOwner == o) return true;
    java.lang.reflect.Method m1;
    try {m1 = myOwner.getClass().getMethod("__owner", new Class[0]);} catch (NoSuchMethodException e) {return false; /* o's owner is not world, but this is world */}
    java.lang.reflect.Method insideOwner;
    try {insideOwner = myOwner.getClass().getMethod("__insideOwnerOf", new Class[]{Class.forName("java.lang.Object")});} catch (NoSuchMethodException e) {return false;}
    Object[] ownerArgs = new Object[]{result};
    if (insideOwner != null) return ((Boolean)insideOwner.invoke(myOwner, ownerArgs)).booleanValue(); // transitivity
    return false; // failed check
  }
  Link current;
  Iterator(Object o, Object d, Link first) {
    super();
    this.o = o;
    this.d = d;
    this.__safeUpdate_current(first);
  }
  void next() {
    this.__safeUpdate_current(current.next);
  }
  Data elem() {
    return current.data;
  }
  boolean done() {
    return (current == null);
  }
}
class Main {
  public List __safeUpdate_list(List o) {
    if (o == null) return o;
    boolean result;
    try { result = this.__insideOwnerOf(o); } catch (Exception e) {throw new Error("Unexpected error in the method __insideOwnerOf()");}
    if (result) return (this.list = o); else throw new Error("Ownership invariant violation");
  }
  private boolean __insideOwnerOf(Object o) throws java.lang.IllegalAccessException, java.lang.ClassNotFoundException, java.lang.reflect.InvocationTargetException {
    java.lang.reflect.Method m;
    try {m = o.getClass().getMethod("__owner", new Class[0]);} catch (NoSuchMethodException e) {return true; /* o's owner is world (implicitly) */}
    Object result = m.invoke(o, new Object[0]); // get o's owner
    if (result == this) return true; // reflexivity
    if (result.equals("WorldOwner")) return true; // o's owner is world (explicitly)
    return false; // failed check
  }
  List list;
  public Main() {
    super();
    this.__safeUpdate_list(new List(Main.this, "WorldOwner"));
  }
  void populate() {
    list.add(new Data("WorldOwner"));
    list.add(new Data("WorldOwner"));
  }
  static void main() {
    Main main = new Main();
    main.populate();
  }
}