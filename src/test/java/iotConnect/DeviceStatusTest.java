package iotConnect;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Resources.Base;


public class DeviceStatusTest extends Base{

	@Test(priority=6)
	public void deviceStatus() throws IOException, InterruptedException
	{
		driver=initializedriver();
		LoginAfterActivation la=new LoginAfterActivation(driver);
		la.register().click();
		LoginAfterActivationTest lt=new LoginAfterActivationTest();
		lt.credentials();
		la.submit().click();
		la.alertsuccess().click();
		Thread.sleep(2000);
		la.alertaccept().click();
		DeviceStatus ds=new DeviceStatus(driver);
		ds.RoomName().click();
		ds.deviceclick().click();
		ds.minimize().click();
		String text=ds.devicestatus().getText();
		System.out.println("device status is:" +text);
		Thread.sleep(2000);
		driver.quit();
	}
}
