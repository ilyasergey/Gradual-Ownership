package owners.typeChecking;

import org.junit.Test;
import owners.BasicTestCase;
import owners.BasicTestHelper;

/**
 * @author ilyas
 */
public class TypeCheckingTest extends BasicTestCase {

  private static final String DATA_PATH = System.getProperty("user.dir") + "/testdata/typeChecking/";

  public String getDataPath() {
    return DATA_PATH;
  }

  @Override
  public BasicTestHelper getHelper(ResultHelper resultHelper) {
    return new TypeCheckingHelper(resultHelper);
  }

  @Test
  public void testUnknown() {
    doSimpleTest();
  }

  @Test
  public void testBadSuper() {
    doSimpleTest();
  }

  @Test
  public void testPreserveOwn() {
    doSimpleTest();
  }

  @Test
  public void testWrongNum() {
    doSimpleTest();
  }

  @Test
  public void testNewErr1() {
    doSimpleTest();
  }

  @Test
  public void testNewErr2() {
    doSimpleTest();
  }

  @Test
  public void testNewErr3() {
    doSimpleTest();
  }

  @Test
  public void testInside() {
    doSimpleTest();
  }

  @Test
  public void testTransitivity() {
    doSimpleTest();
  }

  @Test
  public void testTransitivityErr() {
    doSimpleTest();
  }

  @Test
  public void testImplicitUnknown() {
    doSimpleTest();
  }

  @Test
  public void testSupers() {
    doSimpleTest();
  }

  @Test
  public void testSupers2() {
    doSimpleTest();
  }

  @Test
  public void testGradSubErr() {
    doSimpleTest();
  }

  @Test
  public void testThis() {
    doSimpleTest();
  }

  @Test
  public void testClassInstance() {
    doSimpleTest();
  }

}