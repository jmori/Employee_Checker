package Employee_Checker_Package;

import java.awt.BorderLayout;
import java.awt.Color;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import jxl.*;
import jxl.read.biff.BiffException;

public class TableTester extends JFrame{
	// Instance attributes used in this example
		private	JPanel		topPanel;
		private	JTable		table;
		private	JScrollPane scrollPane;

		// Constructor of main frame
		public TableTester()
		{
			// Set the frame characteristics
			setTitle( "Simple Table Application" );
			setSize( 300, 200 );
			setBackground( Color.gray );

			// Create a panel to hold all other components
			topPanel = new JPanel();
			topPanel.setLayout( new BorderLayout() );
			getContentPane().add( topPanel );

			String path = "C:/Users/jorge.mori/Documents/test.xls";
			
			Workbook workbook;
			String columnNames[] = new String[100];
			try {
				workbook = Workbook.getWorkbook(new java.io.File(path));
				Sheet sheet = workbook.getSheet(0);
				
				System.out.println("Column numbers: " + sheet.getColumns());
				
				for(int i = 0; i < sheet.getColumns(); i++){
					Cell title = sheet.getCell(i,0);
					System.out.println(title.getContents());
					columnNames[i] = title.getContents();
				}
				
				System.out.println("----------------");
				for(int i = 0; i< sheet.getColumns(); i++)
					System.out.println(columnNames[i]);
				
				//Cell titleA = sheet.getCell(0,0);
				//Cell titleB = sheet.getCell(1,0);
				//Cell titleC = sheet.getCell(2,0);
				
				//String columnNames[] = {titleA.getContents(), titleB.getContents(), titleC.getContents()};

				// Create some data
				String dataValues[][] =
				{
					{ "12", "234", "67" },
					{ "-123", "43", "853" },
					{ "93", "89.2", "109" },
					{ "279", "9033", "3092" }
				};

				// Create a new table instance
				table = new JTable( dataValues, columnNames );

				// Add the table to a scrolling pane
				scrollPane = new JScrollPane( table );
				topPanel.add( scrollPane, BorderLayout.CENTER );
				
			} catch (BiffException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create an instance of the test application
				TableTester mainFrame	= new TableTester();
				mainFrame.setVisible( true );
	}

}
