package datadriven;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
public class BaseClass {
	public static WebDriver driver;
	public static org.apache.log4j.Logger logger;
	public String userName="mngr384140";
	public String Password="EmEpApE";
	public String baseUrl="https://demo.guru99.com/v4/";
	
	@BeforeMethod
	public void setUp() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\0014HO744\\Desktop\\eclipse-workspace\\SeleniumTraining\\Driver\\chromedriver.exe");
	driver = new ChromeDriver();
	System.out.println("launching chrome browser");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
   }
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
