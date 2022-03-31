package pratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\0014HO744\\Desktop\\eclipse-workspace\\SeleniumTraining\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.get("http://demo.guru99.com/test/delete_customer.php");	
		 driver.findElement(By.name("cusid")).sendKeys("53920");					
	        driver.findElement(By.name("submit")).submit();	
	        Alert alert = driver.switchTo().alert();		   
	        String alertMessage= driver.switchTo().alert().getText();			
	        System.out.println(alertMessage);	
	        Thread.sleep(5000);
	        		
	        alert.dismiss();		
		
	}

}
