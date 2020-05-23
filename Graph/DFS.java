import java.util.*;
public class DFS {
 private int V;
 private LinkedList<Integer> adj[];
 DFS(int v)
 {
	 V=v;
	 adj = new LinkedList[v];
	 for(int i = 0;i<v;i++)
	 {
		 adj[i] = new LinkedList();
	 }
 }
 void addEdge(int v , int w)
 {
	 adj[v].add(w);
 }
 void dFS(int v)
 {
	 boolean visited[] = new boolean[V];
	 dFS1(v,visited);
 }
 void dFS1(int v , boolean visited[])
 { 
	 visited[v] = true;
	 System.out.print(v+ " -> ");
	 Iterator<Integer> i = adj[v].listIterator();
	 while(i.hasNext())
	 {
		 int n = i.next();
		 if(!visited[n])
		 {
			 dFS1(n,visited);
		 }
	 }
	 
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           DFS g = new DFS(4);
           g.addEdge(0, 1);
           g.addEdge(0, 2);
           g.addEdge(1, 2);
           g.addEdge(2, 0);
           g.addEdge(2, 3);
           g.addEdge(3, 3);

           System.out.println("Following is Depth First Traversal "+
                              "(starting from vertex 2)");

           g.dFS(2);
           System.out.print("null");
	}

}
