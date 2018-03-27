package W12SH1;
import java.io.*;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class W12SH1 {
	
	 
	        public static void main(String[] args) throws Exception{
	                 
	                FileInputStream file= new FileInputStream(new File("C:\\Users\\Vaibhav\\eclipse-workspace\\ExcelProjectTestbed\\src\\W12SH1\\sample-xlsx-file.xlsx"));
	                  
	                XSSFWorkbook inputWorkbook=new XSSFWorkbook(file);
	                  
	                XSSFSheet worksheet = inputWorkbook.getSheetAt(0);  //Access the 1st Worksheet for modification or any changes
	                  
	                Cell cell = null; // declaration of a cell object
	                Cell cell1 = null;
	                cell = worksheet.getRow(18).getCell(2);  // Access the second cell in eighteenth row to modify
	                cell1 = worksheet.getRow(18).getCell(3);   
	                cell.setCellValue("Change Made");  // Get current cell value value and overwrite the value
	                cell1.setCellValue("in cells");  
	                file.close(); //Close the InputStream
	                 
	                FileOutputStream output_file =new FileOutputStream(new File("C:\\Users\\Vaibhav\\Desktop\\Modified_Output.xlsx"));  //Open FileOutputStream to write updates
	                  
	                inputWorkbook.write(output_file); //write changes
	                inputWorkbook.close();
	                output_file.close();  //close the stream    
	        }
	}


