import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.WindowConstants;


public class MainMenu extends JFrame{

	   public MainMenu(){
	JMenuBar mainMenuBar = new JMenuBar();
	setTitle("My first Menu");
	JMenu fileMenu = new JMenu("File");
	JMenu editMenu = new JMenu("Edit");
	JMenu aboutMenu = new JMenu("About");
	JMenu openTab = new JMenu("Open");
	JMenuItem closeTab = new JMenuItem("Close");
	JMenuItem deleteTab = new JMenuItem("Delete");
	JMenuItem aboutTab = new JMenuItem("About us");
	 
	closeTab.addMouseListener(new MouseAdapter() {
	
	@Override
	public void mousePressed(MouseEvent arg0) {
		System.exit(0);
	}
	
	});
	
	JMenuItem fromFile = new JMenuItem("From File");
	openTab.add(fromFile);
   	
	fileMenu.add(openTab);
	fileMenu.add(closeTab);
	editMenu.add(deleteTab);
	aboutMenu.add(aboutTab);
	
	mainMenuBar.add(fileMenu);
	mainMenuBar.add(editMenu);
	mainMenuBar.add(aboutMenu);

	
	
	
	setJMenuBar(mainMenuBar);
	setSize(300, 300);
	setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	setVisible(true);
	
	
	   }
	
	   public static void main(String[] args) {
		  MainMenu mainMenu = new MainMenu();
	}
	   
	
}
