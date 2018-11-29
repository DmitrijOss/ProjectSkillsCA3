import java.awt.event.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;

public class main extends JFrame implements ActionListener {
	
	public main(){
		
		setTitle("Frame");
		setSize(500,500);
		
		JButton addButton = new JButton("Add Button");
		JButton removeButton = new JButton("Remove Button");
		JButton searchButton = new JButton("Search Button");
		JTextField textField = new JTextField(20);
		
		//textField.setPreferredSize(new Dimension(150, 30));
		
		JLabel label = new JLabel ("Search");
		
		
		addButton.addActionListener(this);
		removeButton.addActionListener(this);
		searchButton.addActionListener(this);
		
		JPanel panel = new JPanel();
		
		panel.add(addButton);asda
		panel.add(removeButton);
		panel.add(searchButton);
		panel.add(textField);
		panel.add(label);
		
		this.getContentPane().add(panel);
		
		setVisible(true);
		setResizable(false);
		
		String text = textField.getText();
		if(text.isEmpty()) {
			
			label.setText("Field is empty");
			
		}//end if
		
		else {
			
			label.setText(text);
			
		}//end else
		
	}//end main
	
	public void actionPerformed(ActionEvent e) {
		
		System.out.println("button works");
		
	}//end action

public static void main(String[] args){
	
	main main = new main();
	
	System.out.println("Hi if ur reading this then I got github working");
 
	System.out.println("Trying to create a new branch");
 
	System.out.println("Dillon edited this 28/11/18 15:17"); 
 
	}//end main

}//end class
