package owners;

import AST.BytecodeParser;
import AST.CompilationUnit;
import AST.Frontend;
import AST.Problem;
import org.junit.Assert;

import java.util.Collection;

/**
 * @author ilyas
 */
public abstract class BasicTestHelper extends Frontend {

  protected final BasicTestCase.ResultHelper myResultHelper;

  public BasicTestHelper(BasicTestCase.ResultHelper result) {
    this.myResultHelper = result;
  }

  public boolean compile(String args[]) {
    return process(
        args,
        new BytecodeParser(),
        new AST.JavaParser() {
          parser.JavaParser parser = new parser.JavaParser();

          public CompilationUnit parse(java.io.InputStream is, String fileName) throws java.io.IOException, beaver.Parser.Exception {
            return parser.parse(is, fileName);
          }
        }
    );
  }

  protected String dumpErrors(Collection errors) {
    final StringBuffer buffer = new StringBuffer();
    for (Object error : errors) {
      if (error instanceof Problem) {
        Problem problem = (Problem) error;
        String msg = problem.line() + ":" + problem.column() + ":" + problem.message();
        buffer.append(msg).append("\n");
      }
    }
    return buffer.toString();
  }

  protected String dumpWarnings(Collection warnings) {
    final StringBuffer buffer = new StringBuffer();
    for (Object error : warnings) {
      if (error instanceof Problem) {
        Problem problem = (Problem) error;
        String msg = problem.line() + ":" + problem.column() + ":" + problem.message();
        buffer.append(msg).append("\n");
      }
    }
    return buffer.toString();
  }

  protected void checkResult(String result) {
    if (result != null) {
      final String expected = myResultHelper.getResult();
      Assert.assertEquals(result, expected.trim(), result.trim());
    }
  }

  abstract protected void processErrors(Collection errors, CompilationUnit unit);

  abstract protected void processNoErrors(CompilationUnit unit);
}
