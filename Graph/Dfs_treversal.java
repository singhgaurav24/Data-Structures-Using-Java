import java.util.*;
public class Dfs_treversal {
static class Graph
{
	int ver;
	LinkedList<Integer> adj[];
	@SuppressWarnings("unchecked")
	public Graph(int ver)
	{
		this.ver = ver;
		adj = new LinkedList[ver];
		
		for(int i = 0 ; i<ver; i++)
		{
			adj[i] = new LinkedList<>();
		}
	}
	void addEdge(int src , int des)
	{
		adj[src].add(des);
		adj[des].add(src);
	}
	 void dfs(int startver)
	 {
		 boolean visited[] = new boolean[ver];
		 dfsRec(startver , visited);
	 }
	 void dfsRec(int start , boolean visited[])
	 {
		 visited[start] = true;
		 System.out.print(start+" ");
		 for(int i = 0; i<adj[start].size();i++)
		 {
			 int des = adj[start].get(i);
			 if(!visited[des])
				 dfsRec(des,visited);
		 }
	 }
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g = new Graph(5);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,2);
        g.addEdge(1,3);
        g.addEdge(3,4);
        g.dfs(0);
        
	}

}
