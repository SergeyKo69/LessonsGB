import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
// Field with button.

public class ChooseField extends JPanel{
	JButton button;
	JTextField field;
	public ChooseField(){
		setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		field = new JTextField();
		field.setBorder(BorderFactory.createLineBorder(Color.white));
		button = new JButton("...");
		add(field, BorderLayout.CENTER);
		add(button, BorderLayout.LINE_END);
		
	}
	
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		field.setBounds(1,2,getWidth()-button.getWidth()-1,getHeight()-3);
		button.setBounds(getWidth()-button.getWidth(), 1, button.getHeight(), getHeight()-2);
	}



	public void setActionCommand(String name){
		this.button.setActionCommand(name);
	}
	
	public void setActionListener(ActionListener actionListener){
		button.addActionListener(actionListener);
	}
			
}
