package GenericUtility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataUtility 
{
	public String fetchingpropertisfiledata(String Key) throws Throwable
	{

		File file=new File("C:\\section211\\ShoppersStackM1\\src\\test\\resources\\TestData\\Propertyfile.properties");
		FileInputStream fis=new FileInputStream(file);
		
		Properties pro=new Properties();
		pro.load(fis);
		
		String URL=pro.getProperty( Key);
		 return URL;
		
		
	}
	public String fetchingexceldata(String sheetname,int rowNum,int cellNum) throws Throwable {
		
		File file=new File("C:\\Users\\DELL\\OneDrive\\Documents\\PersonalData.xlsx");
		FileInputStream fis=new FileInputStream(file);
		
		Workbook workbook = WorkbookFactory.create(file);
		Sheet sheet = workbook.getSheet( sheetname);
		
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(cellNum);
		String value = cell.getStringCellValue();
		
	   return value;
	}
    public long fetchingexceldataNumeric(String sheetname,int rowNum,int cellNum) throws Throwable {
		
		File file=new File("C:\\section211\\ShoppersStackM1\\src\\test\\resources\\TestData\\PersonalData.xlsx");
		FileInputStream fis=new FileInputStream(file);
		
		Workbook workbook = WorkbookFactory.create(file);
		Sheet sheet = workbook.getSheet( sheetname);
		
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(cellNum);
		long value =(long)cell.getNumericCellValue();
		
	   return value;
}
   public boolean fetchingexceldataBoolean(String sheetname,int rowNum,int cellNum) throws Throwable {
		
		File file=new File("C:\\section211\\ShoppersStackM1\\src\\test\\resources\\TestData\\PersonalData.xlsx");
		FileInputStream fis=new FileInputStream(file);
		
		Workbook workbook = WorkbookFactory.create(file);
		Sheet sheet = workbook.getSheet( sheetname);
		
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(cellNum);
		boolean value = cell.getBooleanCellValue();
		
	   return value;
   }
   public Date fetchingexceldataDate(String sheetname,int rowNum,int cellNum) throws Throwable {
		
		File file=new File("C:\\section211\\ShoppersStackM1\\src\\test\\resources\\TestData\\PersonalData.xlsx");
		FileInputStream fis=new FileInputStream(file);
		
		Workbook workbook = WorkbookFactory.create(file);
		Sheet sheet = workbook.getSheet( sheetname);
		
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(cellNum);
		Date value = cell.getDateCellValue();
		
	   return value;
   }
}
