package com.rameshsoft.reports;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class GmailTest {
	private ExtentReports ext;
	private static ExtentTest test;
	private WebDriver d;
	@BeforeSuite
	public void initialise()
	{
		
		ext=new ExtentReports("F:\\Selenium\\report.html");
	}
	@BeforeMethod
	public void beforeMethod(Method m)
	{
		test=ext.startTest(m.getName());
	}
	@AfterSuite
	public void close()
	{
		ext.endTest(test);
		ext.flush();
	}
@Test
public void gmailLogin()
{
	String url="https://www.gmail.com";
	System.setProperty("webdriver.chrome.driver","F:\\myjava\\ProjectDemo\\Drivers\\chromedriver.exe");
	d = new ChromeDriver();
	//d.manage().window().maximize();
	//d.manage().timeouts().implicitlyWait(89, TimeUnit.SECONDS);
	
	test.log(LogStatus.INFO,"chrome browser is started");
	test.log(LogStatus.INFO,"browser is maximized");
	d.get(url);
	test.log(LogStatus.INFO, "url entered");
	
	
}
@Test
public void face()
{
	System.setProperty("webdriver.chrome.driver","F:\\myjava\\ProjectDemo\\Drivers\\chromedriver.exe");
	d = new ChromeDriver();
	String url="https://www.facebook.com";
	test.log(LogStatus.INFO,"chrome browser is started");
	test.log(LogStatus.INFO,"browser is maximized");
	d.get(url);
	test.log(LogStatus.INFO, "url entered");
	
}
}