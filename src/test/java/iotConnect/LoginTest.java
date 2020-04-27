package iotConnect;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resources.Base;



public class LoginTest extends Base{

		// TODO Auto-generated method stub
		@Test(dataProvider= "getData")
		public void loginiot(String username, String password) throws IOException, InterruptedException
		{
			WebDriver driver=initializedriver();
			Login l=new Login(driver);
			try 
			{
				l.register().click();
				l.enterusername().sendKeys(username);
				l.enteruserpass().sendKeys(password);
				Thread.sleep(2000);
				l.submit().click();
				Assert.assertTrue(l.code().isDisplayed());
			//	Thread.sleep(2000);
				
			}
			catch(Exception e)
			{
				l.alertaccept().isDisplayed();
				System.out.println(l.textdisplayed().getText());
				l.clickalert().click();		
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
