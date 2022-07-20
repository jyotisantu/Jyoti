package Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Demo.DemoLog;
import io.cucumber.messages.types.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
 
	public static WebDriver driver;
    public static ExtentReports extents = new ExtentReports();
	public static ExtentHtmlReporter reporter = new ExtentHtmlReporter("./Reports/extentreport.html");
	public static void openBrowser() {
		DemoLog.Sample(2);
		extents.attachReporter(reporter);
		ExtentTest logger = extents.createTest("OpenBrowserTest");
		logger.log(Status.INFO, "Opening the Browser");
		try {
			DemoLog.Sample(1);			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			logger.log(Status.PASS, "Browser is opened Successfully");
			
		}
		catch(Exception e) {
			DemoLog.Sample(3);
			e.printStackTrace();
			logger.log(Status.FAIL, "Browser is failed to open");
		}	
		extents.flush();
	}
	
	public static void openURL(String url) {
		extents.attachReporter(reporter);
		ExtentTest logger = extents.createTest("OpenURLTest");
		logger.log(Status.INFO, "Opening the url");
		try {
			DemoLog.Sample(2);
			driver.get(url);
			Thread.sleep(2000);
			logger.log(Status.PASS, "URL is opened Successfully");
		}
		catch(Exception e) {
			DemoLog.Sample(3);
			e.printStackTrace();
			logger.log(Status.FAIL, "URL is failed to open");
		}
		extents.flush();
	}
	
	
	public static void BrowserClose()
	{
		extents.attachReporter(reporter);
		ExtentTest logger = extents.createTest("OpenURLTest");
		logger.log(Status.INFO, "Opening the url");
		try {
			DemoLog.Sample(1);
			driver.quit();
			DemoLog.Sample(5);
			logger.log(Status.PASS, "URL is opened Successfully");
		}
		catch(Exception e) {
			DemoLog.Sample(3);
			e.printStackTrace();
			logger.log(Status.FAIL, "URL is failed to open");
		}
	}
}
