package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;


public class LoginPageTest extends BaseClass{
  @Test
  public void checkLogin() {
	 /* WebElement username=driver.findElement(By.id("loginform-username"));
	  username.sendKeys("carol");
	  WebElement password=driver.findElement(By.id("loginform-password"));
	  password.sendKeys("1q2w3e4r");
	  WebElement submit=driver.findElement(By.name("login-button"));
	  submit.click();*/
	 LoginPage login =new LoginPage(driver); 
	 login.enterUserNameandPassword("carol","1q2w3e4r");
	 login.clickLogin();
	 
	System.out.println(driver.getTitle());
	 
	 
	/* String expected="Payroll Application"; //this is for ASSERTION check
	 String actual=driver.getTitle();
	 Assert.assertEquals(actual, expected, "expected and actual title are different");*/
	
	//Assert.assertEquals(driver.getTitle(), "Login", "expected and actual title are different");
  
  boolean isdashboardisloaded=login.ishomepageisLoaded();
  Assert.assertTrue(isdashboardisloaded, "Dashboard not displayed");
  
  }
}
