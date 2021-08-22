package iotConnect;

import java.io.IOException;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resources.Base;

public class CodeActivationTest extends Base{

	@Test(dataProvider="getData",groups={"Smoke"},enabled=false)
	public void Entercode(String code) throws IOException, InterruptedException
	{
		WebDriver driver=initializedriver();
		CodeActivation ca=new CodeActivation(driver);
		Login l=new Login(driver);
		l.register().click();
		LoginAfterActivationTest lt=new LoginAfterActivationTest();
		lt.credentials();
		l.submit().click();
		ca.activationcode().sendKeys(code);
		ca.activateclick().click();
		System.out.println(ca.alertsuccess().getText());	
	
	}
	@DataProvider
	public Object[] getData()
	{
		String obj[][]=new String[1][1];
		obj[0][0]="swU1saKSme";
		return obj;
	}
	@AfterTest
	public void closebrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
		driver=null;
	}
}
