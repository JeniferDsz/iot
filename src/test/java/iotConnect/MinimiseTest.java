package iotConnect;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Resources.Base;

public class MinimiseTest extends Base {
	
	@Test(priority=7)
	public void minimizeDeviceDetails() throws IOException, InterruptedException {
		driver = initializedriver();
		LoginAfterActivation la = new LoginAfterActivation(driver);
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
		Thread.sleep(2000);
		driver.quit();
	}
	

}
