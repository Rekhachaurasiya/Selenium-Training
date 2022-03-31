package pratice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePicker {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\0014HO744\\Desktop\\eclipse-workspace\\SeleniumTraining\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/automation-practice-form");
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor)driver; 
		js.executeScript("window.scrollBy(0,400);", "");
		driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).click();
		List<WebElement> count=driver.findElements(By.xpath("//div[@class='react-datepicker__month-container']"));
		Select yearSelect=new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")));
		yearSelect.selectByVisibleText("1992");
     	Select montSelect=new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")));
     	montSelect.selectByVisibleText("October");
    	driver.findElement(By.xpath("//div[contains(text(),'10')]")).click();
	
	}
}