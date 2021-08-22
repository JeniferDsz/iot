package iotConnect;

import java.io.IOException;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resources.Base;

public class AddRoomTest extends Base{

	@Test(priority=5,dataProvider="getData",groups={"Smoke"})
	public void addRoom(String Roomnames) throws IOException, InterruptedException
	{
		WebDriver driver=initializedriver();
		AddRoom a=new AddRoom(driver);
		LoginAfterActivation la=new LoginAfterActivation(driver);
		la.register().click();
		LoginAfterActivationTest lt=new LoginAfterActivationTest();
		lt.credentials();
		la.submit().click();
		la.alertsuccess().click();
		la.alertaccept().click();
		a.Roomclick().click();
		a.AddRoomname().sendKeys(Roomnames);
		a.SubmitRoom().click();
		System.out.println(a.Alertext().getText());
		a.AlertOk().click();
		Thread.sleep(2000);
		driver.quit();
		}
	@DataProvider
	public Object[] getData()
	{
		String obj[][]=new String[2][1];
		obj[0][0]="BedRoom";
		obj[1][0]="DeleteRoom";
		return obj;
	}
	
}
