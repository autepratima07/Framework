package Com.Utility;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
     	XSSFWorkbook wb;
	    public ExcelDataProvider() throws IOException {
		String excelpath="C:\\Users\\Admin\\eclipse-workspace\\Framework\\TestData\\Data.xlsx";
		FileInputStream fis1=new FileInputStream(excelpath);
	    wb=new XSSFWorkbook(fis1);
 }
	public String getSheetData(String sheetname,int row,int cell)
	{
		return wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
	}
 }