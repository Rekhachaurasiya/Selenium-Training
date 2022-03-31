package pratice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\0014HO744\\Desktop\\eclipse-workspace\\SeleniumTraining\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.hyundaiusa.com/us/en");
	    driver.findElement(By.xpath("//input[@inputmode='numeric']")).sendKeys("92708");
 		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
 		driver.findElement(By.xpath("//span[contains(text(),'Huntington Beach Hyundai')]")).click();
 		Thread.sleep(3000);
 		driver.findElement(By.xpath("//a[@aria-label='Get directions Huntington Beach Hyundai']")).click();
 		Thread.sleep(3000);
 		driver.findElement(By.xpath("//a[@class='button button-navy']")).click();
		
		Set<String> winhandles=driver.getWindowHandles();
//		Iterator<String> itr=winhandles.iterator();
//		String firstWindow=itr.next();
//		String secondWindow=itr.next();
//		String thirdwindow=itr.next();
//		System.out.println(driver.getTitle());
//		driver.switchTo().window(secondWindow);
//		System.out.println(driver.getTitle());
//		driver.switchTo().window(thirdwindow);
//		System.out.println(driver.getTitle());
		
		for(String winHandle:winhandles) {
			driver.switchTo().window(winHandle);
			String title=driver.getTitle();
			if(title.contains("Your location to 16751 Beach Blvd - Google Maps")||title.contains("New 2019-2020 Hyundai Cars and SUVs for Sale Orange County | Huntington Beach Hyundai")) {
				String title1=driver.getTitle();
				driver.close();	
			}
		}
	}

	

}
