class D/*<o1, o2>*/ {

  public D/*<?, world>*/ foo(int i) {
    if (i > 1) {
      final D d = new D/*<this, world>*/();
      if (i > 2) {
        return d;
      }
    }
    return null;
  }

}