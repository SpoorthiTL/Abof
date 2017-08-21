package com.library;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GenericLib {
	
	public static String configpath=BaseAutoamtion.SDirpath+"\\config.properties";
	public static String excelpath=BaseAutoamtion.SDirpath+"\\AbofApplication.xlsx";
	public static String getproperties(String key){
		String svalue=null;
		try{
		FileInputStream file=new FileInputStream(configpath);
		Properties properties=new Properties();
		properties.load(file);
		svalue=properties.getProperty(key);
		}catch(Exception e){
			e.printStackTrace();
		}
		return svalue;
	}
	
	public static void handlekeypad(){
		try{
				BaseAutoamtion.driver.hideKeyboard();
		}catch(Exception e){
			
		}
	}
	public static String getExcelData(String sheetname,int row,int cell){
		String sData=null;
		try{
			FileInputStream file=new FileInputStream(excelpath);
			Workbook wb=(Workbook)WorkbookFactory.create(file);
			Sheet sh=wb.getSheet(sheetname);
			sData=sh.getRow(row).getCell(cell).getStringCellValue();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return sData;
		
	}

}
