package testScript;

import org.testng.annotations.Test;

import pages.ClientPage;
import pages.HomePage;
import pages.LoginPage;

public class ClientPageTest extends BaseClass {
	HomePage hp;
	ClientPage cp;
  @Test
  public void searchClient() {
		 
	  LoginPage obj=new LoginPage(driver);
	  obj.enterUserNameandPassword("carol", "1q2w3e4r");
	  hp=obj.clickLogin();
	  cp=hp.clickClient();
	  
	  cp.enterClientid("3");
	  cp.enterClientname("Sam");
	  cp.clickSearch();
	/*  obj.clickLogin();
	 
	  ClientPage search = new ClientPage(driver);
	   search.clickClient();
	   search.enterClientname("Sam");
	   search.enterClientid("3");
	   search.clickSearch();*/
  }
}
