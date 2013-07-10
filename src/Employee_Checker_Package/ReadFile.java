package Employee_Checker_Package;

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ReadFile{
	private String path;
	
	public ReadFile(String aPath){
		path = aPath;
	}

	public ArrayList<String> OpenFile() throws IOException{
		FileReader fr = new FileReader(path);
		BufferedReader textReader = new BufferedReader(fr);

		ArrayList<String> names = new ArrayList<String>();
		String thisLine;

		while((thisLine = textReader.readLine()) != null){
			names.add(thisLine);
		}

		textReader.close();
		return names;
	}
	
	public Map<String, String> employeesInGradeBook(String gradeBookFilePath) throws IOException{
		Map<String, String> mp = new HashMap<String, String>();
		
		FileReader fr = new FileReader(gradeBookFilePath);
		BufferedReader textReader = new BufferedReader(fr);
		String line;
		String cvsSplitBy = ",";
		
		while((line = textReader.readLine()) != null){
			String[] employee = line.split(cvsSplitBy);
			
			mp.put(employee[0], employee[1]+","+employee[2]+","+employee[3]+","+employee[4]+","+employee[5]+","+employee[6]);
		}
		
		textReader.close();
		return mp;
	}
	
	public void printMap(Map<String, String> aMap){
		for (Map.Entry<String, String> entry : aMap.entrySet()) {
			 
			System.out.println("name: " + entry.getKey() + "grades: " + entry.getValue());
		}
	}

	public void printList(ArrayList<String> aList){
		for(int i = 0; i < aList.size(); i++){
			System.out.println(aList.get(i));
		}
	}
}
