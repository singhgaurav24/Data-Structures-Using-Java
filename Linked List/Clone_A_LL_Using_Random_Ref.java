
public class Clone_A_LL_Using_Random_Ref {
public static class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		this.data = d;
	}	static class LL
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
		l1.insert(15);
		l1.insert(25);
		l1.insert(35);
		l1.insert(45);
		l1.insert(55);
	    	
		
		l1.print();
		
	}
}}

