package datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelConfig {
	XSSFWorkbook wb;
	XSSFSheet sheet;
	ExcelConfig(String excelpath) throws IOException
	{
		File scr=new File(excelpath);
		try {
			FileInputStream fis = new FileInputStream(scr);
			 wb=new XSSFWorkbook(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}	
		
	}
	public String getData(int sheetNumber, int row, int column) {
		sheet=wb.getSheetAt(sheetNumber);
		String data=sheet.getRow(row).getCell(column).getStringCellValue();
		return data;
	}
	public int getRowCount(int sheetIndex) {
		int row=wb.getSheetAt(sheetIndex).getLastRowNum();
		return row+1;
	}

}
