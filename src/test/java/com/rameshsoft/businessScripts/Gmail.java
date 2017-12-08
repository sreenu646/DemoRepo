package com.rameshsoft.businessScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.rameshsoft.automation.POJO.POJO;
import com.rameshsoft.automation.POJO.PojoUtility;
import com.rameshsoft.base.DriverEngine;
import com.rameshsoft.base.SeleniumActions;
import com.rameshsoft.constants.GmailConstants;
import com.relevantcodes.extentreports.LogStatus;



public class Gmail extends DriverEngine<WebDriver> {
		
	@Test
	public void login() throws IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException
	{
	getTest().log(LogStatus.INFO,"Browser is opened");
	
	getDriver().get(PojoUtility.getPrConf().getproperty("Gmail_url"));
	getTest().log(LogStatus.INFO,"Url entered");
	SeleniumActions.enterData(POJO.getPr(GmailConstants.getORpath()).getproperty("user_id"), POJO.getEr(GmailConstants.getExcelPath()).getCellDate("sheet1", 0, 0), "id");
	getTest().log(LogStatus.INFO,"Find the username");
	getTest().log(LogStatus.INFO,"Entered the data");
	SeleniumActions.click(POJO.getPr(GmailConstants.getORpath()).getproperty("next_xpath"), "xpath");
	getTest().log(LogStatus.INFO,"find the next button");
	getTest().log(LogStatus.INFO,"performed the clicked operation");
	Thread.sleep(3000);
	SeleniumActions.enterData(POJO.getPr(GmailConstants.getORpath()).getproperty("passwd_xpath"), POJO.getEr(GmailConstants.getExcelPath()).getCellDate("sheet1", 0, 1), "xpath");
	getTest().log(LogStatus.INFO,"find the password and entered the data");
	SeleniumActions.click(POJO.getPr(GmailConstants.getORpath()).getproperty("signin_xpath"), "xpath");
		
		} 
}
