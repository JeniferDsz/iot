package iotConnect;

import java.io.IOException;

import org.apache.commons.codec.binary.Base64;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resources.Base;

public class LoginTest extends Base {
	public static Logger log = LogManager.getLogger(Base.class.getName());

	// TODO Auto-generated method stub
	@Test( priority=3,dataProvider = "getData", groups = { "Smoke" })
	public void login(String username, String password) throws IOException, InterruptedException {

		WebDriver driver = initializedriver();
		log.debug("Started debugging");
		Login l = new Login(driver);
		log.info("driver is initialized");
		try {

			l.register().click();
			credentials(username,password);
			l.submit().click();
			log.info("Home page is loaded");
			l.clickalert().click();
			//Assert.assertTrue(l.code().isDisplayed());
			// Thread.sleep(2000);
		} catch (Exception e) {

			l.alertbox().isDisplayed();
			System.out.println(l.textdisplayed().getText());
			log.info("text is displayed");
			l.clickalert().click();
			log.error("Wrong email or pssword entered");
		} catch (Error e) {
			log.error("Wrong email or pssword entered");
		}
		
		driver.quit();
		
	}

	public void credentials(String username,String password)
	{
		Login l = new Login(driver);
		l.enterusername().sendKeys(username);
		l.enteruserpass().sendKeys(decodepassword(password));
	}
	public String decodepassword(String pass)
	{
		byte[] decodepass=Base64.decodeBase64(pass.getBytes());
		return(new String(decodepass));
	}
	
	@DataProvider()
	public Object[] getData() {
		String obj[][] = new String[2][2];
		obj[0][0] = "Jenifer.Dsouza";
		obj[0][1] = "SmVuaUAxMjM0";

		obj[1][0] = "Jenifer.Dsouza1";
		obj[1][1] = "SmVuaUAxMjM0";
		return obj;
	}
	
}
