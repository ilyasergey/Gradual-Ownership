package owners.lookup;

import AST.CompilationUnit;
import org.junit.Assert;
import owners.BasicTestCase;
import owners.BasicTestHelper;

import java.util.Collection;

/**
 * @author ilyas
 */
public class LookupTestHelper extends BasicTestHelper {

  public LookupTestHelper(BasicTestCase.ResultHelper result) {
    super(result);
  }

  protected void processErrors(Collection errors, CompilationUnit unit) {
    final String actual = dumpErrors(errors);
    final String expected = myResultHelper.getResult();
    Assert.assertEquals(actual, expected.trim(), actual.trim());
  }

  protected void processNoErrors(CompilationUnit unit) {
    Assert.assertTrue(true);
  }

  @Override
  protected void processWarnings(Collection warnings, CompilationUnit unit) {
    final String actual = dumpErrors(warnings);
    final String expected = myResultHelper.getResult();
    Assert.assertEquals(actual, expected.trim(), actual.trim());
    // do nothing
  }
}
