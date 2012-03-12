package owners.transfrom;

import AST.CompilationUnit;
import org.junit.Assert;
import owners.BasicTestCase;
import owners.BasicTestHelper;

import java.util.Collection;

/**
 * @author ilyas
 */
public class TransformTestHelper extends BasicTestHelper {

  public TransformTestHelper(BasicTestCase.ResultHelper result) {
    super(result);
  }

  protected void processErrors(Collection errors, CompilationUnit unit) {
    final String actual = dumpErrors(errors).trim();
    System.out.println(actual);
    Assert.assertTrue(false);
  }

  @Override
  protected void processWarnings(Collection warnings, CompilationUnit unit) {
    // do nothing
  }

  @Override
  protected void checkResult(String result) {
    if (result != null) {
      final String expected = myResultHelper.getResult().trim().replaceAll("\\s+\\n", "\n");
      final String newResult = result.trim().replaceAll("\\s+\\n", "\n");
      Assert.assertEquals(result, expected, newResult);
    }
  }

  protected void processNoErrors(CompilationUnit unit) {
    checkResult(unit.toStringTransform());
  }

}
