package MouseAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OverHover {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\0014HO744\\Desktop\\eclipse-workspace\\SeleniumTraining\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/menu/");
		Actions action=new Actions(driver);
		WebElement OverHover=driver.findElement(By.xpath("//a[text()='Main Item 2']"));
		action.moveToElement(OverHover).perform();
		Thread.sleep(3000);
		WebElement sublist=driver.findElement(By.xpath("//a[text()='SUB SUB LIST »']"));
		action.moveToElement(sublist).perform();
		driver.findElement(By.xpath("//a[text()='Sub Sub Item 2']")).click();
		System.out.println("Successfull");
	}

}
