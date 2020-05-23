import java.util.ArrayList;
import java.util.*;
public class DFS_Implementation {
	 static void addEdge(ArrayList<ArrayList<Integer>> adj, int u , int v) 
	  
		{
			adj.get(u).add(v);
			adj.get(v).add(u);
		}
	 
	 static void DfsRec(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited)
	 {
		  visited[s] = true;
		  System.out.print(s+ "  ");
		  for(int u: adj.get(s))
		  if(visited[u] == false)
			  
			  DfsRec(adj, u ,visited);
	 }
	 static void Dfs(ArrayList<ArrayList<Integer>> adj, int v , int s)
	 {
		 boolean visited[] = new boolean[v];
			//for(int i = 0;i<v;i++)
				
				//if(visited[i] = false)
				//DfsRec(adj,i,visited);
		DfsRec(adj, s, visited);
	 }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int v=5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>> ();
		for(int i=0;i<v;i++)
			 adj.add(new ArrayList<Integer>());
		
		//adding edge
		addEdge(adj, 0,1);
		addEdge(adj, 0,2);
		addEdge(adj, 1,2);
		addEdge(adj, 1,3);
		addEdge(adj, 3,4);
		
		Dfs(adj,5,1);
		

	}

}
