package iotConnect;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Resources.Base;

public class RelayONorOFFTest extends Base {

	@Test(priority=8,groups = { "Smoke" })
	public void relayTurnOnOff() throws IOException, InterruptedException {
		driver = initializedriver();
		LoginAfterActivation la = new LoginAfterActivation(driver);
		la.register().click();
		LoginAfterActivationTest lt=new LoginAfterActivationTest();
		lt.credentials();
		la.submit().click();
		la.alertsuccess().click();
		Thread.sleep(2000);
		la.alertaccept().click();
		DeviceStatus ds = new DeviceStatus(driver);
		ds.RoomName().click();
		ds.deviceclick().click();
		System.out.println("device status is:" + ds.devicestatus().getText());
		Thread.sleep(5000);
		Relay r = new Relay(driver);
		r.toggleonoff();
		Thread.sleep(2000);
		driver.close();
	}

}
