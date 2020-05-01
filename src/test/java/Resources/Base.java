package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.io.*;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Base {
	
	Properties prop=new Properties();
	public static WebDriver driver;
	public WebDriver initializedriver() throws IOException
	{
	
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--disable-notifications");
		File directory = new File("./src/test/java/Resources/test.properties");
		FileInputStream fis=new FileInputStream(directory.getAbsolutePath());
		prop.load(fis);
		String BrowserName=prop.getProperty("browser");
		if(BrowserName.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\avira\\Documents\\chromedriver.exe");
			driver=new ChromeDriver(ch);
		}
		else if(BrowserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\avira\\Documents\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(BrowserName.equalsIgnoreCase("Edge"))
		{
			System.setProperty("webdriver.edge.driver", "C:\\Users\\avira\\Documents\\msedgedriver.exe");
			driver=new EdgeDriver();
		}
		
			driver.get("https://iot-connect.in/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			return driver;
			
			
			
	}
	public void ScreenshotOnFail(String result) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\avira\\.jenkins\\Alexa\\FailureScreenshots\\"+result+"screenshot.png"));
	}
}
