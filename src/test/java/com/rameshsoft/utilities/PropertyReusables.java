package com.rameshsoft.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReusables {

	String filepath;
	File file;
	FileInputStream fip;
	Properties pr;
	FileOutputStream fop;

	public PropertyReusables(String filepath) throws IOException {
		this.filepath = filepath;
		file = new File(filepath);
		fip = new FileInputStream(file);
		pr = new Properties();
		pr.load(fip);
	}

	public String getproperty(String key) {
		String value = pr.getProperty(key);
		return value;
	}
	
	public String getproperty(String key, String defaultvalue) {
		String value = pr.getProperty(key, defaultvalue);
		return value;
	}

	public void removeproperty(String key) {
		pr.remove(key);
	}

	public void writeproperty(String key, String value) throws IOException {
		pr.setProperty(key, value);
		fop = new FileOutputStream(file);
		pr.store(fop, "successfully stored");
	}
}
