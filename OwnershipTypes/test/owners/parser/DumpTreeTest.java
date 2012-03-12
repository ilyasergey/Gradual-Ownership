package owners.parser;

import org.junit.Test;
import owners.BasicTestCase;
import owners.BasicTestHelper;

/**
 * @author ilyas
 */
public class DumpTreeTest extends BasicTestCase {

  private static final String DATA_PATH = System.getProperty("user.dir") + "/testdata/parser/";

  public String getDataPath() {
    return DATA_PATH;
  }

  @Override
  public BasicTestHelper getHelper(ResultHelper resultHelper) {
    return new DumpTreeHelper(resultHelper);
  }

  @Test
  public void testSimple1() {
    doSimpleTest();
  }

  @Test
  public void testOwn1() {
    doSimpleTest();
  }

  @Test
  public void testWorld() {
    doSimpleTest();
  }

  @Test
  public void testOwnParam() {
    doSimpleTest();
  }

  @Test
  public void testOwnParam2() {
    doSimpleTest();
  }

  @Test
  public void testAssign() {
    doSimpleTest();
  }

  @Test
  public void testSimple2() {
    doSimpleTest();
  }


}
