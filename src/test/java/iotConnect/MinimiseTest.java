package iotConnect;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Resources.Base;

public class MinimiseTest extends Base {

	@Parameters({ "URL" })
	@Test(priority = 10)
	public void minim(String urlname) throws IOException, InterruptedException {
		driver = initializedriver();
		System.out.println(urlname);
		LoginAfterActivation la = new LoginAfterActivation(driver);
		la.register().click();
		la.enterusername().sendKeys("123");
		la.enteruserpass().sendKeys("******");
		la.submit().click();
		la.alertsuccess().click();
		Thread.sleep(2000);
		la.alertaccept().click();
		AddDevice a = new AddDevice(driver);
		a.RoomName().click();
		DeviceStatus ds = new DeviceStatus(driver);
		ds.deviceclick().click();
		Minimise m = new Minimise(driver);
		Thread.sleep(2000);
		m.minimizewindow().click();
	}

}
