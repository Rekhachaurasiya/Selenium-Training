package pratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker1 {
	public static void main(String[] args) throws InterruptedException {
		String month="October 2024";
		String day="31";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\0014HO744\\Desktop\\eclipse-workspace\\SeleniumTraining\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://www.phptravels.net/");
        driver.findElement(By.cssSelector("#hotels-tab")).click();
        driver.findElement(By.cssSelector(".checkin.form-control.form-control-lg.border-top-r0")).click();
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,300)", "");
        Thread.sleep(3000);

          while(true)
          {
        	String monthAndYear=driver.findElement(By.xpath("//th[@class='switch']")).getText();
        	System.out.println(monthAndYear);
        if(monthAndYear.equals(month)) 
             {
        	break;
              }
        else
        {
        	driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[3]/div[1]/table/thead/tr[1]/th[3]")).click();
        	
        }
        }
        driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[3]/div[1]/table/tbody/tr/td[contains(text(),"+day+")]")).click();
}
}
