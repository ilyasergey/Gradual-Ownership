package owners.typeChecking;

import AST.CompilationUnit;
import org.junit.Assert;
import owners.BasicTestCase;
import owners.BasicTestHelper;
import owners.lookup.LookupTestHelper;

import java.util.Collection;

/**
 * @author ilyas
 */
public class TypeCheckingHelper extends BasicTestHelper {

  private static final String BAD_LINEARIZATION = "bad linearization";

  public TypeCheckingHelper(BasicTestCase.ResultHelper result) {
    super(result);
  }

  protected void processErrors(Collection errors, CompilationUnit unit) {
    final String actual = dumpErrors(errors);
    final String expected = myResultHelper.getResult().trim();
    if (actual.contains("is not consistent with another base type") &&
        actual.contains("The base type")) {
      Assert.assertEquals(actual, expected, BAD_LINEARIZATION);
    } else {
      Assert.assertEquals(actual, expected, actual.trim());
    }
  }

  protected void processNoErrors(CompilationUnit unit) {
    checkResult(unit.toString());
  }

}