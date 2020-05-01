package iotConnect;

import java.io.IOException;

import org.testng.annotations.Test;

import Resources.Base;

public class MinimiseTest extends Base{

	@Test
	public void minim() throws IOException, InterruptedException
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
		Minimise m=new Minimise(driver);
		Thread.sleep(2000);
		m.minimizewindow().click();
	}

}
