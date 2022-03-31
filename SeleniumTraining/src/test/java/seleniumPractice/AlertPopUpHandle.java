package seleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\0014HO744\\Desktop\\eclipse-workspace\\SeleniumTraining\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get("http://demo.guru99.com/test/delete_customer.php");	
    driver.findElement(By.name("cusid")).sendKeys("12345");
    driver.findElement(By.name("submit")).click();
    Alert alt=driver.switchTo().alert();
    System.out.println(alt.getText());
    //alt.dismiss();
    alt.accept();
    System.out.println(driver.switchTo().alert().getText());
    driver.switchTo().alert().accept();
}
}
