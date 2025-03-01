import java.util.*;
public class fullgraph {
    private ArrayList<ArrayList<Integer>>gra;

    fullgraph(int vertices)
    {
        gra=new ArrayList<>();
        for(int i=0;i<vertices;i++)
        {
            gra.add(new ArrayList<>());
        }
    }

    public void add(int src,int dest)
    {
        gra.get(src).add(dest);
        gra.get(dest).add(src);
    }

    public void pritntgra()
    {
        for(int i=0;i<gra.size();i++)
        {
            for(int j=0;j<gra.get(i).size();j++)
            {
            System.out.print(i+"->"+gra.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
    // public void bfs(int start)
    // {
    //     boolean vis[]=new boolean[gra.size()]; 
    //     Queue<Integer>q=new LinkedList<>();
    //     q.add(start);
    //     vis[start]=true;
    //     while(!q.isEmpty())
    //     {
    //         int curr=q.remove();
    //         System.out.print(curr+" ");
    //         ArrayList<Integer>neigh=gra.get(curr);
    //         for( int i=0;i<neigh.size();i++)
    //         {
    //             int n=neigh.get(i);
    //             if(!vis[n])
    //             {
    //                 q.add(n);
    //                 vis[n]=true;
    //             }
    //         }
            
    //     }
    public void bfs(int start)
    {
        boolean vis[]=new boolean[gra.size()];
        Queue<Integer>q=new LinkedList<>();
        q.add(start);
        vis[start]=true;

        while(!q.isEmpty())
        {
            int curr=q.remove();
            System.out.print(curr+" ");
            ArrayList<Integer>neigh=gra.get(curr);
            for(int i=0;i<neigh.size();i++)
            {
                int n=neigh.get(i);
                if(!vis[n])
                {
                    q.add(n);
                    vis[n]=true;
                }
            }
        }
    }
    void dfs(int start)
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
            for (int i = 0; i < gra.get(curr).size(); i++) {
                int arr = gra.get(curr).get(i);
                if (!vis[arr]) {
                    stk.push(arr);
                }
            }
            


        }
        System.out.println();
    }

    

    

    public static void main(String[] args) {
        fullgraph gra=new fullgraph(6);
        gra.add(0, 1);
        gra.add(0, 2);
        gra.add(1, 3);
        gra.add(2, 4);
        gra.add(3, 5);
        gra.add(4, 5);
        gra.pritntgra();
        System.out.println("BFS");
        gra.bfs(0);
        System.out.println();
        System.out.println("DFS");
        gra.dfs(0);

    }
    
}
