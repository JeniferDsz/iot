package iotConnect;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Resources.Base;

public class LoginAfterActivationTest extends Base {

	@Test(groups = { "Smoke" }, priority = 2)
	public void loginactivate() throws IOException, InterruptedException {

		WebDriver driver = initializedriver();
		LoginAfterActivation la = new LoginAfterActivation(driver);
		la.register().click();
		la.enterusername().sendKeys("123");
		la.enteruserpass().sendKeys("******");
		la.submit().click();
		la.alertsuccess().click();
		la.alertaccept().click();

	}

	@AfterTest
	public void closebrowser() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
		driver = null;
	}

}
