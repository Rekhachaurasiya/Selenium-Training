package pratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionInSelenium {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\0014HO744\\Desktop\\eclipse-workspace\\SeleniumTraining\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/menu/");
		Actions actions = new Actions(driver);
    	WebElement Overhover = driver.findElement(By.xpath("//a[text()='Main Item 2']"));
    	actions.moveToElement(Overhover).perform();
    	System.out.println("Done Mouse hover on 'main item2' from Menu");
    	WebElement subMenuOption = driver.findElement(By.xpath("//a[text()='SUB SUB LIST »']")); 
    	actions.moveToElement(subMenuOption).perform();
    	System.out.println("Done Mouse hover on 'sub list' from Menu");
    	WebElement selectMenuOption = driver.findElement(By.xpath("//a[text()='Sub Sub Item 2']"));
    	selectMenuOption.click();
    	System.out.println("Selected 'Alternative' from Menu");
    	driver.close();
 }
	}

