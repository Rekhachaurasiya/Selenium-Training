package pratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\0014HO744\\Desktop\\eclipse-workspace\\SeleniumTraining\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/drag_drop.html");					
        		
         WebElement From=driver.findElement(By.xpath("//*[@id='credit2']/a"));			
         WebElement To=driver.findElement(By.xpath("//*[@id='bank']/li"));						
         Actions act=new Actions(driver);				
         act.dragAndDrop(From, To).build().perform();	
         System.out.println("success");
	}		

	}


