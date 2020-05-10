package iotConnect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Minimise {
	
	public WebDriver driver;
	public Minimise(WebDriver driver)
	{
		this.driver=driver;
	}
	By min=By.xpath("//button[@class='btn btn-default resize-btn pull-right']");
	public WebElement minimizewindow()
	{
		return driver.findElement(min);
	}

}
