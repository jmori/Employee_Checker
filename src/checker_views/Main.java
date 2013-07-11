package checker_views;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.UIManager;

import Employee_Checker_Package.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.Toolkit;
import javax.swing.JTable;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField txtField_GradeBook;
	private JTextField txtField_provincePath;
	private JTable table_GradeBook;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}catch(Throwable e){
			e.printStackTrace();
		}
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Main.class.getResource("/checker/resources/checkMark.png")));
		setFont(new Font("Verdana", Font.BOLD, 12));
		setTitle("Employee Checker");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 471);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		mnFile.setFont(new Font("Verdana", Font.BOLD, 12));
		menuBar.add(mnFile);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.setFont(new Font("Verdana", Font.BOLD, 12));
		mntmExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		mnFile.add(mntmExit);
		
		JMenu mnNewMenu = new JMenu("Edit");
		mnNewMenu.setFont(new Font("Verdana", Font.BOLD, 12));
		menuBar.add(mnNewMenu);
		
		JMenu mnAbout = new JMenu("About");
		mnAbout.setFont(new Font("Verdana", Font.BOLD, 12));
		menuBar.add(mnAbout);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("About Employee Checker");
		mntmNewMenuItem.setFont(new Font("Verdana", Font.BOLD, 12));
		mnAbout.add(mntmNewMenuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		txtField_GradeBook = new JTextField();
		txtField_GradeBook.setColumns(10);
		
		JButton btnBrowse_GradeBook = new JButton("Select GradeBook");
		btnBrowse_GradeBook.setIcon(new ImageIcon(Main.class.getResource("/checker/resources/File explorer.png")));
		btnBrowse_GradeBook.setFont(new Font("Verdana", Font.BOLD, 12));
		
		txtField_provincePath = new JTextField();
		txtField_provincePath.setColumns(10);
		
		JButton btnBrowse_Province = new JButton("Select Province");
		btnBrowse_Province.setIcon(new ImageIcon(Main.class.getResource("/checker/resources/File explorer.png")));
		btnBrowse_Province.setFont(new Font("Verdana", Font.BOLD, 12));
		
		JButton btnCompare = new JButton("Compare");
		btnCompare.setFont(new Font("Verdana", Font.BOLD, 12));
		btnCompare.setIcon(new ImageIcon(Main.class.getResource("/checker/resources/comparison.png")));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.setFont(new Font("Verdana", Font.BOLD, 12));
		btnPrint.setIcon(new ImageIcon(Main.class.getResource("/checker/resources/printer.png")));
		
		JButton btnDownload = new JButton("Download");
		btnDownload.setFont(new Font("Verdana", Font.BOLD, 12));
		btnDownload.setIcon(new ImageIcon(Main.class.getResource("/checker/resources/Download.png")));
		
		JButton btnEmail = new JButton("Email");
		btnEmail.setFont(new Font("Verdana", Font.BOLD, 12));
		btnEmail.setIcon(new ImageIcon(Main.class.getResource("/checker/resources/email.png")));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(25)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnPrint)
							.addGap(102)
							.addComponent(btnDownload)
							.addPreferredGap(ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
							.addComponent(btnEmail))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(txtField_GradeBook)
								.addComponent(btnBrowse_GradeBook, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGap(48)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(txtField_provincePath)
								.addComponent(btnBrowse_Province, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGap(18)
							.addComponent(btnCompare))
						.addComponent(tabbedPane))
					.addGap(24))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnBrowse_GradeBook)
						.addComponent(btnBrowse_Province)
						.addComponent(btnCompare))
					.addGap(7)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtField_GradeBook, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtField_provincePath, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 218, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnPrint)
						.addComponent(btnEmail)
						.addComponent(btnDownload))
					.addContainerGap(70, Short.MAX_VALUE))
		);
		
		JPanel panel_gradeBook = new JPanel();
		tabbedPane.addTab("GradeBook", null, panel_gradeBook, null);
		
		table_GradeBook = new JTable();
		panel_gradeBook.add(table_GradeBook);
		
		JPanel panel_Province = new JPanel();
		tabbedPane.addTab("Province Employees", null, panel_Province, null);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Comparison", null, panel, null);
		contentPane.setLayout(gl_contentPane);
	}
}
