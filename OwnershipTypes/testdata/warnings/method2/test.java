class D/*<o1, o2>*/ {

  public D/*<o1, world>*/ foo(int i) {
    if (i > 1) {
      final D d = new D/*<o1, world>*/();
      if (i > 2) {
        return d;
      }
    }
    return null;
  }

}