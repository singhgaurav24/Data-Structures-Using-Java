import java.util.*;

public class Reverse_LL {
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
		
		//M-1
		Node reverse(Node head)
		{
			ArrayList<Integer> arr = new ArrayList<Integer>();
			Node curr;
			for(curr = head; curr!= null ; curr = curr.next)
			{
				arr.add(curr.data);
			}
			for(curr = head; curr!= null ; curr = curr.next)
			{
				curr.data = arr.remove(arr.size()-1);
			}
			return head;
		}
		
		//m-2 efficient solution
		
		Node rev(Node head)
		{
			Node current = head;
		    while(current != null)
		    {
		    	
		    }
			return head;
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
    	System.out.println("Before ");
	l1.print();
	l1.reverse(l1.head);
	    System.out.println("After ");
	l1.print();
   }
}
	
