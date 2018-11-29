import java.awt.event.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;

public class main extends JFrame implements ActionListener {

	public main(){

		//GUI is done just the linked list needs to be displayed on the label

		setTitle("Frame");
		setSize(500,500);

		JButton addButton = new JButton("Add to List");
		JButton removeButton = new JButton("Remove from List");
		JButton searchButton = new JButton("Search in List");
		JTextField textFieldAdd = new JTextField(25);
		JTextField textFieldRemove = new JTextField(25);
		JTextField textFieldSearch = new JTextField(25);

		JLabel label = new JLabel ("List will appear here");


		addButton.addActionListener(this);
		removeButton.addActionListener(this);
		searchButton.addActionListener(this);

		JPanel panel = new JPanel();

		panel.add(textFieldAdd);
		panel.add(addButton);

		panel.add(textFieldRemove);
		panel.add(removeButton);

		panel.add(textFieldSearch);
		panel.add(searchButton);

		panel.add(label);

		this.getContentPane().add(panel);

		setVisible(true);
		setResizable(false);

		//String text = <LINKEDLIST CONTENTS>
		//
		//need to convert the linked list to a string that can be displayed here
		//
		//label.setText(text);

	}//end main

	public void actionPerformed(ActionEvent e) {

		System.out.println("button works");

	}//end action

public static void main(String[] args){

	main main = new main();

	System.out.println("Hi if ur reading this then I got github working");

	System.out.println("Trying to create a new branch");

	System.out.println("Dillon edited this 28/11/18 15:17");
	
	LinkedList la = new LinkedList();




	
	try{                        //conor added 29/11/18
		la.add(0,"Bread ");
		la.add(1,"Milk");
		la.add(2,"Cereal");
		la.add(3,"Coffee");
		la.add(4,"Sugar");
		la.add(5,"Beer");
		la.add(6,"Chicken");
		la.add(7,"Rice");
		la.add(8,"Wine");
		la.add(9,"Cakes");
	}
	catch(ListIndexOutOfBoundsException e)
	{
		//e.printStackTrace();
		System.out.println("Invalid index!!");
	}

	// Display the list
	la.display();
	System.out.println("List size is " + la.size());
	
	
	
	

	}//end main

}//end class
