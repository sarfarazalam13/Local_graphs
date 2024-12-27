import java.util.*;
public class graphsArayListAray {
    private ArrayList<ArrayList<Integer>>gra;

     graphsArayListAray(int ver)
    {
        gra=new ArrayList<>();
        for(int i=0;i<ver;i++)
        {
            gra.add(new ArrayList<>());
        }

    }
    public void addEdge(int src,int dest)
    {
        gra.get(src).add(dest);
        gra.get(dest).add(src);
    }
    public void bfs(int start)
    {
        boolean []vis=new boolean[gra.size()];
        Queue<Integer>q=new LinkedList<>();
        q.add(start);
        vis[start]=true;
        while(!q.isEmpty())
        {
            int curr=q.poll();
            System.out.print(curr+" ");
            ArrayList<Integer> neighbours=gra.get(curr);
            for(int i=0;i<neighbours.size();i++)
            {
                int neigh=neighbours.get(i);
                if(!vis[neigh])
                {
                    q.add(neigh);
                    vis[neigh]=true;
                }
            }
            
        }System.out.println();

    }
    public void dfs(int start)
    {
        boolean vis[]=new boolean[gra.size()];
        Stack<Integer>stk=new Stack<>();
        stk.push(start);
        while(!stk.isEmpty())
        {
            int curr=stk.pop();
            if(!vis[curr])
            {
                System.out.print(curr+" ");
                vis[curr]=true;
            }
            for(int arr:gra.get(curr))
            {
                if(!vis[arr])
                {
                    stk.push(arr);
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create a graph with 6 vertices
        graphsArayListAray graph = new graphsArayListAray(6);

        // Add edges
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 5);
        graph.addEdge(4, 5);

        // Perform BFS and DFS traversals
        graph.bfs(0);           // BFS starting from vertex 0
        graph.dfs(0);  // DFS (iterative) starting from vertex 0
                   // DFS (recursive) starting from vertex 0
    }
}
