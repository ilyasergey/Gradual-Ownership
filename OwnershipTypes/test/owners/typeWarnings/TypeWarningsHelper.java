package owners.typeWarnings;

import AST.CompilationUnit;
import org.junit.Assert;
import owners.BasicTestCase;
import owners.BasicTestHelper;
import owners.typeAnalysis.TypeAnalysisHelper;

import java.util.Collection;

/**
 * @author ilyas
 */
public class TypeWarningsHelper extends BasicTestHelper {
  public TypeWarningsHelper(BasicTestCase.ResultHelper result) {
    super(result);
  }

  protected void processErrors(Collection errors, CompilationUnit unit) {
    if (!errors.isEmpty()) {
      System.err.println(dumpErrors(errors));
    }
    Assert.assertTrue(errors.isEmpty());
  }

  @Override
  protected void processWarnings(Collection warnings, CompilationUnit unit) {
    final String actual = dumpErrors(warnings).trim();
    final String expected = myResultHelper.getResult().trim();
    Assert.assertEquals(actual, expected, actual);
  }

  protected void processNoErrors(CompilationUnit unit) {
    Assert.assertTrue(true);
  }

}
