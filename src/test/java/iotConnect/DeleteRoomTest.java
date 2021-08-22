package iotConnect;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Resources.Base;

public class DeleteRoomTest extends Base{

		@Test(priority=10)
		public void deleteRoom() throws IOException, InterruptedException
		{
		WebDriver driver=initializedriver();
		LoginAfterActivation la=new LoginAfterActivation(driver);
		la.register().click();
		LoginAfterActivationTest lt=new LoginAfterActivationTest();
		lt.credentials();
		la.submit().click();
		la.alertsuccess().click();
		la.alertaccept().click();
		Thread.sleep(2000);
		DeleteRoom dr=new DeleteRoom(driver);
		try
		{
		//dr.RoomName().click();
		Thread.sleep(2000);
		dr.roomtodelete();
		dr.deleteRoom().click();
		System.out.println(dr.AlertText().getText());
		dr.Acceptalert().click();
		System.out.println(dr.AfterRemoveText().getText());
		dr.Removedalert().click();
		Thread.sleep(3000);
		driver.quit();
		}
		catch(Exception e)
		{
			driver.close();
		}
		}
		/*@AfterTest
		public void closebrowser() throws InterruptedException
		{
			Thread.sleep(4000);
			driver.close();
			driver=null;
		}*/
}
