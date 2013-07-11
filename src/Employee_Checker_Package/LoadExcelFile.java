package Employee_Checker_Package;

import java.awt.BorderLayout;
import java.io.IOException;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import jxl.*;
import jxl.read.biff.BiffException;

public class LoadExcelFile {
	private String path;
	private JTable table;
	private JPanel panel; 
	private JScrollPane scrollPane;
	
	public LoadExcelFile(String aPath, JPanel aPanel){
		path = aPath;
		panel = aPanel;
	}
	
	public void createTable(){
		try {
			Workbook workbook = Workbook.getWorkbook(new java.io.File(path));
			Sheet sheet = workbook.getSheet(0);
			Cell titleA = sheet.getCell(0,1);
			Cell titleB = sheet.getCell(0,1);
			Cell titleC = sheet.getCell(0,1);
			
			String columnNames[] = {titleA.getContents(), titleB.getContents(), titleC.getContents()};
			String dataValues[][] =
				{
					{ "12", "234", "67" },
					{ "-123", "43", "853" },
					{ "93", "89.2", "109" },
					{ "279", "9033", "3092" }
				};
			
			table = new JTable(dataValues, columnNames);
			scrollPane = new JScrollPane(table);
			panel.add(scrollPane, BorderLayout.CENTER);
			
		} catch (BiffException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
