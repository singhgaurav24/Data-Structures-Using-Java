import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
   public static void addEdge(ArrayList<ArrayList<Integer>> adj , int u , int v)
   {
	   adj.get(u).add(v);
	   adj.get(v).add(u);
   }
   /*
   public static void  printGraph(ArrayList<ArrayList<Integer>> adj)
   {
	   for(int i = 0 ;i < adj.size(); i++)
		{
			System.out.print("Adjancy List of index  " +  i  +" : ");
			for (int j = 0; j < adj.get(i).size(); j++) {
               System.out.print(" -> "+adj.get(i).get(j));
			}
			System.out.println();
		}
   }
   
   */
   public static void bFs(ArrayList<ArrayList<Integer>> adj , int v , int s)
   {
	   boolean visited[] = new boolean[v+1];
	   Queue<Integer> q = new LinkedList<Integer>();
	   visited[s] = true;
	   q.add(s);
	   while(q.isEmpty() == false)
	   {
		   int u = q.poll();
		   System.out.print(u+" ");
		   for(int x : adj.get(u))
		   {
			   if(visited[x] == false)
			   {
				   visited[x] =true;
				   q.add(x);
			   }
		   }
	   }
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int V = 6;
        ArrayList<ArrayList<Integer> > adj 
                    = new ArrayList<ArrayList<Integer> >(V+1);
        
        for (int i = 0; i < V+1; i++)
            adj.add(new ArrayList<Integer>());

        // Adding edges one by one
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 2, 4);
        addEdge(adj, 2, 5);
        addEdge(adj, 3, 5);
        addEdge(adj, 4, 5);
        addEdge(adj, 4, 6);
        addEdge(adj, 5, 6);
        
    //    printGraph(adj);
        System.out.print("BFS of the Graph is :   ");
        bFs(adj,6,1);	
        }

}
