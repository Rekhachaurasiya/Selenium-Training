package pratice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleWindos {
			public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\0014HO744\\Desktop\\eclipse-workspace\\SeleniumTraining\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.hyundaiusa.com/us/en");
		    driver.findElement(By.xpath("//input[@inputmode='numeric']")).sendKeys("92708");
     		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
     		driver.findElement(By.xpath("//span[contains(text(),'Huntington Beach Hyundai')]")).click();
    		driver.findElement(By.xpath("//a[@aria-label='Get directions Huntington Beach Hyundai']")).click();

			String parent=driver.getWindowHandle();
			Set<String>s=driver.getWindowHandles();
			Iterator<String> I1= s.iterator();
			while(I1.hasNext())
			{
			String child_window=I1.next();	
			if(!parent.equals(child_window))
			{
			driver.switchTo().window(child_window);

			System.out.println(driver.switchTo().window(child_window).getTitle());

			//driver.close();
			}
			}
			driver.switchTo().window(parent);
			System.out.println(driver.getTitle());
			
			}
	}





