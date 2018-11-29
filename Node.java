public class Node {		//I used this code from our Data structures Lab 2
  private Object item;
  private Node next;

  public Node(Object newItem) {
    item = newItem;
    next = null;
  } // end constructor

  public Node(Object newItem, Node nextNode) {
    item = newItem;
    next = nextNode;
  } // end constructor

  public void setItem(Object newItem) {
    item = newItem;
  } // end setItem

  public Object getItem() {
    return item;
  } // end getItem

  public void setNext(Node nextNode) {
    next = nextNode;
  } // end setNext

  public Node getNext() {
    return next;
  } // end getNext
  
 public void display() //conor added 29/11/18
{
	 System.out.println(item);
}
  

} // end class Node

