package iotConnect;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Resources.Base;

public class AddDeviceTest extends Base {

	@Test(groups = { "Smoke" }, priority = 6)
	public void Add() throws IOException, InterruptedException {
		WebDriver driver = initializedriver();
		LoginAfterActivation la = new LoginAfterActivation(driver);
		la.register().click();
		la.enterusername().sendKeys("123");
		la.enteruserpass().sendKeys("******");
		la.submit().click();
		la.alertsuccess().click();
		la.alertaccept().click();
		Thread.sleep(2000);
		AddDevice a = new AddDevice(driver);
		try {
			a.RoomName().click();
			a.addDevice().click();
			a.addName().sendKeys("Repellent");
			a.Addid().sendKeys("3713700");
			a.acceptalert().click();
			Thread.sleep(3000);
			System.out.println(a.alertText().getText());
			a.afteralert().click();
		} catch (Exception e) {
			System.out.println(a.console().getText());
		}
	}

	@AfterTest
	public void closebrowser() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
		driver = null;
	}

}
