package iotConnect;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Login {

		// TODO Auto-generated method stub
		public WebDriver driver;
		public Login(WebDriver driver)
		{
			this.driver=driver;
		}
		By userregister=By.xpath("//a[contains(text(),'Login \\ Register')]");
		By username=By.xpath("//input[@id='login_uname']");
		By userpassword=By.xpath("//input[@id='login_pass']");
		By submitvalue=By.xpath("//input[@class='btn btn-primary']");
		By activatecode=By.xpath("//div[@class='ui-dialog ui-corner-all ui-widget ui-widget-content ui-front ui-draggable ui-resizable']");
		By alertbox=By.xpath("//div[@role='dialog']");
		By text=By.xpath("//div[@id='dialog-alert']");
		By alertok=By.xpath("//button[@class='ui-button ui-corner-all ui-widget']");
		

		public WebElement register() throws InterruptedException
		{
			Thread.sleep(5000);
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
		public WebElement code()
		{
			return driver.findElement(activatecode);
		}
		public WebElement alertaccept()
		{
			return driver.findElement(alertbox);
		}
		public WebElement textdisplayed()
		{
			return driver.findElement(text);
		}
		public WebElement clickalert() throws InterruptedException
		{
			//Thread.sleep(2000);
			return driver.findElement(alertok);
		}
		
}
