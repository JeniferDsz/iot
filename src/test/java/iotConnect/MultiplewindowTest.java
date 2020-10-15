package iotConnect;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Resources.Base;

public class MultiplewindowTest extends Base {

	@Test(priority = 11)
	public void multiple() throws IOException, InterruptedException {
		WebDriver driver = initializedriver();
		MultipleWindow mw = new MultipleWindow(driver);
		LoginAfterActivation la = new LoginAfterActivation(driver);
		String key = Keys.chord(Keys.CONTROL, Keys.ENTER);
		la.register().click();
		la.enterusername().sendKeys("123");
		la.enteruserpass().sendKeys("*******");
		la.submit().click();
		System.out.println(la.alertsuccess().getText());
		la.alertaccept().click();
		mw.helplink().sendKeys(key);
		;
		mw.controlpanellink().sendKeys(key);
		Thread.sleep(2000);
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		while (it.hasNext()) {

			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			driver.close();

		}

	}

	@AfterTest
	public void closebrowser() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
		driver = null;
	}
}
