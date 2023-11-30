package com.actitime.generic;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class FileLib 
{
	/**
	 * This is a generic method for reading property file
	 * @param key
	 * @throws IOException
	 */
	public String getPropertyData(String key) throws IOException 
	{
		FileInputStream f=new FileInputStream("./Data/d.property");
		Properties p=new Properties();
		p.load(f);
		String s1 = p.getProperty(key);	
		return s1;
	}
	/**
	 * This is a generic method for reading excel file
	 * @param sheetname
	 * @param row
	 * @param cell
	 * @return
	 * @throws IOException
	 */
	public  String getExcelData(String sheetname,int row,int cell) throws IOException 
	{
		FileInputStream f=new FileInputStream("./Data/login.xlsx");
		Workbook wb=WorkbookFactory.create(f);
		return wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
	}
	/**
	 * This is a generic method for writing the data to excel file
	 * @param sheetname
	 * @param row
	 * @param cell
	 * @param data
	 * @throws IOException
	 */
	public  void setExcelData(String sheetname,int row,int cell,String data) throws IOException 
	{
		FileInputStream f=new FileInputStream("./Data/login.xlsx");
		Workbook wb=WorkbookFactory.create(f);
		wb.getSheet(sheetname).getRow(row).getCell(cell).setCellValue(data);
		FileOutputStream f1=new FileOutputStream("./Data/login.xlsx");
		wb.write(f1);
		wb.close();
	}
	/**
	 * This is a generic method for counting the rows in excelfile
	 * @param sheetname
	 * @return
	 * @throws IOException
	 */
	public  int countRows(String sheetname) throws IOException 
	{
		FileInputStream f=new FileInputStream("./Data/login.xlsx");
		Workbook wb=WorkbookFactory.create(f);
		return wb.getSheet(sheetname).getLastRowNum();
	}
}
