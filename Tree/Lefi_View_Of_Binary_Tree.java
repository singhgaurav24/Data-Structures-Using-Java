package Tree_Implementation;

import Tree_Implementation.Level_Order_Traversal_Line_by_Line.Level;
import Tree_Implementation.Level_Order_Traversal_Line_by_Line.Node;

 public class Lefi_View_Of_Binary_Tree {
	static class Node
	{
		int data;
		Node left,right;
		
		Node(int x)
		{
			data = x;
		}
	}
	static class Level
	{
		Node root;
		int max_level;
		void printLeftView(Node root , int level)
		{
		   if(root==null)
			{
				return;
			}
		   if(level >= max_level)
		   {
			   System.out.print(root.data+" ");
			   max_level++;
		   }
		   
			   
		   printLeftView(root.left,  level+1);
		   printLeftView(root.right, level+1);
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Level tree = new Level();
		tree.root = new Node(10);
		tree.root.left = new Node(20);
		tree.root.right = new Node(25);
		tree.root.left.left = new Node(30);
		tree.root.left.right = new Node(35);
		tree.root.right.right =  new Node(40);
		
		tree.printLeftView(tree.root,0);
	}

}
