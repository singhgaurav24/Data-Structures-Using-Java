
public class Remove_Duplicate_In_Sorted_LL {
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
		Node removeDuplicates(Node root)
	    {
			if(root == null)
				return null;
				Node temp = root;
				while(temp.next != null){
				if(temp.data == temp.next.data)
				temp.next = temp.next.next;
				else
				temp = temp.next;
				}
			return root;
			
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

		l1.insert(65);
		l1.insert(55);
		l1.insert(45);
		l1.insert(35);
		l1.insert(35);
		l1.insert(15);
		l1.print();
		//System.out.println();
		l1.removeDuplicates(l1.head);
		l1.print();
	}

}
