package pratice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPageTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\0014HO744\\Desktop\\eclipse-workspace\\SeleniumTraining\\Driver\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\0014HO744\\Desktop\\eclipse-workspace\\SeleniumTraining\\Driver\\geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/");
		System.out.println(driver.getTitle());
		if(driver.getTitle().equals("Welcome: Mercury Tours")) {
	    	System.out.println("Title is correct");
	    }
	    else
	    {
	    	System.out.println("Tiltle is wrong");
	    }
		String text=driver.findElement(By.xpath("//b[contains(text(),'Jul 6, 2017')]")).getText();
	    System.out.println(text);
	    System.out.println(driver.getCurrentUrl());
	    driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("rekhachaurasiya1992@gmail.com");
	    driver.findElement(By.name("password")).sendKeys("Test@123");
	    driver.findElement(By.xpath("//input[@value='Submit']")).click();
	    String succMsg=driver.findElement(By.xpath("//h3[contains(text(),'Login Successfully')]")).getText();
	    System.out.println(succMsg);
	    System.out.println(driver.getTitle());
	    if(driver.getTitle().equals("Login: Mercury Tours")) {
	    	System.out.println("Title is correct");
	    }
	    else
	    {
	    	System.out.println("Tiltle is wrong");
	    }
	    File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshot, new File("C:\\Users\\0014HO744\\Desktop\\eclipse-workspace\\SeleniumTraining\\Screenshot\\Images.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	   // System.out.println(driver.getPageSource());
	    driver.close();
	   // driver.quit();
	}

}
