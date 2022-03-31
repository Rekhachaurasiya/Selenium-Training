package pratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\0014HO744\\Desktop\\eclipse-workspace\\SeleniumTraining\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/automation-practice-form");
	WebElement uploadElement = driver.findElement(By.xpath("//input[@id='uploadPicture']"));
	uploadElement.sendKeys("C:\\Users\\0014HO744\\Desktop\\uloadfile.txt");
	WebElement state=driver.findElement(By.xpath("//div[@class=' css-1hwfws3']"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true);", state);
	state.click();
	List<WebElement> allOptions=driver.findElements(By.xpath("//*[@id=\"subjectsContainer\"]"));
	for(int i = 0; i<=allOptions.size()-1; i++) {
        
        
        if(allOptions.get(i).getText().contains("NCR")) {
             
            allOptions.get(i).click();
            break;
	}
}
	}
}
