package Tree_Implementation;

import java.util.LinkedList;
import java.util.Queue;


public class Level_Order_Traversal_Line_by_Line {
	
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
		void printLineByLine()
		{
			if(root == null)
				return;
			Queue<Node> q = new LinkedList<Node>();
			q.add(root);
			q.add(null);
			while(q.size()>1)
			{
				Node curr = q.poll();
				if(curr==null)
				{
					System.out.println();
					q.add(null);
					continue;
				}
				System.out.print(curr.data+" ");
				if(curr.left!=null)
				{
					q.add(curr.left);
				}
				if(curr.right!=null)
				{
					q.add(curr.right);
				}
			}
		}
		
		int getSize(Node root)
		{
			if(root==null)
			{
				return 0;
			}
			else
			{
				return 1+getSize(root.left)+getSize(root.right);
			}
		}
		
		int getMax(Node root)
		{
			if(root == null)
			{
				return Integer.MIN_VALUE;
			}
			else
			{
				return Math.max(root.data, Math.max(getMax(root.left),getMax(root.right)));
			}
		}
		
		int getHeight(Node root)
		{
			if(root==null)
			{
				return 0;
			}
			else
			{
				return Math.max(getHeight(root.left), getHeight(root.right))+1;
			}
		}
		boolean isBalanced(Node root)
		{
			if(root == null)
			{
				return true;
			}
			int l = getHeight(root.left);
			int r = getHeight(root.right);
			
			return (Math.abs(l-r)<=1 && isBalanced(root.left) && isBalanced(root.right));
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
		
		System.out.println("Print Level Order Line By Line : ");
		
		tree.printLineByLine();
		
        System.out.println();
        
        System.out.println("size of the tree is       :"+" " +tree.getSize(tree.root));
        
        System.out.println("Maximum of the tree is    :"+" " +tree.getMax(tree.root));
        
        System.out.println("Height of the tree is     :"+" " +tree.getHeight(tree.root));

        System.out.println("Check tree is balance     :"+" " +tree.isBalanced(tree.root));
	}

	}
