package Resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Base {
	
	Properties prop=new Properties();
	public static WebDriver driver;
	public WebDriver initializedriver() throws IOException
	{
	
		//ChromeOptions options=new ChromeOptions();
		//options.addArguments("--headless");
		File directory = new File("./src/test/java/Resources/test.properties");
		FileInputStream fis=new FileInputStream(directory.getAbsolutePath());
		prop.load(fis);
		String BrowserName=prop.getProperty("browser");
		if(BrowserName.equalsIgnoreCase("Chrome"))
		{
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jenifer\\Documents\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		//	driver=new ChromeDriver(options);
		}
		else if(BrowserName.equalsIgnoreCase("firefox"))
		{
			//System.setProperty("webdriver.gecko.driver", "C:\\Users\\avira\\Documents\\geckodriver.exe");
			WebDriverManager.chromedriver().setup();
			driver=new FirefoxDriver();
		}
		else if(BrowserName.equalsIgnoreCase("Edge"))
		{
			//System.setProperty("webdriver.edge.driver", "C:\\Users\\avira\\Documents\\msedgedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver=new EdgeDriver();
		}
		
			driver.get("https://iot-connect.in/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			return driver;
			
			
			
	}
	public String ScreenshotOnFail(String result,WebDriver driver) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String destinationFile=System.getProperty("user.dir")+"\\Reports\\"+result+".png";
		FileUtils.copyFile(src, new File(destinationFile));
		return destinationFile;
		
	}
}
