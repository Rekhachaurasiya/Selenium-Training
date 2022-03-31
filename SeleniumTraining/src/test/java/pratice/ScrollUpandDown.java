package pratice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpandDown {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\0014HO744\\Desktop\\eclipse-workspace\\SeleniumTraining\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.toolsqa.com/selenium-webdriver/selenium-interview-questions-part-1/");
    JavascriptExecutor js=(JavascriptExecutor)driver;
    js.executeScript("window.scrollBy(0,500)", "");
//   WebElement scroll= driver.findElement(By.xpath("//strong[text()='Ques 13) How do you upload a file?']"));
//    js.executeScript("arguments[0].scrollIntoView(true);", scroll);
    System.out.println("Scrolled successfully");

}
}
