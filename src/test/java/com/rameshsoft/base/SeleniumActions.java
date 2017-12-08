package com.rameshsoft.base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



//import com.rameshsoft.automation.functionalinterfaces.Check;

public class SeleniumActions<T extends WebDriver> extends DriverEngine<WebDriver>{
	
	private static WebElement element;
	
	public <T> void clickById(String id){
		element = getDriver().findElement(By.id(id));
		if (element.isDisplayed()&&element.isEnabled()) {
			element.click();
		}
		else
		{
			//throw the exception
		}
	}
	
	public void clickByXpath(String xpath){
		element = getDriver().findElement(By.xpath(xpath));
		if (element.isDisplayed()&&element.isEnabled()) {
			element.click();
		}
		else
		{
			//throw the exception
		}
	}
	
	public void clickByCss(String css){
		element = getDriver().findElement(By.cssSelector(css));
		if (element.isDisplayed()&&element.isEnabled()) {
			element.click();
		}
		else
		{
			//throw the exception
		}
	}
	
	public void clickByLinkText(String linkText){
		element = getDriver().findElement(By.linkText(linkText));
		if (element.isDisplayed()&&element.isEnabled()) {
			element.click();
		}
		else
		{
			//throw the exception
		}
	}
	
	public void clickByName(String name){
		element = getDriver().findElement(By.name(name));
		if (element.isDisplayed()&&element.isEnabled()) {
			element.click();
		}
		else
		{
			//throw the exception
		}
	}
	
	public void clickByClass(String name){
		element = getDriver().findElement(By.className(name));
		if (element.isDisplayed()&&element.isEnabled()) {
			element.click();
		}
		else
		{
			//throw the exception
		}
	}
	
	public static void click(String locator,String locatorType)
	{
		
		switch(locatorType){
		case "id":
			element = getDriver().findElement(By.id(locator));
		if (element.isDisplayed()&&element.isEnabled()) {
			element.click();
			break;
		}
		else
		{
			//throw the exception
		}
		
		
		
		case "css":
			element = getDriver().findElement(By.cssSelector(locator));
			if (element.isDisplayed()&&element.isEnabled()) {
				element.click();
				break;
			}
			else
			{
				//throw the exception
			}
		
		case "xpath":
			element = getDriver().findElement(By.xpath(locator));
			if (element.isDisplayed()&&element.isEnabled()) {
				element.click();
				break;
			}
			else
			{
				//throw the exception
			}
			
		case "name":
			element = getDriver().findElement(By.name(locator));
			if (element.isDisplayed()&&element.isEnabled()) {
				element.click();
				break;
			}
			else
			{
				//throw the exception
			}
		}//close switch case
	}//close click()
	
	
	public static void enterData(String locator,String testData,String locatorType){
		
		switch(locatorType) {
			case "id":
			element=getDriver().findElement(By.id(locator));
			if (element.isDisplayed()&&element.isEnabled()) {
				element.clear();
				element.sendKeys(testData);
			}
			else
			{
				//throw exception
			}
			break;
		case "css":
			element=getDriver().findElement(By.cssSelector(locator));
			if (element.isDisplayed()&&element.isEnabled()) {
				element.clear();
				element.sendKeys(testData);
			}
			else
			{
				//throw exception
			}
			break;
		case "xpath":
			element=getDriver().findElement(By.xpath(locator));
			if (element.isDisplayed()&&element.isEnabled()) {
				element.clear();
				element.sendKeys(testData);
			}
			else
			{
				//throw exception
			}
			break;
		case "name":
			element=getDriver().findElement(By.name(locator));
			if (element.isDisplayed()&&element.isEnabled()) {
				element.clear();
				element.sendKeys(testData);
			}
			else
			{
				//throw exception
			}
			break;
		case "class":
			element=getDriver().findElement(By.className(locator));
			if (element.isDisplayed()&&element.isEnabled()) {
				element.clear();
				element.sendKeys(testData);
			}
			else
			{
				//throw exception
			}
			break;
		case "linkText":
			element=getDriver().findElement(By.linkText(locator));
			if (element.isDisplayed()&&element.isEnabled()) {
				element.clear();
				element.sendKeys(testData);
			}
			else
			{
				//throw exception
			}
			break;
			default:
				System.out.println("");
		}
	}
	
	
	public void clickByJS(String locator,String locatorType){
		JavascriptExecutor js = (JavascriptExecutor)getDriver();
		switch(locatorType){
		
		case "id":
			element = getDriver().findElement(By.id(locator));
		if (element.isDisplayed()&&element.isEnabled()) {
			js.executeScript("arguments[0].click", element);
			break;
		}
		else
		{
			//throw the exception
		}
		
		case "css":
			element = getDriver().findElement(By.cssSelector(locator));
			if (element.isDisplayed()&&element.isEnabled()) {
				js.executeScript("arguments[0].click", element);
				break;
			}
			else
			{
				//throw the exception
			}
		
		case "xpath":
			element = getDriver().findElement(By.xpath(locator));
			if (element.isDisplayed()&&element.isEnabled()) {
				js.executeScript("arguments[0].click", element);
				break;
			}
			else
			{
				//throw the exception
			}
			
		case "name":
			element = getDriver().findElement(By.name(locator));
			if (element.isDisplayed()&&element.isEnabled()) {
				js.executeScript("arguments[0].click", element);
				break;
			}
			else
			{
				//throw the exception
			}
		}//close switch case	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}













