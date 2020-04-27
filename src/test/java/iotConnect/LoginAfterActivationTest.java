package iotConnect;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Resources.Base;

public class LoginAfterActivationTest extends Base{

	@Test
	public void loginactivate() throws IOException, InterruptedException
	{
		
		WebDriver driver=initializedriver();
		LoginAfterActivation la=new LoginAfterActivation(driver);
		la.register().click();
		la.enterusername().sendKeys("Jenifer.Dsouza");
		la.enteruserpass().sendKeys("Jenifer@123");
		la.submit().click();
		la.alertsuccess().click();
		la.alertaccept().click();
		
	}
	@AfterTest
	public void closebrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
		driver=null;
	}

}
