package pratice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadyMultpleSetsOfData {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\0014HO744\\Desktop\\TestBook.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("Test");
   int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
     
        for(int i=1;i<=rowCount;i++){
     
            int cellcount=sheet.getRow(i).getLastCellNum();
            
            for(int j=0;j<cellcount;j++){
               String Pass=sheet.getRow(i).getCell(j).getStringCellValue();
               System.out.print(" "+Pass);
            }
            System.out.println();
        }
    }
		
	}
	


