import java.util.HashSet;

public class Floyd_Cycle_Detection {

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
		
		static boolean isLoopFloyd(Node haed)
		{
			Node slow = head;
			Node fast = head;
			while(slow != null && fast.next != null)
			{
				slow = slow.next;
				fast = fast.next.next;
				if(slow == fast)
				{
					return true;
				}
			}
			
			return false;
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
	l1.insert(45);
	//l1.head.next.next = l1.head;
	l1.head.next.next.next.next = l1.head;
    	//System.out.println("Before ");
	//l1.print();
	
	if(l1.isLoopFloyd(l1.head))
	{
	    System.out.println("Loop Found");
	}
	else
	{
		System.out.println("Loop Not Found");
	}
}
}
