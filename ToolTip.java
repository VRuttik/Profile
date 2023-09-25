package first;
import javax.swing.*;
public class ToolTip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame f = new JFrame("Tool Tip");
		
		JPasswordField value = new JPasswordField();
		value.setBounds(100,100,100,30);
		value.setToolTipText("Enter your Password:");
		
		JLabel l1 = new JLabel("Password:");
		l1.setBounds(20,100,80,30);
		
		f.add(value);f.add(l1);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);

	}
