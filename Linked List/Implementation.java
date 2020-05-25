
  public class Implementation {
  static  class Node
   {
	   int data;
	   Node next;
	   Node(int d)
	   {
		   data = d;
	   }
   }
   
   static class LList
   {
	    Node head;
	    void insetAtBegain(int x)   
	    {
	    	Node temp = new Node(x);
	    	temp.next = head;
	    	head = temp;
	    	
	    }
	   void delete(int key)
	   {
		   Node temp = head , prev = null;
		   if(temp != null && temp.data == key)
		   {
			  head = temp.next;
			  return;
		   }
		   while(temp != null && temp.data != key)
		   {
			   prev = temp;
			   temp = temp.next;
		   }
		   if(temp == null)
		    return;
		   prev.next = temp.next;
	   }
	    void printList()
	    {
	    	Node current = head;
	    	while(current != null)
	    	{
	    		System.out.print(current.data +" ");
	    		current = current.next;
	    	}
	    	System.out.println();
	    }
	 
   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
         LList l1 = new LList();
         l1.insetAtBegain(20);
         l1.insetAtBegain(5);
         l1.insetAtBegain(30);
         l1.insetAtBegain(40);
         l1.insetAtBegain(50);
         l1.insetAtBegain(60);
         l1.insetAtBegain(70);
         l1.insetAtBegain(80);
         
        // l1.delete(20);
         
         l1.printList();
         
         int c = getcount(l1.head);
         System.out.println("Total Number of node is :"+"  "+c);
         
	}
	 static int getcount(Node head)
	    {
	    	
	    	if(head == null) {
	    		return 0;
	    	}
	    	else
	    	{
	    		return 1 + getcount(head.next);
	    	}
	    	
	    	
	    }

}
    
  