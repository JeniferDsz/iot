package iotConnect;

import java.io.IOException;


import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Resources.Base;

public class CreateAccountTest extends Base{

	@BeforeSuite
	public void launchtest() {
		System.out.println("Launching the web browser");
	}

	@Test(priority=1, dataProvider = "getData", groups ={"Smoke"}, enabled=false)
	public void createAccount(String username, String password, String confirmPassword, String emailID,
			String mobilenum, String person) throws IOException, InterruptedException {
		WebDriver driver = initializedriver();
		Launch l = new Launch(driver);
		l.register().click();
		l.userid().sendKeys(username);
		l.password().sendKeys(passwords(password));
		l.confirm().sendKeys(confirmpasswords(confirmPassword));
		l.emailid().sendKeys(emails(emailID));
		l.mobile().sendKeys(numbers(mobilenum));
		l.name().sendKeys(person);
		l.Act();
		l.submitMe().click();
		l.OK().click();
		Thread.sleep(4000);
		driver.quit();
	}
	@DataProvider
	public Object[] getData() throws InterruptedException {
		String obj[][] = new String[2][6];
		obj[0][0] = "Jenifer.Dsouza4578";
		obj[0][1] = "SmVuaUAxMjM0";
		obj[0][2] = "SmVuaUAxMjM0";
		obj[0][3] = "amVuc2dkaWdpdGFsKzExQGdtYWlsLmNvbQ==";
		obj[0][4] = "NjExMDA1ODYyNQ==";
		obj[0][5] = "Jenifer.Dsouza4578";
		
		obj[1][0] = "Maria.Dsouza1978";
		obj[1][1] = "QWJjZEAxMjM0";
		obj[1][2] = "QWJjZEAxMjM0";
		obj[1][3] = "amVuc2dkaWdpdGFsKzEyQGdtYWlsLmNvbQ==";
		obj[1][4] = "NTEyNDAzMzQzMw==";
		obj[1][5] = "Maria.Dsouza1978";
		return obj;
	}

	public String passwords(String pass)
	{
	byte[] decodedPass=Base64.decodeBase64(new String(pass));
	return(new String(decodedPass));
	}
	public String confirmpasswords(String confirmpass)
	{
	byte[] decodedPass=Base64.decodeBase64(new String(confirmpass));
	return(new String(decodedPass));
	}
	public String emails(String mail)
	{
	byte[] decodeEmail=Base64.decodeBase64(new String(mail));
	return(new String(decodeEmail));
	}
	public String numbers(String mobile)
	{
	byte[] decodeNumber=Base64.decodeBase64(new String(mobile));
	return(new String(decodeNumber));
	}
	/*@AfterTest
	public void closebrowser() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
		driver = null;
		
	}*/
	
}
