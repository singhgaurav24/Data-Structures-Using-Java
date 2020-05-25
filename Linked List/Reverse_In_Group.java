
import java.util.*;
public class Reverse_In_Group {
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
			
			Node head;
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
			// method to reverse in group
				
			
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LL l1 = new LL();
		int key = 3;
		l1.insert(15);
		l1.insert(25);
		l1.insert(35);
		l1.insert(45);
		l1.insert(55);
		l1.insert(75);
	    	System.out.println("Before ");
		l1.print();
		   reverseInGrp(l1.head,key);
		l1.print();
	}
	static Node reverseInGrp(Node head, int key)
	{
		Node curr = head;
		Node prev = null , next = null;
		int count =0;
		while(curr != null && count <key)
		{
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
			count++;
		}
		return prev;
	}

}
