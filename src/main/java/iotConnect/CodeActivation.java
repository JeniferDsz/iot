package iotConnect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CodeActivation {

		
		public WebDriver driver;
		public CodeActivation(WebDriver driver)
		{
			this.driver=driver;
		}

		By activation=By.xpath("//input[@id='email_activation_code']");
		By activate=By.xpath("//button[@id='activation-button']");
		By after=By.xpath("//div[@id='dialog-alert']");
		By invalid=By.xpath("//div[@id='dialog-attention']");
		public WebElement activationcode()
		{
			return driver.findElement(activation);
		}
		public WebElement activateclick() throws InterruptedException
		{
			Thread.sleep(2000);
			return driver.findElement(activate);
		}
		public WebElement alertsuccess() throws InterruptedException
		{
			Thread.sleep(2000);
			return driver.findElement(after);
		}
		public WebElement invalidcode()
		{
			return driver.findElement(invalid);
		}
	}


