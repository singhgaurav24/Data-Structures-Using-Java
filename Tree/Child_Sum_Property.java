package Tree_Implementation;

import Tree_Implementation.Lefi_View_Of_Binary_Tree.Level;
import Tree_Implementation.Lefi_View_Of_Binary_Tree.Node;

public class Child_Sum_Property {
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
		
		void printChild(Node root)
		{
			//int sum;
		    //sum = root.left.data+root.right.data;
	       if(root == null)
	       
	    	   System.out.println("yes");
	       
	       if(root.left == null && root.right == null)
	       
	    	   System.out.println("yes");
	       
	       int sum =0;
	       if(root.left != null)
	    	   
	       {
	    	   sum += root.left.data;
	       }
	       if(root.right != null)

	       {
	    	   sum += root.right.data;
	       }
	       if( (root.data == sum) )
	       {
	    	   System.out.println("yes");
	       }
	    	
	       
	        
	       
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Level tree = new Level();
		tree.root = new Node(10);
		tree.root.left = new Node(5);
		tree.root.right = new Node(5);
		tree.root.left.left = new Node(3);
		tree.root.left.right = new Node(2);
		tree.root.right.left = new Node(2);
		tree.root.right.right =  new Node(1);
        
		tree.printChild(tree.root);
		
	}

}
