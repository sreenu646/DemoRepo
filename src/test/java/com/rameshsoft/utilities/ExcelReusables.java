package com.rameshsoft.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReusables {

	private String filepath;
	private FileInputStream fip;
	private Workbook wb;
	private Sheet sheet;
	private Row row;
	private Cell cell;
	private ExcelReusables(String filepath) throws EncryptedDocumentException, InvalidFormatException, IOException {
		this.filepath=filepath;
		fip = new FileInputStream(filepath);
		wb = WorkbookFactory.create(fip);	
	}
	
	public static ExcelReusables getExcelReusables(String filepath) throws EncryptedDocumentException, InvalidFormatException, IOException{
		ExcelReusables ex  = new ExcelReusables(filepath);
		return ex;
	}
	
	public String getCellDate(String sheetname, int rowno, int cellno){
		String cellvalue = null;
		sheet = wb.getSheet(sheetname);
		row = sheet.getRow(rowno);
		cell = row.getCell(cellno);
		if (cell.getCellType()==cell.CELL_TYPE_STRING) {
			cellvalue = cell.getStringCellValue();
		}
		else if (cell.getCellType()==cell.CELL_TYPE_NUMERIC) {
		cellvalue = cell.getNumericCellValue()+"";
		}
		return cellvalue;
	}
	
	public List<String> getTotalCellData(String sheetname){
		String cellvlaue;
		List<String> list = new ArrayList<String>();
		sheet = wb.getSheet(sheetname);
		
		for (int i = 0; i < sheet.getLastRowNum()+1 ; i++) {
			row = sheet.getRow(i);
			for (int j = 0; j < row.getLastCellNum(); j++) {
				cell = row.getCell(j);
				if (cell.getCellType()==cell.CELL_TYPE_STRING) {
					cellvlaue = cell.getStringCellValue();
					list.add(cellvlaue);
				}
				else if (cell.getCellType()==cell.CELL_TYPE_NUMERIC) {
					cellvlaue = cell.getNumericCellValue()+"";
					list.add(cellvlaue);
				}
			}
		}
		return list;
	}
	
}
