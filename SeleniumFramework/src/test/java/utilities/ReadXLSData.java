   package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadXLSData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
		ReadXLSData rexdta= new ReadXLSData();
		rexdta.getData("login");

	}
    
	public  String[][] getData(String excelSheetName) throws EncryptedDocumentException, IOException
	{
		File f= new File(System.getProperty("user.dir")+"\\src\\test\\resources\\testData\\testdata.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb =WorkbookFactory.create(fis);
		Sheet sheetName=wb.getSheet(excelSheetName);
		
		// Find number of rows and columns in the sheet
		int rowNum= sheetName.getLastRowNum();
		System.out.println("Total number of Rows in sheet:"+ sheetName.getLastRowNum());
		Row rowCells=sheetName.getRow(0);
		int colNum= rowCells.getLastCellNum();
		System.out.println("Total Number of Columns in sheet:"+ rowCells.getLastCellNum());
		
		//Read the data
		
		DataFormatter format= new DataFormatter();
		String data[][]= new String[rowNum][colNum];
		for(int i=1; i<=rowNum; i++)
		{
			for(int j=0; j<colNum; j++)
			{
				data[i-1][j]= format.formatCellValue(sheetName.getRow(i).getCell(j));
				System.out.println(data[i-1][j]);
			}
		}
		
		return data;
		
	}	
}
