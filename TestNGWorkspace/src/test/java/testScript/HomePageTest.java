package testScript;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;


public class HomePageTest extends BaseClass{
	HomePage hp;
  @Test
  public void checkLogout() {
	 
	  LoginPage obj=new LoginPage(driver);
	  obj.enterUserNameandPassword("carol", "1q2w3e4r");
	  
	  hp=obj.clickLogin();
	  hp.clickProfile();
	  hp.clickLogout();
	  /*obj.clickLogin();
	 
	  HomePage logout = new HomePage(driver);
	   logout.clickProfile();
	   logout.clickLogout();*/
	  
  }
}
