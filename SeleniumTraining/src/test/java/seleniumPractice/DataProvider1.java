package seleniumPractice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {
WebDriver driver;
	
	@BeforeMethod
	public void invokeBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\0014HO744\\Desktop\\eclipse-workspace\\SeleniumTraining\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/");
	}
	
		@Test(dataProvider="LoginPage")
			public void loginpage(String userName, String password) throws InterruptedException {
			
		    driver.findElement(By.xpath("//input[@name='userName']")).clear();
		    driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(userName);
		    driver.findElement(By.xpath("//input[@name='password']")).clear();
		    driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		    driver.findElement(By.xpath("//input[@name='submit']")).click();
		    Thread.sleep(3000);
		    //Assert.assertFalse(driver.getTitle().contains("Login: Mercury Tours"), "User is able login");
		    //Assert.assertEquals(driver.getTitle(), "Login: Mercury Tours");
		    Assert.assertEquals(driver.getTitle(), "Login: Mercury Tours", "Invalid credentials");
		    //Assert.assertTrue(driver.getTitle().contains("Login: Mercury Tours"), "User is not able to login -Invalid credentials");
		    System.out.println("Page title verified-login sucessfully");
		}
		@AfterMethod
		public void tearDown() {
			driver.close();
		}
			
		@DataProvider(name="LoginPage")
		public Object[][] passData() throws IOException{
			ReadExcelData config=new ReadExcelData("C:\\Users\\0014HO744\\Desktop\\Practice.xlsx");
			int rows=config.getRowCount(0);
			
			Object[][] data=new Object[rows][2];
			for(int i=0;i<rows;i++) {
				data[i][0]=config.getData(0, i, 0);
				data[i][1]=config.getData(0, i, 1);
			}
			
			return data;
			
		}
		

}
