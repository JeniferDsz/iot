package iotConnect;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Resources.Base;

public class MultiplewindowTest extends Base {

	@Test(priority=9)
	public void multipleWindowTrigger() throws IOException, InterruptedException {
		WebDriver driver = initializedriver();
		MultipleWindow mw = new MultipleWindow(driver);
		LoginAfterActivation la = new LoginAfterActivation(driver);
		la.register().click();
		LoginAfterActivationTest lt=new LoginAfterActivationTest();
		lt.credentials();
		la.submit().click();
		System.out.println(la.alertsuccess().getText());
		la.alertaccept().click();
		mw.helplink().sendKeys(mw.key);
		mw.controlpanellink().sendKeys(mw.key);
		Thread.sleep(2000);
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		la.alertaccept().click();
		Thread.sleep(5000);
		driver.quit();
	}
}
