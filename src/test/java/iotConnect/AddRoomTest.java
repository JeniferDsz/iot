package iotConnect;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resources.Base;

public class AddRoomTest extends Base{

	@Test(dataProvider="getData")
	public void Add(String Roomnames) throws IOException, InterruptedException
	{
		WebDriver driver=initializedriver();
		AddRoom a=new AddRoom(driver);
		LoginAfterActivation la=new LoginAfterActivation(driver);
		la.register().click();
		la.enterusername().sendKeys("Jenifer.Dsouza");
		la.enteruserpass().sendKeys("Jenifer@123");
		la.submit().click();
		la.alertsuccess().click();
		la.alertaccept().click();
		a.Roomclick().click();
		a.AddRoomname().sendKeys(Roomnames);
		a.SubmitRoom().click();
		System.out.println(a.Alertext().getText());
		a.AlertOk().click();
		Thread.sleep(2000);
		}
	@DataProvider
	public Object[] getData()
	{
		String obj[][]=new String[2][1];
		obj[0][0]="BedRoom";
		obj[1][0]="Living Room";
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
