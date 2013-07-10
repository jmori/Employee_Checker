package Employee_Checker_Package;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ParseTextFile {
	
	private String path;
	
	public ParseTextFile(String file_path){
		path = file_path;
	}
	
	public String[] parse() throws IOException{
		FileReader fr = new FileReader(path);
		BufferedReader bf = new BufferedReader(fr);
		
		//Place each employee line by line
		String line = bf.readLine();
		String[] lines = line.split(";");
		
		String[] employees = new String[lines.length]; 
		
		//Delete their email address, if there is one
		int index;
		for(int i = 0; i<lines.length; i++){
			if(lines[i].contains("<")){
				index = lines[i].indexOf("<");
				if(index != -1)
					employees[i] = lines[i].substring(0,index);
			}
			else
				employees[i] = lines[i];
		}
		
		bf.close();
		return employees;
	}
	
	public void writeCVSFile(String aPathName, String[] aList){
		try{
			FileWriter writer = new FileWriter(aPathName);
			
			for(int i=0; i<aList.length; i++){
				writer.append(aList[i] + ",");
				writer.append("\n");
			}
			
			writer.flush();
			writer.close();
			
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
	}

}
