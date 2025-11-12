package FileReadApchePOIPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileRead {

	public static void main(String[] args) throws IOException {
	   String excelpath=System.getProperty("user.dir")+"\\files\\Emplyees.xlsx";
	   System.out.println(excelpath);
	   File file=new File(excelpath);
	   FileInputStream fis=new FileInputStream(file);
	   XSSFWorkbook workbook=new XSSFWorkbook(fis);
	   XSSFSheet sheet=workbook.getSheet("one");
	   int rows=sheet.getPhysicalNumberOfRows();
	   int cols=sheet.getRow(0).getLastCellNum();
	   for(int r=0;r<rows;r++)
	   {
		 XSSFRow row=sheet.getRow(r);  
		   for(int c=0;c<cols;c++)
		   {
			   XSSFCell cell=row.getCell(c);
			   CellType ctype=cell.getCellType();  //find type of data
			   switch(ctype)
			   {
				   case STRING:
				       System.out.print(cell.getStringCellValue());
				       break;
				   case NUMERIC:
					   System.out.print(cell.getNumericCellValue());
					   break;
				   case BOOLEAN:
					   System.out.print(cell.getBooleanCellValue());
					   break;	   
				   
			   }
			   System.out.print("   | ");
		   }
		   System.out.println();
	   }
	   workbook.close();
	}

}
