package iotConnect;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Resources.Base;


public class DeviceStatusTest extends Base{

	@Test
	public void devicestatus() throws IOException, InterruptedException
	{
		driver=initializedriver();
		LoginAfterActivation la=new LoginAfterActivation(driver);
		la.register().click();
		la.enterusername().sendKeys("Jenifer.Dsouza");
		la.enteruserpass().sendKeys("Jenifer@123");
		la.submit().click();
		la.alertsuccess().click();
		Thread.sleep(2000);
		la.alertaccept().click();
		AddDevice a=new AddDevice(driver);
		a.RoomName().click();
		DeviceStatus ds=new DeviceStatus(driver);
		ds.deviceclick().click();
		System.out.println("device status is:"+ds.devicestatus().getText());
	}
	@AfterTest
	public void closebrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
		driver=null;
	}
}
