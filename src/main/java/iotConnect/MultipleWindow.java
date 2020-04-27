package iotConnect;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MultipleWindow {


		public WebDriver driver;
		public MultipleWindow(WebDriver driver)
		{
			this.driver=driver;
		}
		By after=By.xpath("//div[@id='dialog-alert']");
		By ok=By.xpath("//button[@class='ui-button ui-corner-all ui-widget']");
		By help=By.xpath("//a[contains(text(), 'Help and Contents')]");
		By controlpanel=By.xpath("//a[contains(text(),'Control Panel')]");
		
		
		public WebElement helplink() throws InterruptedException
		{
			Thread.sleep(2000);
			
			return driver.findElement(help);
			
		}
		public WebElement controlpanellink() throws InterruptedException
		{
			Thread.sleep(2000);
			return driver.findElement(controlpanel);
		}
		
	}


