package iotConnect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Launch {

	public WebDriver driver;
	public Launch(WebDriver driver)
	{
		this.driver=driver;
	}
	By userregister=By.xpath("//a[contains(text(),'Login \\ Register')]");
	By username=By.xpath("//input[@id='reg_uname']");
	By userpassword=By.xpath("//input[@id='reg_pass']");
	By confirmpass=By.xpath("//input[@id='reg_cpass']");
	By email=By.xpath("//input[@id='reg_email']");
	By mobno=By.xpath("//input[@id='reg_mob']");
	By personname=By.xpath("//input[@id='reg_name']");
	By submit=By.xpath("//button[contains(text(),'Signup')]");
	By clickalert=By.xpath("//button[contains(text(),'Ok')]");
	
	public WebElement register()
	{
		return driver.findElement(userregister);
	}
	public WebElement userid()
	{
		return driver.findElement(username);
	}
	public WebElement password()
	{
		return driver.findElement(userpassword);
	}
	public WebElement confirm()
	{
		return driver.findElement(confirmpass);
	}
	public WebElement emailid()
	{
		return driver.findElement(email);
	}
	public WebElement mobile()
	{
		return driver.findElement(mobno);
	}
	public WebElement name()
	{
		return driver.findElement(personname);
	}
	public WebElement submitData()
	{
		return driver.findElement(submit);
	}
	public WebElement OK()
	{
		return driver.findElement(clickalert);
	}
	
}
