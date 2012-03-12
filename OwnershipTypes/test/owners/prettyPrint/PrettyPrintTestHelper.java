package owners.prettyPrint;

import AST.CompilationUnit;
import owners.BasicTestCase;
import owners.BasicTestHelper;

import java.util.Collection;

/**
 * @author ilyas
 */
public class PrettyPrintTestHelper extends BasicTestHelper {

  public PrettyPrintTestHelper(BasicTestCase.ResultHelper result) {
    super(result);
  }

  protected void processErrors(Collection errors, CompilationUnit unit) {
    checkResult(unit.toString());
  }

  protected void processNoErrors(CompilationUnit unit) {
    checkResult(unit.toString());
  }

}
