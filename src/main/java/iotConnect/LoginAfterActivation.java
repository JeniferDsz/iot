package iotConnect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginAfterActivation {

		public WebDriver driver;
		public LoginAfterActivation(WebDriver driver)
		{
			this.driver=driver;
		}
		By userregister=By.xpath("//a[contains(text(),'Login \\ Register')]");
		By username=By.xpath("//input[@id='login_uname']");
		By userpassword=By.xpath("//input[@id='login_pass']");
		By submitvalue=By.xpath("//input[@class='btn btn-primary']");
		By after=By.xpath("//div[@id='dialog-alert']");
		By ok=By.xpath("//button[@class='ui-button ui-corner-all ui-widget']");
		public WebElement register() throws InterruptedException
		{
			WebDriverWait w=new WebDriverWait(driver,20);
			w.until(ExpectedConditions.elementToBeClickable(userregister));
			return driver.findElement(userregister);
		}
		public WebElement enterusername()
		{
			return driver.findElement(username);
		}
		public WebElement enteruserpass()
		{
			return driver.findElement(userpassword);
		}
		public WebElement submit()
		{
			return driver.findElement(submitvalue);
		}
		public WebElement alertsuccess() throws InterruptedException
		{
			Thread.sleep(2000);
			return driver.findElement(after);
		}
		public WebElement alertaccept() throws InterruptedException
		{
			return driver.findElement(ok);
		}

	}


