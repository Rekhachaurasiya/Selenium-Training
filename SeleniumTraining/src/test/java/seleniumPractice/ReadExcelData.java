package seleniumPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {
	XSSFWorkbook wb;
	XSSFSheet sheet;
	ReadExcelData(String excelPath) throws IOException
	{
		File src=new File(excelPath);
		try {
			FileInputStream fis=new FileInputStream(src);
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
