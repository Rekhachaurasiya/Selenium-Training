package pratice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameSwitching {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\0014HO744\\Desktop\\eclipse-workspace\\SeleniumTraining\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/frames");
		List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
		System.out.println("The total number of iframes are " + iframeElements.size());
		WebDriver frametext=driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frame1']")));
		System.out.println(frametext.getCurrentUrl());
		System.out.println(frametext.getTitle());
		System.out.println("Switched on frame");

		//driver.switchTo().frame("frame name");
		//driver.switchTo().frame(driver.findElement(By.xpath("element")));
		
        
    
			
   }
	}


