package owners;

import junit.framework.Assert;
import junit.framework.TestCase;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author ilyas
 */
public abstract class BasicTestCase extends TestCase {
  public final String TEST_FILE = "/test.java";

  abstract public String getDataPath();

  abstract public BasicTestHelper getHelper(ResultHelper resultHelper);

  public void doSimpleTest() {
    final String folder = getTestName();
    final String filePath = getDataPath() + folder + TEST_FILE;
    String[] args = {filePath};
    try {
      doTest(folder, args);
    } catch (Exception e) {
      e.printStackTrace();
      Assert.assertTrue(false);
    }
  }

  public void doTest(String folder, String[] args) {
    final String path = getDataPath() + folder + getResultFile();
    final ResultHelper resultHelper = new ResultHelper(path);
    final BasicTestHelper helper = getHelper(resultHelper);
    helper.compile(args);
  }

  protected String getResultFile() {
    return "/result.txt";
  }

  private String getTestName() {
    final String s = getName().substring(4);
    return s.substring(0, 1).toLowerCase() + s.substring(1);
  }

  // delayed result check
  public static class ResultHelper {
    final String myPath;

    public ResultHelper(String myPath) {
      this.myPath = myPath;
    }

    public String getResult() {
      File resultFile = new File(myPath);
      Assert.assertTrue(resultFile.exists());
      return getFileContents(resultFile).toString();
    }

    private StringBuilder getFileContents(File file) {
      StringBuilder contents = new StringBuilder();
      try {
        BufferedReader input = new BufferedReader(new FileReader(file));
        try {
          String line;
          if ((line = input.readLine()) != null) {
            contents.append(line);
          }
          while ((line = input.readLine()) != null) {
            contents.append(System.getProperty("line.separator"));
            contents.append(line);
          }
        } finally {
          input.close();
        }
      } catch (IOException ex) {
        ex.printStackTrace();
      }
      return contents;
    }

  }
}
