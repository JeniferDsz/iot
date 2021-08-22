package iotConnect;

import java.awt.Desktop.Action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ForgotPassword {
		// TODO Auto-generated method stub
	public WebDriver driver;
		public ForgotPassword(WebDriver driver)
		{
			this.driver=driver;
		}
		By userregister=By.xpath("//a[contains(text(),'Login \\ Register')]");
		By forgotpass=By.xpath("//button[contains(@onclick,'forgetUser')]");
		By email=By.xpath("//input[@id='forget_email']");
		By submit=By.xpath("//button[contains(text(), 'Ok')]");
		By ok=By.xpath("//button[@class='ui-button ui-corner-all ui-widget']");
		
		public WebElement register() throws InterruptedException
		{
			Thread.sleep(10000);
			return driver.findElement(userregister);
		}
		
		public WebElement forgotpassword() throws InterruptedException
		{
			/*WebDriverWait w=new WebDriverWait(driver, 10);
			w.until(ExpectedConditions.presenceOfElementLocated((By) driver.findElement(forgotpass)));*/
			Thread.sleep(3000);
			return driver.findElement(forgotpass);
		}
		public WebElement sendemail()
		{
			WebDriverWait w=new WebDriverWait(driver,5);
			w.until(ExpectedConditions.visibilityOfElementLocated(email)).isDisplayed();
			return driver.findElement(email);
		}
		public WebElement submitemail() throws InterruptedException
		{
			
			return driver.findElement(submit);
		}
		public WebElement clickok() throws InterruptedException
		{
			Thread.sleep(2000);
			return driver.findElement(ok);
		}
		
}
