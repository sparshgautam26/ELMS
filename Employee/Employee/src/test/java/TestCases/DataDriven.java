package TestCases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class DataDriven {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		
		//Excel..............Workbook..........sheet..............Rows...........cells//          (structure to read data)(extract all these by one by one)
		
		//FileInputStream............used to Read the data from excel file
		//XSSFWorkbook...............to extract Workbook from excel
		//XSSFSheet..................to extract sheet from workbook
		//XSSFRows...................to extract rows from sheet
		//XSSFCells..................to extract cells from rows
		
		// Also add 2new dependencies for data driven testing
		
		FileInputStream file = new FileInputStream("C:\\Users\\hp\\Downloads\\Selenium2\\Employee\\testdata\\testdata.xlsx");            //to provide input for particular excelfile
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);      //pass file in parameter
		
		    XSSFSheet sheet = workbook.getSheet("sheet1");    // to extract it declare object and pass parameter
		
		      int totalrows = sheet.getLastRowNum();
		      
		      int totalcell = sheet.getRow(1).getLastCellNum();
		      
		      System.out.println("No of total rows "+totalrows);
		      
		      System.out.println("No of total cells "+totalcell);
		      
		      for(int r=0;r<=totalrows;r++)                //to access rows from this outer for loop 
		      {
		    	  XSSFRow currentrow = sheet.getRow(r);
		    	  
		    	  for(int c=0;c<totalcell;c++)
		    	  {
		    		  XSSFCell cell = currentrow.getCell(c);               //to read data from cell
		    		  System.out.println(cell.toString()+"\t");                 //to string is used to convert data from xssf form to string
		    	  }
		    	  System.out.println();
		      }
		      
		      workbook.close();
		      file.close();
	}
}
			