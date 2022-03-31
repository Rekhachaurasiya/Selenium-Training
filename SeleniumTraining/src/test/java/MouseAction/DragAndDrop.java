package MouseAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\0014HO744\\Desktop\\eclipse-workspace\\SeleniumTraining\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		WebElement from=driver.findElement(By.xpath("(//a[@style='color:#FFFFFF;'])[5]"));
		WebElement to=driver.findElement(By.className("placeholder"));
		Actions act=new Actions(driver);
		Thread.sleep(3000);
		act.dragAndDrop(from, to).build().perform();
		Thread.sleep(3000);
		System.out.println("Successfully drag and dropped");
		WebElement from1=driver.findElement(By.xpath("(//a[@style='color:#FFFFFF;'])[6]"));
		WebElement to1=driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		act.dragAndDrop(from1, to1).build().perform();
		System.out.println("dragged successfully");
}
}
