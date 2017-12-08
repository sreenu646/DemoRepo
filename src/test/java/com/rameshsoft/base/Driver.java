package com.rameshsoft.base;

import org.openqa.selenium.WebDriver;

public interface Driver<T extends WebDriver>{
WebDriver getDriver();
}
