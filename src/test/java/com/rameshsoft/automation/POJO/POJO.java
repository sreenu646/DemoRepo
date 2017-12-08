package com.rameshsoft.automation.POJO;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.rameshsoft.constants.AppConstants;
import com.rameshsoft.utilities.ExcelReusables;
import com.rameshsoft.utilities.PropertyReusables;


public class POJO {
	
	private static PropertyReusables pr ;
	private static ExcelReusables er;
	
	
	public static PropertyReusables getPr(String filepath) throws IOException{
		pr = new PropertyReusables(filepath);
		return pr;
	}
	public static ExcelReusables getEr(String filepath) throws EncryptedDocumentException, InvalidFormatException, IOException {
		er = ExcelReusables.getExcelReusables(filepath);
		return er;
	}
	
	
	
}
