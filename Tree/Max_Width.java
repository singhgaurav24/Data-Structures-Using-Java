package Tree_Implementation;

import java.util.LinkedList;
import java.util.Queue;

public class Max_Width {
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
		int maxwidth(Node root)
		{
			if(root == null)
				return 0;
			Queue<Node> q = new LinkedList<Node>();
			q.add(root);
			int res = 0;
			while(!q.isEmpty())
			{
				int count = q.size();
				res = Math.max(res,count);
				for(int i = 0 ; i<count;i++)
				{
					Node curr = q.poll();
					if(curr.left != null)
						q.add(curr.left);
					if(curr.right != null)
						q.add(curr.right);
				}
			}
			
			return res;
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
		
		System.out.println("Mximum width of tree     :"+" " +tree.maxwidth(tree.root));
	}

}
