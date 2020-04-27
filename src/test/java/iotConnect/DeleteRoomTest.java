package iotConnect;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Resources.Base;

public class DeleteRoomTest extends Base{

		@Test
		public void delete() throws IOException, InterruptedException
		{
		WebDriver driver=initializedriver();
		LoginAfterActivation la=new LoginAfterActivation(driver);
		la.register().click();
		la.enterusername().sendKeys("Jenifer.Dsouza");
		la.enteruserpass().sendKeys("Jenifer@123");
		la.submit().click();
		la.alertsuccess().click();
		la.alertaccept().click();
		Thread.sleep(2000);
		DeleteRoom dr=new DeleteRoom(driver);
		dr.RoomName().click();
		dr.Roomtodelete().click();
		System.out.println(dr.AlertText().getText());
		dr.Acceptalert().click();
		System.out.println(dr.AfterRemoveText().getText());
		dr.Removedalert().click();
		}
		@AfterTest
		public void closebrowser() throws InterruptedException
		{
			Thread.sleep(2000);
			driver.close();
			driver=null;
		}
}
