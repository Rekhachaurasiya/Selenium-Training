package pratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterForm {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\0014HO744\\Desktop\\eclipse-workspace\\SeleniumTraining\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/newtours/");
		String date=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[1]/td/font/b")).getText();
		System.out.println(date);
		driver.findElement(By.partialLinkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("Parvin");
		driver.findElement(By.name("lastName")).sendKeys("Makaandar");
		driver.findElement(By.name("phone")).sendKeys("7387594360");
		driver.findElement(By.id("userName")).sendKeys("parvin.makaandar@gmail.com");
		
		Select country=new Select(driver.findElement(By.xpath("//select[@name='country']")));
		//country.selectByIndex(7);
		//country.selectByVisibleText("INDIA");
		country.selectByValue("CYPRUS");
		
		//driver.close();
	}
	

}
