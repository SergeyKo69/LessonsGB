import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class Ex1 extends JPanel{
	public Ex1(){
		//setLayout(new GridLayout(10,1));
		JPanel pTitle = new JPanel();
		JLabel lblTitle = new JLabel();
		lblTitle.setText("Exercise №1");
		lblTitle.setFont(new Font(lblTitle.getFont().getName(),Font.BOLD,16));
		pTitle.add(lblTitle);
		add(pTitle);
		JPanel pDescr = new JPanel();
		//pDescr.setLayout(new GridLayout(2,2));
		JLabel lblDescr = new JLabel("Description:");
		pDescr.add(lblDescr);
		JFormattedTextField txtDescr = new JFormattedTextField();
		txtDescr.setText("Ввести строки из файла, записать их в стек. "
				+ "Вывести строки в файл в обратном порядке.");
		txtDescr.setEnabled(false);
		
		pDescr.add(txtDescr);
		add(pDescr);
	}
}
