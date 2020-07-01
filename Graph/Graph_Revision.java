import java.util.*;
public class Graph_Revision {
   public static class Graph{
	   int ver;
	   LinkedList<Integer> adj[];
	   public Graph(int ver)
	   {
	   	this.ver = ver;
	   	adj = new LinkedList[ver];
	   	for(int i = 0;i<ver;i++)
	   	{
	   		adj[i] = new LinkedList<>();
	   	}
	   }
	   void addEdge(int src , int des)
	   {
	       adj[src].add(des);
	       adj[des].add(src);
	   	
	   }

	   void display() {
		   for(int i =0;i<ver;i++)
			{
				if(adj[i].size()>0) // check size of linked list
				{
					System.out.print("Vertices " + i + " is connected to  :  ");
					for(int j = 0 ; j < adj[i].size() ; j++)
					{
						System.out.print(adj[i].get(j) + " ");
					}
					System.out.println();
				}
			}
	   }
   }

	public static void main(String[] args) {
		Graph g = new Graph(3);
		g.addEdge(0,1);
		g.addEdge(0,2);
		g.addEdge(1,2);
		
		g.display();
   }
}
