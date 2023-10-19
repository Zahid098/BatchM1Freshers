package ShopperLogin;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingExcelData 
{
	public static void main(String[] args) throws Throwable
	{
			File file=new File("C:\\section211\\ShoppersStackM1\\src\\test\\resources\\TestData\\PersonalData.xlsx");
			FileInputStream fis=new FileInputStream(file);
			
			Workbook workbook = WorkbookFactory.create(file);
			Sheet sheet = workbook.getSheet( "sheet1");
			 
			int LastRowIndex=sheet.getLastRowNum();
			int lastcellvalue = sheet.getRow(0).getLastCellNum();
			
			for(int i=0;i<=LastRowIndex;i++) {
				
				for(int j=0;j<lastcellvalue;j++)
				{
					String value = sheet.getRow(i).getCell(j).getStringCellValue();
					System.out.print(value+"  ");
				}
				System.out.println();			
			}
//		String value = workbook.getSheet( "Sheet1").getRow(0).getCell(3).getStringCellValue();
	}	
	}


