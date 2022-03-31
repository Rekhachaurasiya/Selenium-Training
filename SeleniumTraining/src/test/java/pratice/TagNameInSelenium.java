package pratice;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameInSelenium {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\0014HO744\\Desktop\\eclipse-workspace\\SeleniumTraining\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.geeksforgeeks.org/locating-multiple-elements-in-selenium-python/");
		List<WebElement> urls=driver.findElements(By.tagName("a"));
		System.out.println(urls.size());
		Iterator<WebElement> itr=urls.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
