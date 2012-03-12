package owners.typeWarnings;

import org.junit.Test;
import owners.BasicTestCase;
import owners.BasicTestHelper;

/**
 * @author ilyas
 */
public class TypeWarningsTest extends BasicTestCase {

  private static final String DATA_PATH = System.getProperty("user.dir") + "/testdata/warnings/";

  public String getDataPath() {
    return DATA_PATH;
  }

  @Override
  public BasicTestHelper getHelper(ResultHelper resultHelper) {
    return new TypeWarningsHelper(resultHelper);
  }

  @Test
  public void testDave() {
    doSimpleTest();
  }

  @Test
  public void testDaveRelaxed() {
    doSimpleTest();
  }

  @Test
  public void testMethod() {
    doSimpleTest();
  }

  @Test
  public void testMethod2() {
    doSimpleTest();
  }

  @Test
  public void testMethod3() {
    doSimpleTest();
  }

  @Test
  public void testCall() {
    doSimpleTest();
  }

  @Test
  public void testCall2() {
    doSimpleTest();
  }

  @Test
  public void testCall3() {
    doSimpleTest();
  }


}