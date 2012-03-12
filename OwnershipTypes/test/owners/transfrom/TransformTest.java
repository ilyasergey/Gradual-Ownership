package owners.transfrom;

import org.junit.Test;
import owners.BasicTestCase;
import owners.BasicTestHelper;

/**
 * @author ilyas
 */
public class TransformTest extends BasicTestCase {

  private static final String DATA_PATH = System.getProperty("user.dir") + "/testdata/transform/";

  public String getDataPath() {
    return DATA_PATH;
  }

  @Override
  public BasicTestHelper getHelper(ResultHelper resultHelper) {
    return new TransformTestHelper(resultHelper);
  }

  @Override
  protected String getResultFile() {
    return "/result.java";
  }

  @Test
  public void testClass() {
    doSimpleTest();
  }

  @Test
  public void testClass2() {
    doSimpleTest();
  }

  @Test
  public void testClass3() {
    doSimpleTest();
  }

  @Test
  public void testInterface() {
    doSimpleTest();
  }

  @Test
  public void testNew() {
    doSimpleTest();
  }

  @Test
  public void testSubtype() {
    doSimpleTest();
  }

  @Test
  public void testCall() {
    doSimpleTest();
  }

  @Test
  public void testDaveRelaxed() {
    doSimpleTest();
  }

  @Test
  public void testManifestWorld() {
    doSimpleTest();
  }

  @Test
  public void testClassInstance() {
    doSimpleTest();
  }

  @Test
  public void testDouble() {
    doSimpleTest();
  }

  @Test
  public void testChain() {
    doSimpleTest();
  }

  @Test
  public void testDependent() {
    doSimpleTest();
  }

  @Test
  public void testInner5() {
    doSimpleTest();
  }

  @Test
  public void testExample() {
    doSimpleTest();
  }

  @Test
  public void testAssign() {
    doSimpleTest();
  }

}
