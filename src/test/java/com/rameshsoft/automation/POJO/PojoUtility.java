package com.rameshsoft.automation.POJO;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.rameshsoft.constants.AppConstants;
import com.rameshsoft.utilities.ExcelReusables;
import com.rameshsoft.utilities.PropertyReusables;

public class PojoUtility {
	
private static ExcelReusables er;
private static PropertyReusables prConf;
private static PropertyReusables prOr;



public static ExcelReusables getEr() throws EncryptedDocumentException, InvalidFormatException, IOException{
	er = ExcelReusables.getExcelReusables(AppConstants.getExcelPath());
	return er;
}


public static PropertyReusables getPrOr() throws IOException{
	prOr= new PropertyReusables(AppConstants.getOrPath());
	return prOr;
	
}


public static PropertyReusables getPrConf() throws IOException{
	prConf= new PropertyReusables(AppConstants.getConfPath());
	return prConf;
	
}
}












