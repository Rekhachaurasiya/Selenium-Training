package pratice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RobotInSelenium {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\0014HO744\\Desktop\\eclipse-workspace\\SeleniumTraining\\Driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://vyaparapp.in/?referrer_code=GCOMP&gclid=Cj0KCQiAi9mPBhCJARIsAHchl1x_UEa2gx9c-yTNC9X8ynda5lGhkQvXINiplzbPXDJWeLYdRKVM6gIaAp4HEALw_wcB");
        driver.findElement(By.id("homepage-desktop-download-btn")).click();	
        Robot robot = new Robot();	
        Thread.sleep(2000); 
        robot.keyPress(KeyEvent.VK_DOWN); 
        
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_TAB);	
        Thread.sleep(2000);	
        robot.keyPress(KeyEvent.VK_TAB);	
        Thread.sleep(2000);	
        robot.keyPress(KeyEvent.VK_TAB);	
        Thread.sleep(2000);	
        robot.keyPress(KeyEvent.VK_ENTER);	
		
	}
}
