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
	By min=By.xpath("//span[@class='glyphicon glyphicon-resize-small']");
	public WebElement minimizewindow()
	{
		return driver.findElement(min);
	}

}
