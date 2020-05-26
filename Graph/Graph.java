import java.util.*;
public class Graph {
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
void print()
{
	for(int i =0;i<ver;i++)
	{
		if(adj[i].size() > 0) // chaeck size of linked list
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            /*
		    Graph g = new Graph(3);
            g.addEdge(0,1);
            g.addEdge(2,0);
            g.addEdge(1,2);
            */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of vertices");
		int v = sc.nextInt();
		Graph g = new Graph(v);
		for(int i = 0; i<v ;i++)
		{
			System.out.println("Enter src and des vertices");
			int src = sc.nextInt();
			int des = sc.nextInt();
			g.addEdge(src, des);
		}
            g.print();
	}

}
