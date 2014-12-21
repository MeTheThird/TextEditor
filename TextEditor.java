import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JFrame;
//import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
//import javax.swing.JPanel;
import javax.swing.JTextArea;


public class TextEditor extends JFrame {

	public static void main(String[] args) {
		new TextEditor();
	}
	
	public TextEditor() {
		super("text editor");
		setSize(500, 500);
		
		initialize();
		
		setVisible(true);
	}

	private void initialize() {
		JTextArea area = new JTextArea();
		area.setLineWrap(true);
		add(area);
		
		JMenuBar bar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenu DESTROYMenu = new JMenu("DESTROY!");
		JMenu HiMenu = new JMenu("Hi");
		JMenu DESTROYMenus = new JMenu("DESTROY Menus");
		JMenu DESTROYPages = new JMenu("DESTROY Pages");
		
		
		JMenuItem newFileItem = new JMenuItem(new AbstractAction("New") {

			@Override
			public void actionPerformed(ActionEvent e) {
				new TextEditor();
			}
			
		});
		fileMenu.add(newFileItem);
		
		
		JMenuItem DESTROyFileItem = new JMenuItem("DESTROy");
		JMenuItem clickHereToDESTROyFileItem = new JMenuItem("Click here to DESTROY!");
		
		DESTROYMenu.add(DESTROyFileItem);
		DESTROYMenu.add(clickHereToDESTROyFileItem);
		
		
		JMenuItem helloFileItem = new JMenuItem(new AbstractAction("Hello") {

			@Override
			public void actionPerformed(ActionEvent e) {
				area.setText("Hello");
			}
			
		});
		JMenuItem byeFileItem = new JMenuItem(new AbstractAction("Bye") {

			@Override
			public void actionPerformed(ActionEvent e) {
				area.setText("Bye");
			}
			
		});
		
		HiMenu.add(helloFileItem);
		HiMenu.add(byeFileItem);
		
		
		JMenuItem DESTROYFileFileItem = new JMenuItem("DESTROY File Menu");
		JMenuItem DESTROYDESTROYFileItem = new JMenuItem("DESTROY DESTROY! Menu");
		JMenuItem DESTROYHiFileItem = new JMenuItem("DESTROY Hi Menu");
		JMenuItem DESTROYDESTROYPageFileItem = new JMenuItem("DESTROY DESTROY Page Menu");
		
		DESTROYMenus.add(DESTROYFileFileItem);
		DESTROYMenus.add(DESTROYDESTROYFileItem);
		DESTROYMenus.add(DESTROYHiFileItem);
		DESTROYMenus.add(DESTROYDESTROYPageFileItem);
		
		
		JMenuItem DESTROYPageFileItem = new JMenuItem(new AbstractAction("DESTROY all pages") {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
			
		});
		DESTROYPages.add(DESTROYPageFileItem);
		
		bar.add(fileMenu);
		bar.add(DESTROYMenu);
 		bar.add(HiMenu);
 		bar.add(DESTROYMenus);
 		bar.add(DESTROYPages);
		
		setJMenuBar(bar);
		
	}

}
