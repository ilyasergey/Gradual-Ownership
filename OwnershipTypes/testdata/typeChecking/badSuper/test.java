interface I/*<owner1>*/ {}
interface J {}

class E {}

class D/*<owner>*/ extends E implements I/*<owner>*/, J {}