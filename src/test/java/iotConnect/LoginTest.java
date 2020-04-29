package iotConnect;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resources.Base;



public class LoginTest extends Base{
		public static Logger log=LogManager.getLogger(Base.class.getName());
		// TODO Auto-generated method stub
		@Test(dataProvider= "getData")
		public void loginiot(String username, String password) throws IOException, InterruptedException
		{
			
			WebDriver driver=initializedriver();
			log.debug("Started debugging");
			Login l=new Login(driver);
			log.info("driver is initialized");
			try 
			{
				
				l.register().click();
				l.enterusername().sendKeys(username);
				l.enteruserpass().sendKeys(password);
				Thread.sleep(2000);
				l.submit().click();
				log.info("Home page is loaded");
				Assert.assertTrue(l.code().isDisplayed());
			//	Thread.sleep(2000);
				
			}
			catch(Exception e)
			{
				
				l.alertaccept().isDisplayed();
				System.out.println(l.textdisplayed().getText());
				log.info("text is displayed");
				l.clickalert().click();	
				log.error("Wrong email or pssword entered");
			}
			catch(Error e)
			{
				log.error("Wrong email or pssword entered");
			}
			driver.close();
		}
		@DataProvider()
		public Object[] getData()
		{
			String obj[][]=new String[2][2];
			obj[0][0]="Jenifer.Dsouza";
			obj[0][1]="Jenifer@123";
			
			obj[1][0]="Jenifer.Dsouza";
			obj[1][1]="Jenifer@1234";
			return obj;
	}		
		
		/*@AfterTest
		public void closebrowsers() throws InterruptedException
		{
	        Set<String> handlesSet = driver.getWindowHandles();
	        List<String> handlesList = new ArrayList<String>(handlesSet);
	        Iterator<String> it=handlesSet.iterator();
	        driver.switchTo().window(handlesList.get(0));
	        	
	       while(it.hasNext()) 
	       {
	       driver.close(); 
	      
	       }
	    
		}*/
	
}
