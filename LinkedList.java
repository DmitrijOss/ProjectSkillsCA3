
public class LinkedList implements listInterface{
	
		private Node head;		//needed to create the head of the list
		private int numItems; 	//used to keep track of the amount of items in the list
		
	  public boolean isEmpty() {
		  if(numItems != 0) {
			  return false;
		  }else {
			  return true;
		  }
		  
	  }
	  
	  public int size() {
		  return numItems;
		  
	  }
	  
	  public void add(int index, Object item) throws ListIndexOutOfBoundsException{
		  
		  
	  }
	  
	  private Node find(int index) {
		  Node newNode = new Node(index);
		  // --------------------------------------------------
		  // Locates a specified node in a linked list.
		  // Precondition: index is the number of the desired
		  // node. Assumes that 1 <= index <= numItems+1 a
		  // Postcondition: Returns a reference to the desired 
		  // node.
		  // --------------------------------------------------
		  return newNode;	//this isnt finished I just wanted to get rid of the errors so I could run
		  } // end find
	  
	  public void remove(int index) throws ListIndexOutOfBoundsException{
		  
		  
	  }
	  
	  public Object get(int index) throws ListIndexOutOfBoundsException{
		  Node newNode = new Node(index);
		  return newNode;	//this isnt finished I just wanted to get rid of the errors so I could run
	  }
	  
	  public void removeAll() {
		  head = null;
		  numItems = 0;
		  
	  }
}
