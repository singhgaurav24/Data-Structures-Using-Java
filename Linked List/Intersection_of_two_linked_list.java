public class Intersection_of_two_linked_list {

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
		int intersectPoint(Node headA, Node headB)
		{
	         // code here
	         Node pa = headA, pb = headB;
	         while (pa != pb) {
	            pa = (pa != null) ? pa.next : headB;
	            pb = (pb != null) ? pb.next : headA;
	        }
	        return pa.data;
		
		}
		
		
		
		void print()
		{
			Node n = head;
			System.out.print("  Elements of Linked List is:  ");
			while(n!=null)
			{
				
				System.out.print(n.data+ " ");
				n = n.next;
			}
			    System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LL l1 = new LL();
		LL l2 = new LL();
		l1.insert(15);
		l1.insert(25);
		l1.insert(35);
		l1.insert(45);
		l1.insert(55);
		
		l2.insert(10);
		l2.insert(17);
		l2.insert(35);
		l2.insert(47);
		l2.insert(11);
	    	
		
//		l1.print();
//		l2.print();
		
		System.out.println(getIntersection(l1.head,l2.head));
		
	}
	
	public static Node getIntersection(Node head1 , Node head2)
	{
		
		Node h1 = head1;
		Node h2 = head2;
		while(h1 != null)
		{
			for(h2 = head2 ; h2 != null ; h2 = h2.next)
			{
				if(h1 == h2)
				{
					return h1;
				}
			}
			h1 = h1.next;
		}
//		return null;
		return h2;
	}
}

