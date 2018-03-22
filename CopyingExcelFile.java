// Copying out an Excel File
//@author Vaibhav Mehandiratta
// version 1.0  22/03/2018

package CopyingExcelFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class CopyingExcelFile {
//  Main  Method of the Program
	public static void main(String[] args) throws IOException 
	{
		// Step 1 : Locate path and file to be inputed as real file 
		File inputFile = new File("C:\\Users\\Vaibhav\\eclipse-workspace\\ExcelProjectTestbed\\src\\excelProjectTestbed\\sample-xlsx-file.xlsx");
		FileInputStream fis = new FileInputStream(inputFile);
		XSSFWorkbook inputWorkbook = new XSSFWorkbook(fis);
		int inputSheetCount=inputWorkbook.getNumberOfSheets();
		System.out.println("Input Sheet Count: "+inputSheetCount);
		
		// Step 2 : Locate path and file to be cloned 
		File outputFile=new File("C:\\Users\\Vaibhav\\Desktop\\CopiedExcelFile.xlsx");
		FileOutputStream fos=new FileOutputStream(outputFile);
		
		// Step 3 : Creating workbook for output excel file.
		XSSFWorkbook outputWorkbook=new XSSFWorkbook();
		
		// Step 4 : Creating sheets with the same name as appearing in input file.
		for(int i=0;i<inputSheetCount;i++) 
                { 
                  XSSFSheet inputSheet=inputWorkbook.getSheetAt(i); 
                  String inputSheetName=inputWorkbook.getSheetName(i); 
                  XSSFSheet outputSheet=outputWorkbook.createSheet(inputSheetName); 

                 // Method for copying the contents
                 copySheet(inputSheet,outputSheet); 
                }

               // Step 9 : Write all the sheets in the new Workbook(testData_Copy.xlsx) using FileOutStream Object
               outputWorkbook.write(fos); 
              
               // Step 10 : closing all the leaks 
               fos.close(); 
               outputWorkbook.close();
               inputWorkbook.close();

	       }

           public static void copySheet(XSSFSheet inputSheet,XSSFSheet outputSheet) 
           { 
              int rowCount=inputSheet.getLastRowNum(); 
              System.out.println(rowCount+" rows in inputsheet "+inputSheet.getSheetName()); 
               
                int currentRowIndex=0; if(rowCount>0)
		{
			Iterator<Row> rowIterator=inputSheet.iterator();
			while(rowIterator.hasNext())
			{
				int currentCellIndex=0;
				Iterator<Cell> cellIterator=rowIterator.next().cellIterator();
				while(cellIterator.hasNext())
				{
					
				// Step 5 to 8 : Creating new  
					String cellData=cellIterator.next().toString();
					
					if(currentCellIndex==0)
					    outputSheet.createRow(currentRowIndex).createCell(currentCellIndex).setCellValue(cellData);
					
					else
						
						outputSheet.getRow(currentRowIndex).createCell(currentCellIndex).setCellValue(cellData);
					
					currentCellIndex++;
				}
				currentRowIndex++;
			}
			System.out.println((currentRowIndex-1)+" rows added to outputsheet "+outputSheet.getSheetName());
			System.out.println();
		
		    }    
        }
}
