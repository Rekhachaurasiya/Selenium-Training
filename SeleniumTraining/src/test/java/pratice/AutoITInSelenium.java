package pratice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoITInSelenium {
		
		public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\0014HO744\\Desktop\\eclipse-workspace\\SeleniumTraining\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		WebElement uploadfile=driver.findElement(By.id("uploadPicture"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", uploadfile);
		Thread.sleep(2000);
		//uploadfile.sendKeys("C:\\Users\\0014HO744\\Desktop\\AutoIT\\uploadfile.txt");
		
		driver.findElement(By.id("uploadPicture")).click();
		Thread.sleep(3000);
		
		Runtime.getRuntime().exec("C:\\Users\\0014HO744\\Documents\\UploadFile.exe");
        driver.close();
		}
}
