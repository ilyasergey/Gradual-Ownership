package a.b.c;

interface D/*<owner, otherOwner>*/ {
  void foo(int i);
}

interface E/*<P>*/ extends  D/*<P, world>*/{
  void bar(String s);
}