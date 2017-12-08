package com.rameshsoft.constants;

public class GmailConstants {

	private static String configpath = "F:\\Selenium\\testingFrame1\\testingFrameWork\\src\\com\\rameshsoft\\configuration\\config.properties";
	private static String orPath = "F:\\Selenium\\testingFrame1\\testingFrameWork\\src\\com\\rameshsoft\\OR\\or.properties";
	private static String excelpath = "F:\\Selenium\\testingFrame1\\testingFrameWork\\src\\com\\rameshsoft\\testdata\\josh.xlsx";
    private static String reportpath="F:\\Selenium\\report.html";
	

	public static String getconfigPath(){
		return configpath;
	}

	public static String getORpath(){
		return orPath;
	}
	
	public static String getExcelPath(){
		return excelpath;
	}
	public static String getReportPath()
	{
		return reportpath;
	}

}
