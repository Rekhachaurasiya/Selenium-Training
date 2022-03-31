package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import datadriven.BaseClass;

public class LoginPagePageObject extends BaseClass {
	public static WebDriver driver;
	
	@FindBy(xpath="//input[@name='uid']")
	WebElement userName;
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	@FindBy(name="btnLogin")
	@CacheLookup
	WebElement btnLogin;
	
	public LoginPagePageObject(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setUserName(String uName) {
		userName.sendKeys(uName);
	}
	public void setPassword(String pass) {
		password.sendKeys(pass);
	}
	public void clickLoginBtn() {
		btnLogin.click();
	}
	
	

}
