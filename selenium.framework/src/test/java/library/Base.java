package library;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	public static WebDriver driver;
	public static Properties pro;
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try {
			pro = new Properties();
			FileInputStream file = new FileInputStream(
					"C:\\Users\\kisho\\eclipse-workspace3\\selenium.framework\\application.properties");
			pro.load(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@AfterMethod
	public void logout() {
		driver.close();
		driver.quit();
	}

}
