import AST.*;

class OwnershipChecker extends Frontend {

  public static void main(String args[]) {
    compile(args);
  }

  public static boolean compile(String args[]) {
    return new OwnershipChecker().process(
        args,
        new BytecodeParser(),
        new JavaParser() {
          public CompilationUnit parse(java.io.InputStream is, String fileName) throws java.io.IOException, beaver.Parser.Exception {
            return new parser.JavaParser().parse(is, fileName);
          }
        }
    );
  }

  @Override
  protected void processNoErrors(CompilationUnit unit) {
    super.processNoErrors(unit);
    if (program.options().hasOption("-gen")) {
      unit.generateTranslatedFile();
    }
  }

  @Override
  protected void initOptions() {
    super.initOptions();
    Options options = program.options();
    options.addKeyOption("-gen");
  }

  protected void printUsage() {
    printVersion();
    System.out.println(
        "\n" + name() + "\n\n" +
        "Usage: java " + name() + " <options> <source files>\n" +
        "  -verbose                  Output messages about what the compiler is doing\n" +
        "  -gen                      Generate translated Java files with dynamic checks\n" +
        "  -classpath <path>         Specify where to find user class files\n" +
        "  -sourcepath <path>        Specify where to find input source files\n" +
        "  -bootclasspath <path>     Override location of bootstrap class files\n" +
        "  -extdirs <dirs>           Override location of installed extensions\n" +
        "  -d <directory>            Specify where to place generated class files\n" +
        "  -help                     Print a synopsis of standard options\n" +
        "  -version                  Print version information\n"
        );
  }


  protected String name() {
    return "JavaChecker with Gradual Ownership Types";
  }

  protected String version() {
    return "R20110709";
  }

  protected String url() {
    return "(http://to-be-defin.ed)";
  }

}
