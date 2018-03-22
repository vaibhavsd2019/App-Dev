//ExcelFileReader

//@author Vaibhav Mehandiratta

// For displaying number of rows and columns in different sheets of the workbook

// version 1.1   22/03/2018

package ExcelFileReader;

	import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
	import org.apache.poi.ss.usermodel.*;
	import java.io.File;
	import java.io.IOException;
	import java.util.Iterator;

	public class excelfilereader {
	    public static final String SAMPLE_XLSX_FILE_PATH = "sample-xlsx-file.xlsx";

	    public static void main(String[] args) throws IOException, InvalidFormatException {

	        // Creating a Workbook from an Excel file (.xls or .xlsx)
	        Workbook workbook = WorkbookFactory.create(new File(SAMPLE_XLSX_FILE_PATH));
            //Name of the workbook
	        System.out.println("Workbook name : - sample-xlsx-file.xlsx");
	        // Retrieving the number of sheets in the Workbook
	        System.out.println("Workbook has " + workbook.getNumberOfSheets() + " Sheets : ");

	        /*
	           =============================================================
	           Iterating over all the sheets in the workbook (Multiple ways)
	           =============================================================
	        */
            
	        // 1. You can obtain a sheetIterator and iterate over it
	        Iterator<Sheet> sheetIterator = workbook.sheetIterator();
	        System.out.println("Retrieving Sheets using Iterator");
	        while (sheetIterator.hasNext()) {
	            Sheet sheet = sheetIterator.next();
	            System.out.println("=> " + sheet.getSheetName());
	        }
	 
	        /*
	           ==================================================================
	           Iterating over all the rows and columns in a Sheet (Multiple ways)
	           ==================================================================
	        */
            
	        // Getting the Sheet at index zero
	        Sheet sheet = workbook.getSheetAt(0);

	        // Create a DataFormatter to format and get each cell's value as String
	        DataFormatter dataFormatter = new DataFormatter();
	           
	      
	        // 1. You can obtain a rowIterator and columnIterator and iterate over them
	        System.out.println("\n\nIterating over Rows and Columns using Iterator\n");
	        Iterator<Row> rowIterator = sheet.rowIterator();
	        while (rowIterator.hasNext()) {
	            Row row = rowIterator.next();

	            // Iterating over the columns of the current row
	            Iterator<Cell> cellIterator = row.cellIterator();

	            while (cellIterator.hasNext()) {
	                Cell cell = cellIterator.next();
	                String cellValue = dataFormatter.formatCellValue(cell);
	                System.out.print(cellValue + "\t");
	            }
	            System.out.println();
	        }

	        // 2. Or you can use a for-each loop to iterate over the rows and columns
	        System.out.println("\n\nIterating over Rows and Columns using for-each loop\n");
	        for (Row row: sheet) {
	            for(Cell cell: row) {
	                String cellValue = dataFormatter.formatCellValue(cell);
	                System.out.print(cellValue + "\t");
	            }
	            System.out.println();
	        }
            
	        // 3. Or you can use Java 8 forEach loop with lambda
	        System.out.println("\n\nIterating over Rows and Columns using Java 8 forEach with lambda\n");
	        sheet.forEach(row -> {
	            row.forEach(cell -> {
	                String cellValue = dataFormatter.formatCellValue(cell);
	                System.out.print(cellValue + "\t");
	            });
	            System.out.println();
	        });
	        System.out.println("\nSheet 1");
	        int a=sheet.getRow(0).getPhysicalNumberOfCells();
	        String b=Integer.toString(a);
	        // For displaying total number of columns in Sheet 1
	        System.out.println("Total number of columns = " + b);
	        // To store number of rows with integer data type
	        int c=sheet.getPhysicalNumberOfRows();
	        String d=Integer.toString(c);
	        
	        System.out.println("Total number of Rows = " + d);
	        
	        Sheet sheet1 = workbook.getSheetAt(1);
	        
	        System.out.println("\nSheet 2");
	        int e=sheet1.getRow(0).getPhysicalNumberOfCells();
	        String f=Integer.toString(e);
	        
	        System.out.println("Total number of columns = " + f);
	        
	        int g=sheet1.getPhysicalNumberOfRows();
	        String h=Integer.toString(g);
	        
	        System.out.println("Total number of Rows = " + h);
	        
	        Sheet sheet2 = workbook.getSheetAt(2);
	        System.out.println("\nSheet 3");
	        int i=sheet2.getRow(4).getPhysicalNumberOfCells();
	        String j=Integer.toString(i);
	        
	        System.out.println("Total number of columns = " + j);
	        
	        int k=sheet2.getPhysicalNumberOfRows();
	        String l=Integer.toString(k);
	        
	        System.out.println("Total number of Rows = " + l);
	        // Closing the workbook
	        workbook.close();
	    }
	}