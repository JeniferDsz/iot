package iotConnect;

import java.io.IOException;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Resources.Base;

public class LoginAfterActivationTest extends Base {

	@Test(priority=2,groups = { "Smoke" }, enabled=false)
	public void loginactivate() throws IOException, InterruptedException {

		WebDriver driver = initializedriver();
		LoginAfterActivation la = new LoginAfterActivation(driver);
		la.register().click();
		credentials();
		la.submit().click();
		la.alertaccept().click();

	}
	public void credentials()
	{
		LoginAfterActivation la = new LoginAfterActivation(driver);
		la.enterusername().sendKeys("Jenifer.Dsouza");
		la.enteruserpass().sendKeys(password("SmVuaUAxMjM0"));
	}
	public String password(String pass)
	{
		byte[] decode=Base64.decodeBase64(pass.getBytes());
		return(new String(decode));
	}
	@AfterTest
	public void closebrowser() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
		driver = null;
	}
	


}
