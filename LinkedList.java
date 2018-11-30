
public class LinkedList implements listInterface{
	
		private Node head;		//needed to create the head of the list
		private int numItems; 	//used to keep track of the amount of items in the list
		
		public LinkedList() {
	        numItems = 0;

		}  // end default constructor
		
	  public boolean isEmpty() {
		  if(numItems != 0) {
			  System.out.println("test");
			  System.out.println("test");
			  System.out.println("test");
			  return false;
		  }else {
			  return true;
		  }
		  
	  }
	  
	  public int size() {
		  return numItems; 
	  }
	  
	public void add(int index, Object item) throws ListIndexOutOfBoundsException{ //conor added 29/11/18
		if (numItems == 0){   //first item
			Node num1 = new Node(item);
			head = num1;
			numItems++;
		}
		else{
			if (numItems == 1){
		
				Node newNode = new Node(item);
				head.setNext(newNode);
				//newNode.setNext(null);
				numItems++;
			}
			else if (index == numItems)
			{

				Node curr = head;
				for(int i = 0; i < index - 1; i++){
					curr = curr.getNext();
				}

				Node newNode = new Node(item);
				curr.setNext(newNode);
				//newNode.setNext(null);
				numItems++;

			}
			else if (index > numItems + 1)
			{
				int difference = (index - numItems);
				System.out.println("Your way off !! Try entering an index of : " + difference + " less");
			}
			else 
			{
				Node curr = head;
				for(int i = 0; i < index; i++){
					curr = curr.getNext();
				}

				Node newNode = new Node(item);
				newNode.setNext(curr.getNext());
				curr.setNext(newNode);

				numItems++;  
			}
		}
	}
	  
	  private Node find(int index) {
		  Node newNode = new Node(index);
		  newNode = head;
		  int find = numItems - index;
		  try {
			  for(int i = 0; i < find; i++) {
				  newNode = newNode.getNext();
			  }
		  }
		  catch(ListIndexOutOfBoundsException err){
			  System.out.println(err);
		  }
		  return newNode;  
	  } // end find
	  
	  public void remove(int index) throws ListIndexOutOfBoundsException{ //conor added 29/11/18
		  if (index>numItems || index<0){
	             throw new ListIndexOutOfBoundsException("Out of boundary");
		  }
		  
			if(index == 0){

				Node bye = head.getNext();
				head.setNext(bye.getNext());
				numItems--;

			}
			else if (index == numItems - 1){

				Node previous = find(index - 1);

				previous.setNext(null);
				numItems--;

			}

			else{
				Node previous = find(index-1);
				Node next = find(index+1);

				previous.setNext(next);
				numItems--;
			}
		  
		  
		  
		  
	  }
	  
	  public Object get(int index) throws ListIndexOutOfBoundsException{
		  Node newNode = new Node(index);
		  return newNode;	//this isnt finished I just wanted to get rid of the errors so I could run
	  }
	  
	  
	  public void display(){ //conor added 29/11/18
		  
		  int i = 0; // only used for displaying number of nodes
		  
		  Node curr = head;
		  //curr = curr.getNext();
		  
		  while(curr != null){
			  System.out.print(i);
			  curr.display();
			  curr = curr.getNext();
			  i++; // only used for displaying number of nodes

		  }
	  }
	  
	  
	  
	  public void removeAll() {
		  head = null;
		  numItems = 0;
		  
	  }
}
