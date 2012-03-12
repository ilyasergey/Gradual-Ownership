package owners.lookup;

import org.junit.Test;
import owners.BasicTestCase;
import owners.BasicTestHelper;

/**
 * @author ilyas
 */
public class LookupTest extends BasicTestCase {

  private static final String DATA_PATH = System.getProperty("user.dir") + "/testdata/lookup/";

  public String getDataPath() {
    return DATA_PATH;
  }

  @Override
  public BasicTestHelper getHelper(ResultHelper resultHelper) {
    return new LookupTestHelper(resultHelper);
  }

  @Test
  public void testTrivial() {
    doSimpleTest();
  }

  @Test
  public void testLookup1() {
    doSimpleTest();
  }

  @Test
  public void testLkpErr1() {
    doSimpleTest();
  }

  @Test
  public void testLkpMany() {
    doSimpleTest();
  }

  @Test
  public void testLkpThis() {
    doSimpleTest();
  }

  @Test
  public void testMethodParam() {
    doSimpleTest();
  }

  @Test
  public void testMethodParamErr1() {
    doSimpleTest();
  }

  @Test
  public void testMethodParamErr2() {
    doSimpleTest();
  }

  @Test
  public void testBlockVar() {
    doSimpleTest();
  }

  @Test
  public void testBlockVarErr1() {
    doSimpleTest();
  }

  @Test
  public void testField() {
    doSimpleTest();
  }

  @Test
  public void testInner() {
    doSimpleTest();
  }

  @Test
  public void testStatic() {
    doSimpleTest();
  }

}
