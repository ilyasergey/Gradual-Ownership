package owners.typeAnalysis;

import AST.CompilationUnit;
import org.junit.Assert;
import owners.BasicTestCase;
import owners.BasicTestHelper;

import java.util.Collection;

/**
 * @author ilyas
 */
public class TypeAnalysisHelper extends BasicTestHelper {
  public TypeAnalysisHelper(BasicTestCase.ResultHelper result) {
    super(result);
  }

  protected void processErrors(Collection errors, CompilationUnit unit) {
    final String actual = dumpErrors(errors).trim();
    final String expected = myResultHelper.getResult().trim();
    Assert.assertEquals(actual, expected, actual);
  }

  @Override
  protected void processWarnings(Collection warnings, CompilationUnit unit) {
    // do nothing
  }

  protected void processNoErrors(CompilationUnit unit) {
    Assert.assertTrue(true);
  }

}
