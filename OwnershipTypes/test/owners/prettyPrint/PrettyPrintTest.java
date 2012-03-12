package owners.prettyPrint;

import org.junit.Test;
import owners.BasicTestCase;
import owners.BasicTestHelper;

/**
 * @author ilyas
 */
public class PrettyPrintTest extends BasicTestCase {

  private static final String DATA_PATH = System.getProperty("user.dir") + "/testdata/prettyPrint/";

  public String getDataPath() {
    return DATA_PATH;
  }

  @Override
  public BasicTestHelper getHelper(ResultHelper resultHelper) {
    return new PrettyPrintTestHelper(resultHelper);
  }

  @Test
  public void testPretty1() {
    doSimpleTest();
  }

  @Test
  public void testParams() {
    doSimpleTest();
  }

  @Test
  public void testManifestClass() {
    doSimpleTest();
  }

  @Test
  public void testManifestInterface() {
    doSimpleTest();
  }

}
