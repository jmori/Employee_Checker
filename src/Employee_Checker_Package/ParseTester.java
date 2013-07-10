package Employee_Checker_Package;

import java.io.IOException;

public class ParseTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {

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

	}
}
