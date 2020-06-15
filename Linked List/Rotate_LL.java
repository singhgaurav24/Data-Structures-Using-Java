// rotate the linked list counter-clockwise by k nodes
public class Rotate_LL {
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
		public static Node rotate(Node head, int k) {
           
           if(k<=0)
        	   return head;
           Node curr = head;
			int count =0;
			while(count<k && curr!=null)
			{
				curr = curr.next;
				count++;
			}
			if(curr == null)
				return head;
			Node kth = curr;
			
			while(curr.next!=null)
			{
				curr = curr.next;
				curr.next = head;
				head = kth.next;
				kth.next = null;
			}
			
			return head;
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
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LL l1 = new LL();
       
		l1.insert(8);
		l1.insert(7);
		l1.insert(6);
		l1.insert(5);
		l1.insert(4);
		l1.insert(3);
		l1.insert(2);
		l1.insert(1);
		
		l1.print();
		l1.rotate(l1.head, 4);
		l1.print();
	}

}
