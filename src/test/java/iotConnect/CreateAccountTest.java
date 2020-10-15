package iotConnect;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resources.Base;

public class CreateAccountTest extends Base {

	@BeforeSuite
	public void launchtest() {
		System.out.println("Launching the web browser");
	}

	@Test(dataProvider = "getData", groups = { "Smoke" }, priority = 1)
	public void AccountDetails(String username, String password, String confirmPassword, String emailID,
			String mobilenum, String person) throws IOException, InterruptedException {
		WebDriver driver = initializedriver();
		Launch l = new Launch(driver);
		l.register().click();
		l.userid().sendKeys(username);
		l.password().sendKeys(password);
		l.confirm().sendKeys(confirmPassword);
		l.emailid().sendKeys(emailID);
		l.mobile().sendKeys(mobilenum);
		l.name().sendKeys(person);
		l.submitData().click();
		l.OK().click();
		Thread.sleep(2000);
	}

	@DataProvider
	public Object[] getData() {
		String obj[][] = new String[2][6];
		obj[0][0] = "Jenifer.Dsouza123";
		obj[0][1] = "******";
		obj[0][2] = "******";
		obj[0][3] = "123@gmail.com";
		obj[0][4] = "**********";
		obj[0][5] = "Jeniferdsouza123";

		obj[1][0] = "Maria.Dsouza";
		obj[1][1] = "******";
		obj[1][2] = "******";
		obj[1][3] = "test@yahoo.com";
		obj[1][4] = "123456789";
		obj[1][5] = "Mariasouza27";
		return obj;
	}

	@AfterTest
	public void closebrowser() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
		driver = null;
	}
}
