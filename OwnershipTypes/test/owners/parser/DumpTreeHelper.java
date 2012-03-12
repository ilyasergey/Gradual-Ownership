package owners.parser;

import AST.CompilationUnit;
import owners.BasicTestCase;
import owners.BasicTestHelper;

import java.util.Collection;

/**
 * @author ilyas
 */
public class DumpTreeHelper extends BasicTestHelper {

  public DumpTreeHelper(BasicTestCase.ResultHelper result) {
    super(result);
  }

  protected void processErrors(Collection errors, CompilationUnit unit) {
    checkResult(unit.dumpTreeNoRewrite());
  }

  protected void processNoErrors(CompilationUnit unit) {
    checkResult(unit.dumpTree());
  }
}
