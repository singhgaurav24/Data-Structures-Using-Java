package Tree_Implementation;

import Tree_Implementation.Print_Level_Order.Node;

public class Create_Tree {
	
	static class Node
	{
		int data;
		Node left,right;
		
		Node(int x)
		{
			data = x;
		}
	}
	static class Tree_Implementation
	{
		Node root;
		
		void inOrder(Node root)
		{
			
		   if(root!=null)
		   {
			   inOrder(root.left);
			   System.out.print(root.data+" ");
			   inOrder(root.right);
		   }
		}
		
		void preOrder(Node root)
		{
			if(root!=null)
			{
				System.out.print(root.data+" ");
				preOrder(root.left);
				preOrder(root.right);
			}
		}
		
		void postOrder(Node root)
		
		{
			if(root!=null)
			{
				postOrder(root.left);
				postOrder(root.right);
				System.out.print(root.data+" ");
			}
		}
		void printLevelOrder(Node root)
		{
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree_Implementation tree = new Tree_Implementation();
		tree.root = new Node(10);
		tree.root.left = new Node(20);
		tree.root.right = new Node(25);
		tree.root.left.left = new Node(30);
		tree.root.left.right = new Node(35);
		tree.root.right.right =  new Node(40);
		
		
		System.out.print("In-order Traversal    :"+"    ");
		tree.inOrder(tree.root);
		
		System.out.println();
		
		System.out.print("Pre-order Traversal   :"+"    ");
		tree.preOrder(tree.root);
		
		System.out.println();
         
		System.out.print("Post-order Traversal  :"+"    ");
		tree.postOrder(tree.root);
	}

}
