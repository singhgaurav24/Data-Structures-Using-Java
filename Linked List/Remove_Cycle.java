public class Remove_Cycle {
	static class Node
	{
		int data;
		Node next;
		
		Node(int d)
		{
			this.data = d;
		}
	}
	
	
	static class LL
	{
		
		static Node head;
		void insert(int x)
		{
			Node temp = new Node(x);
			temp.next = head;
			head = temp;
		}
		
		
		void print()
		{
			Node n = head;
			System.out.print(" Elements of Linked List is:  ");
			while(n!=null)
			{
				
				System.out.print(n.data+ " ");
				n = n.next;
			}
			    System.out.println();
		}
		
		static void removeLoopFloyd(Node haed)
		{
			Node slow = head;
			Node fast = head;
			while(fast != null && fast.next != null)
			{
				slow = slow.next;
				fast = fast.next.next;
				if(slow == fast)
				 break;
			}
			 if( slow != fast)
				 return;
			 slow = head;
			 while(slow.next != fast.next)
			 {
				 slow = slow.next;
				 fast = fast.next;
			 }
			 fast.next = null;
			
		}
			
		
}
public static void main(String[] args) {
	// TODO Auto-generated method stub
	LL l1 = new LL();

	l1.insert(15);
	l1.insert(25);
	l1.insert(35);
	l1.insert(45);
	l1.insert(55);
	l1.insert(75);
	
	//l1.head.next.next = l1.head;
	l1.head.next.next = l1.head.next;
    	//System.out.println("Before ");
	//l1.print();
	
	l1.removeLoopFloyd(l1.head);
	l1.print();
}
}
