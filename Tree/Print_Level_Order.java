package Tree_Implementation;

import java.util.LinkedList;
import java.util.Queue;

import Tree_Implementation.Create_Tree.Node;
import Tree_Implementation.Create_Tree.Tree_Implementation;

public class Print_Level_Order {
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
		
		void printLevelOrder()
		{
			if(root==null)
				return;
			Queue<Node> q = new LinkedList<Node>();
			q.add(root);
			while(q.isEmpty()==false)
			{
				Node curr = q.poll();
				System.out.print(curr.data + " "); 
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
		
		System.out.print("Print Level Orde   :"+"  ");
		tree.printLevelOrder();
		
	}

}
