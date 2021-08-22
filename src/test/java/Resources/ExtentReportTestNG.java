package Resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportTestNG {
	
	static ExtentReports extent;
	public static ExtentReports generateExtentReports()
	{
		String path=System.getProperty("user.dir")+"//Reports//index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setReportName("IOTConnect Automation");
		reporter.config().setDocumentTitle("ExtentReportIOTConnect");
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		return extent;		
	}
	

}
