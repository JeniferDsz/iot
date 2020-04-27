package iotConnect;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Resources.Base;



public class RelayONorOFFTest extends Base {

	@Test
	public void relaytest() throws IOException, InterruptedException
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
		Thread.sleep(2000);
		Relay r=new Relay(driver);
		Select relays=new Select(r.selecttest());
		relays.selectByVisibleText("Relay 3");
		Select status=new Select(r.onofftest());
		status.selectByVisibleText("OFF");;
		
	}

}
