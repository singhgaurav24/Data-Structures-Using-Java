//import InsertAtEnd.Node;

public class InsertBetween {
     
     static class Node
     {
    	int data;
    	Node next;
    	Node(int d)
    	{
    		data =d;
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
    	 void insert(Node prev_node, int new_data)
    	 {
    	    
    		 if(prev_node == null)
    		 {
    			 System.out.println("Previous node can not be null");
    			 return;
    		 }
    		 Node new_node = new Node(new_data);
    		 new_node.next = prev_node.next;
    		 prev_node.next = new_node;
    	 }
    	 
    	 void print()
    	 {
    		 Node current = head;
 	    	 while(current != null)
 	    	{
 	    		System.out.print(current.data +" ");
 	    		current = current.next;
 	    	}
    	 }
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LList l1 = new LList();
		
		l1.insetAtBegain(10);
		l1.insetAtBegain(15);
		
		
		l1.insert(l1.head.next,44);
		l1.print();

	}

}
