package script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import library.Base;
import library.DataReader;

public class LogInToGmail extends Base {
	@DataProvider(name = "userInformation")
	public Object[][] informationData() {
		DataReader dataReader = new DataReader();
		return dataReader.getExcelData("src/test/resources/ExcelData.xls", "Sheet1");
	}

	@Test(dataProvider = "userInformation")
	public void login(String Username, String Password) throws Exception {
		driver.get("https://www.gmail.com");
		WebElement userName = driver.findElement(By.id(pro.getProperty("user_id")));
		userName.sendKeys(Username);
		WebElement next = driver.findElement(By.id(pro.getProperty("next_id")));
		next.click();
		Thread.sleep(2000);
		WebElement enter_password = driver.findElement(By.name(pro.getProperty("user_password")));
		enter_password.sendKeys(Password);
		WebElement next1 = driver.findElement(By.id(pro.getProperty("next_id1")));
		next1.click();
		Thread.sleep(2000);
	}
	public WebDriver startDriver(String browser) {
		switch(browser) {
		case "chrome":
		break;
		case "IE":
			break;
		case "firefox":
			break;
			default:
				
			
		
		}
		return driver;
	}

}
