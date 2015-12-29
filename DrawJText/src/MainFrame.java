import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainFrame extends JFrame implements ActionListener {
	public MainFrame(){
		setBounds(100,100,500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(20, 10));
		ChooseField chooseField = new ChooseField();
		chooseField.setActionCommand("Test");
		chooseField.setActionListener(this);
		add(chooseField);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Testing click");
	}
}
