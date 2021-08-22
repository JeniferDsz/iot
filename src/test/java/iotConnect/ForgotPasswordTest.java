package iotConnect;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Resources.Base;

public class ForgotPasswordTest extends Base {

	@Test(priority=4)
	public void forgotPassword() throws IOException, InterruptedException
	{
		WebDriver driver=initializedriver();
		ForgotPassword fp=new ForgotPassword(driver);
		fp.register().click();
		fp.forgotpassword().click();
		fp.sendemail().sendKeys("jensgdigital@gmail.com");
		Thread.sleep(2000);
		fp.submitemail().click();
		fp.clickok();
		Thread.sleep(2000);
		driver.quit();
	}
}
