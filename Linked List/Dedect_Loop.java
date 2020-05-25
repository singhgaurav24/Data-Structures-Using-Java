
import java.util.*;
public class Dedect_Loop {
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
		
		static boolean isLoop(Node haed)
		{
			HashSet<Node> s = new HashSet<Node>();			
			for(Node curr = head ; curr != null ; curr = curr.next)
			{
				if(s.contains(curr))
				   return true;
				s.add(curr);
				
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
	//l1.head.next.next.next.next = l1.head;
    	System.out.println("Before ");
	l1.print();
	if(l1.isLoop(l1.head))
	{
	    System.out.println("Loop Found");
	}
	else
	{
		System.out.println("Loop Not Found");
	}
}
}
