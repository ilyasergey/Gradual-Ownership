package owners.typeAnalysis;

import org.junit.Test;
import owners.BasicTestCase;
import owners.BasicTestHelper;

/**
 * @author ilyas
 */
public class TypeAnalysisTest extends BasicTestCase {

  private static final String DATA_PATH = System.getProperty("user.dir") + "/testdata/typeAnalysis/";

  public String getDataPath() {
    return DATA_PATH;
  }

  @Override
  public BasicTestHelper getHelper(ResultHelper resultHelper) {
    return new TypeAnalysisHelper(resultHelper);
  }

  @Test
  public void testVar1() {
    doSimpleTest();
  }

  @Test
  public void testField1() {
    doSimpleTest();
  }

  @Test
  public void testDep1() {
    doSimpleTest();
  }

  @Test
  public void testChain1() {
    doSimpleTest();
  }

  @Test
  public void testPropagate() {
    doSimpleTest();
  }

  @Test
  public void testPropagate2() {
    doSimpleTest();
  }

  @Test
  public void testThis() {
    doSimpleTest();
  }

  @Test
  public void testThis2() {
    doSimpleTest();
  }

  @Test
  public void testThis3() {
    doSimpleTest();
  }

  @Test
  public void testAssign() {
    doSimpleTest();
  }

  @Test
  public void testAssign2() {
    doSimpleTest();
  }

  @Test
  public void testAssign3() {
    doSimpleTest();
  }

  @Test
  public void testNull() {
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

  @Test
  public void testCast() {
    doSimpleTest();
  }

  @Test
  public void testDownCast() {
    doSimpleTest();
  }

  @Test
  public void testTernary() {
    doSimpleTest();
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
  public void testSome() {
    doSimpleTest();
  }

  @Test
  public void testAnonymous() {
    doSimpleTest();
  }

  @Test
  public void testAnonymous2() {
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
  public void testMethod() {
    doSimpleTest();
  }

  @Test
  public void testMethod2() {
    doSimpleTest();
  }

  @Test
  public void testParam() {
    doSimpleTest();
  }

  @Test
  public void testParam2() {
    doSimpleTest();
  }

  @Test
  public void testParam3() {
    doSimpleTest();
  }

  @Test
  public void testInner() {
    doSimpleTest();
  }

  @Test
  public void testInner2() {
    doSimpleTest();
  }

  @Test
  public void testInner3() {
    doSimpleTest();
  }

  @Test
  public void testInner4() {
    doSimpleTest();
  }

  @Test
  public void testInner5() {
    doSimpleTest();
  }

  @Test
  public void testManifest1() {
    doSimpleTest();
  }

  @Test
  public void testSubtype() {
    doSimpleTest();
  }

  @Test
  public void testManifestWorld() {
    doSimpleTest();
  }

  @Test
  public void testManifest2() {
    doSimpleTest();
  }


}
