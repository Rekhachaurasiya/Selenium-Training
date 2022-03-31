package MouseAction;


import org.testng.Assert;
import org.testng.annotations.Test;

import datadriven.BaseClass;
import seleniumPractice.LoginPagePageObject;


public class LoginPageTest extends BaseClass{
	
	@Test
	public void loginTest()
	{
		driver.get(baseUrl);
		LoginPagePageObject lp=new LoginPagePageObject(driver);
		lp.setUserName(userName);
		lp.setPassword(Password);
		lp.clickLoginBtn();
		Assert.assertEquals(driver.getTitle(), "Guru99 Bank Manager HomePage");
	}
	

}
