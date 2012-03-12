// Gradual ownership types
<YYINITIAL> {
  "world"                       { return sym(Terminals.WORLD); }
  "/*<"                         { return sym(Terminals.LOWN); }
  ">*/"                         { return sym(Terminals.ROWN); }
}