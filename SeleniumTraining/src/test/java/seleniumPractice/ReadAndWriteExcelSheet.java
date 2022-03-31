package seleniumPractice;

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

public class ReadAndWriteExcelSheet {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\0014HO744\\Desktop\\eclipse-workspace\\SeleniumTraining\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/");
	    FileInputStream fis=new FileInputStream("C:\\Users\\0014HO744\\Desktop\\Practice.xlsx");
        XSSFWorkbook wb=new XSSFWorkbook(fis);
        XSSFSheet sheet=wb.getSheet("Sheet1");
        int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
        
        for(int i=1;i<=rowCount;i++)
        {
        String userName=sheet.getRow(i).getCell(0).getStringCellValue();
        String password=sheet.getRow(i).getCell(1).getStringCellValue();
        
        driver.findElement(By.xpath("//input[@name='userName']")).clear();
        driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(userName);
        driver.findElement(By.xpath("//input[@name='password']")).clear();
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        
        
        FileOutputStream fos=new FileOutputStream("C:\\Users\\0014HO744\\Desktop\\Practice.xlsx");
        XSSFCell cell=sheet.getRow(i).createCell(2);
        WebElement confimationMsg=driver.findElement(By.xpath("//h3[contains(text(),'Login Successfully')]"));
        if(confimationMsg.isDisplayed()) {
        	cell.setCellValue("Pass");
        }else
        {
        	cell.setCellValue("Fail");
        }
        wb.write(fos);
        fos.close();
        driver.navigate().back();
        }
}
	
}
