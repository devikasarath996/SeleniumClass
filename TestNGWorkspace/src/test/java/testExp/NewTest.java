package testExp;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
  @Test
  public void checkAnnotations() {
	  System.out.println("print annotations");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("this is before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("this is after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("this is before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("this is after test");
  }

}
