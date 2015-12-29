import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class MainFrame extends JFrame{
	public MainFrame(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100,500,500);
		JTabbedPane tabPane = new JTabbedPane();
		tabPane.addTab("Ex1",new Ex1());
		tabPane.addTab("Ex2",new Ex2());
		tabPane.addTab("Ex3",new Ex3());
		tabPane.addTab("Ex4",new Ex4());
		tabPane.addTab("Ex5",new Ex5());
		tabPane.addTab("Ex6",new Ex6());
		tabPane.addTab("Ex7",new Ex7());
		tabPane.addTab("Ex8",new Ex8());
		tabPane.addTab("Ex9",new Ex9());
		tabPane.addTab("Ex10",new Ex10());
		tabPane.addTab("Ex11",new Ex11());
		tabPane.addTab("Ex12",new Ex12());
		tabPane.addTab("Ex13",new Ex13());
		add(tabPane);
	}
	
}
