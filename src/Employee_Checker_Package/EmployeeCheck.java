package Employee_Checker_Package;

import java.io.IOException;
import java.util.ArrayList;

public class EmployeeCheck{

	public static void main(String[] args) throws IOException{
		
		String employeeFile = "TextFiles/AB_Employees.txt";
		String gradeBook = "TextFiles/gradeBook.txt";
		
		try{
			ReadFile file = new ReadFile(employeeFile);
			ArrayList<String> jorgeList = new ArrayList<String>();
			jorgeList = file.OpenFile();

			ReadFile vickiFile = new ReadFile(gradeBook);
			ArrayList<String> vickiList = new ArrayList<String>();
			vickiList = vickiFile.OpenFile();

			for(int i = 0; i< jorgeList.size(); i++){
				//Compare the two lists
				if(vickiList.contains(jorgeList.get(i)))
					System.out.println(jorgeList.get(i));
			}

		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
	}
}
