package iotConnect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	By personname=By.xpath("//input[@placeholder='Name']");
	By sub=By.xpath("//button[contains(text(),'Signup')]");
	By clickalert=By.xpath("//button[contains(text(),'Ok')]");
	
	public WebElement register() throws InterruptedException
	{
		Thread.sleep(10000);
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
	public WebElement mobile() throws InterruptedException
	{
		Thread.sleep(5000);
		return driver.findElement(mobno);
	}
	public WebElement name() throws InterruptedException
	{
		Thread.sleep(5000);
		return driver.findElement(personname);
	}
	public void Act() throws InterruptedException
	{
		Thread.sleep(2000);
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//small[contains(text(),'On Clicking Sign Up')]"))).click().build().perform();
	}
	public WebElement submitMe() throws InterruptedException
	{
		Thread.sleep(3000);
		return driver.findElement(sub);
	}
	
	
	public WebElement OK() throws InterruptedException
	{
		Thread.sleep(3000);
		return driver.findElement(clickalert);
	}
	
	
	
}
