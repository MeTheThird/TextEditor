import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;


public class TextEditor extends JFrame{

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
		
		JMenuItem newFileItem = new JMenuItem("New");
		fileMenu.add(newFileItem);
		JMenuItem DESTROyFileItem = new JMenuItem("DESTROy");
		DESTROYMenu.add(DESTROyFileItem);
		
		bar.add(fileMenu);
		bar.add(DESTROYMenu);
		
		setJMenuBar(bar);
		
	}

}
