package seleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrolltheWindow {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\0014HO744\\Desktop\\eclipse-workspace\\SeleniumTraining\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.hyundaiusa.com/us/en");
		driver.findElement(By.xpath("//input[@inputmode='numeric']")).sendKeys("92708");
 		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
 		Thread.sleep(3000);
 		driver.findElement(By.xpath("//button[contains(text(),'Accept & Close')]")).click();
 		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,1000);", "");
//		Thread.sleep(3000);
//		js.executeScript("window.scrollBy(0,-1000);", "");
		WebElement scroll=driver.findElement(By.xpath("//span[contains(text(),'Help me choose a model')]"));
		js.executeScript("arguments[0].scrollIntoView(true);", scroll);
		System.out.println("scrolled successfully");
	}

}
