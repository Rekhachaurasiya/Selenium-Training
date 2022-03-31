package pratice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDatafromExcel {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\0014HO744\\Desktop\\eclipse-workspace\\SeleniumTraining\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/");
		FileInputStream fis=new FileInputStream("C:\\Users\\0014HO744\\Desktop\\eclipse-workspace\\SeleniumTraining\\DataSheet\\TestBook.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("Test");
		int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
		 for(int i=1;i<=rowCount;i++) {
		String userName=sheet.getRow(1).getCell(0).getStringCellValue();
		String Password=sheet.getRow(1).getCell(1).getStringCellValue();
		
		driver.findElement(By.xpath("//input[@name='userName']")).clear();
		   driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(userName);
		   driver.findElement(By.name("password")).sendKeys(Password);
		   driver.findElement(By.xpath("//input[@value='Submit']")).click();
		   
		    WebElement confirmationMessage=driver.findElement(By.xpath("//h3[contains(text(),'Login Successfully')]"));
		    
		    
		    FileOutputStream fos=new FileOutputStream("C:\\Users\\0014HO744\\Desktop\\eclipse-workspace\\SeleniumTraining\\DataSheet\\TestBook.xlsx");
		    XSSFCell cell = sheet.getRow(i).createCell(2);
            
            if (confirmationMessage.isDisplayed()) {
                
                cell.setCellValue("PASS");
                
            } else {
                
                cell.setCellValue("FAIL");
            }
		     
		     wb.write(fos);
		     System.out.println("create the data on the sheet");
		     fos.close();
		     driver.navigate().back();
	}

}
}
