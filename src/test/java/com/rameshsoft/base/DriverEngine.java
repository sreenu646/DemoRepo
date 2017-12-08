package com.rameshsoft.base;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.rameshsoft.automation.POJO.POJO;
import com.rameshsoft.constants.GmailConstants;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class DriverEngine<T extends WebDriver> {
	private static WebDriver d;
	private static ExtentReports ext;
	private static ExtentTest test;
	@Parameters("browser")
	@BeforeSuite
	public void openBrowser(@Optional("chrome")String browser){
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\testingFrame1\\testingFrameWork\\Drivers\\chromedriver.exe");
			d = new ChromeDriver();
			d.manage().window().maximize();
			d.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			//System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\testingFrame1\\testingFrameWork\\Drivers\\geckodriver.exe");
			d = new FirefoxDriver();
			d.manage().window().maximize();
			d.manage().timeouts().implicitlyWait(89, TimeUnit.SECONDS);
		}
		else if (browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "F:\\Selenium\\testingFrame1\\testingFrameWork\\Drivers\\IEDriverServer.exe");
			d = new InternetExplorerDriver();
			d.manage().window().maximize();
			d.manage().timeouts().implicitlyWait(89, TimeUnit.SECONDS);
		}
		else
		{
			System.out.println("pass the correct browser value");
		}
		
		ext=new ExtentReports(GmailConstants.getReportPath());
	}
	@AfterSuite
	public void close() {
		if (d!=null) {
			d.close();
		}
		ext.endTest(test);
		ext.flush();
	}
	@BeforeMethod
	public void beforeMethod(Method m)
	{
		test=ext.startTest(m.getName());
	}
	public static WebDriver getDriver()
	{
		return d;
	}
	public static ExtentTest getTest()
	{
		return test;
	}
		
}
