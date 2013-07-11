package Employee_Checker_Package;

import java.io.*;
import jxl.*;
import jxl.read.biff.BiffException;

public class ParseTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {

		try {
			Workbook workbook = Workbook.getWorkbook(new File("C:/Users/jorge.mori/Documents/test.xls"));
			Sheet sheet = workbook.getSheet(0);
			Cell a1 = sheet.getCell(0,1);
			Cell b2 = sheet.getCell(1,1);
			Cell c2 = sheet.getCell(2,1);
			
			String stringa1 = a1.getContents();
			String stringb2 = b2.getContents();
			String stringc2 = c2.getContents();
			
			System.out.println("The string are:\n a1: " + stringa1 + " b2: " + stringb2 + " c2: " + stringc2 );
		} catch (BiffException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		String fileName = "TextFiles/BritishColumbiaUsers.txt";
		String CVS_name = "TextFiles/BritishColumbiaUsers.csv";
		
		String[] employees;
		
		try{
			ParseTextFile pt = new ParseTextFile(fileName);
			employees = pt.parse();
			
			for(int i = 0; i<employees.length; i++)
				System.out.println(employees[i]);
			
			System.out.println("Number of Employees: " + employees.length);
			
			pt.writeCVSFile(CVS_name, employees);
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
		*/

	}
}
