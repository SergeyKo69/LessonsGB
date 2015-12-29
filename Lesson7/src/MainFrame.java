import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class MainFrame extends JFrame{
	public MainFrame(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100,500,500);
		JTabbedPane tabPane = new JTabbedPane();
		JPanel panel1 = new JPanel(); // Ex. 1
		JPanel panel2 = new JPanel(); // Ex. 2
		tabPane.addTab("Ex1",panel1);
		tabPane.addTab("Ex2",panel2);
		add(tabPane);
	}
}
