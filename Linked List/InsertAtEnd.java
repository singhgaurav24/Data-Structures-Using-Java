//import Implementation.Node;

public class InsertAtEnd {
	
	static class Node
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
		
		void insertAtEnd(int x)
		{
			Node temp = new Node(x);
			if(head==null)
			{
				head = temp;
				return;
			}
			temp.next = null;
			
			Node current = head;
			while(current.next != null)
			
				current = current.next;
				current.next = temp;
			
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
		l1.insertAtEnd(10);
		l1.insertAtEnd(5);
		l1.insertAtEnd(20);
		
		l1.print();
		
	}

}
