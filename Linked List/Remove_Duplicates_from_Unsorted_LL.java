
public class Remove_Duplicates_from_Unsorted_LL {
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
		public Node removeDuplicates(Node head) 
	    {
			if(head == null)
				return null;
			
		//	Node temp = head;
			for(Node curr = head ; curr!=null ; curr = curr.next)
			{
				if(curr == curr.next)
				{
				   	
				}
			}
	         return head;
			
	    }
		void print()
		{
			Node n = head;
			System.out.print("Elements of Linked List is:  ");
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
		
		l1.insert(65);
		l1.insert(505);
		l1.insert(45);
		l1.insert(350);
		l1.insert(35);
		l1.insert(15);
		l1.print();
	}

}
