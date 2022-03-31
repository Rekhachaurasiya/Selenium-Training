package pratice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadAndWrite {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\0014HO744\\Desktop\\eclipse-workspace\\SeleniumTraining\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		FileInputStream fis=new FileInputStream("C:\\Users\\0014HO744\\Documents\\datasheet.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("sheet1");
		
		int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
	        
	        driver.get("https://demoqa.com/automation-practice-form");

	        WebElement firstName=driver.findElement(By.id("firstName"));
	        WebElement lastName=driver.findElement(By.id("lastName"));
	        WebElement email=driver.findElement(By.id("userEmail"));
	        WebElement genderFemale= driver.findElement(By.xpath("//input[@id='gender-radio-2']"));
	        WebElement mobile=driver.findElement(By.id("userNumber"));
	        WebElement address=driver.findElement(By.id("currentAddress"));
	        WebElement submitBtn=driver.findElement(By.id("submit"));

	        for(int i=1;i<=rowCount;i++) {
	           
	            firstName.sendKeys(sheet.getRow(i).getCell(0).getStringCellValue());
	            lastName.sendKeys(sheet.getRow(i).getCell(1).getStringCellValue());
	            email.sendKeys(sheet.getRow(i).getCell(2).getStringCellValue());
	            mobile.sendKeys(sheet.getRow(i).getCell(4).getStringCellValue());
	            address.sendKeys(sheet.getRow(i).getCell(5).getStringCellValue());
	            
	            JavascriptExecutor js = (JavascriptExecutor) driver;
	            js.executeScript("arguments[0].click();", genderFemale);
	            
	            WebElement uploadElement = driver.findElement(By.xpath("//input[@id='uploadPicture']"));
	        	uploadElement.sendKeys("C:\\Users\\0014HO744\\Desktop\\uloadfile.txt");
	        	
	        	js.executeScript("arguments[0].scrollIntoView(true);", submitBtn);
	            submitBtn.click();
	           
	            WebElement confirmationMessage = driver.findElement(By.xpath("//div[text()='Thanks for submitting the form']"));
	           
	            XSSFCell cell = sheet.getRow(i).createCell(6);
	            
	            if (confirmationMessage.isDisplayed()) {
	                
	                cell.setCellValue("PASS");
	                
	            } else {
	                
	                cell.setCellValue("FAIL");
	            }
	            
	            
	            FileOutputStream outputStream = new FileOutputStream("C:\\Users\\0014HO744\\Documents\\datasheet.xlsx");
	            wb.write(outputStream);

	            WebElement closebtn = driver.findElement(By.xpath("//button[@id='closeLargeModal']"));
	            closebtn.click();
	            
	            driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	        }
	        
	        wb.close();
	        
	        driver.quit();
	        }
	}
	


