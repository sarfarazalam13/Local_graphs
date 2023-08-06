import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class dijkastras {
class edge {
    int src;
    int dest;
    int wt;

    edge(int src, int dest, int wt) {
        this.src = src;
        this.dest = dest;
        this.wt = wt;
    }
}

class pair implements Comparable<pair>
{
    int n;
    int path;
    public pair(int n,int path)
    {
        this.n=n;
        this.path=path;
    }
    public int compareTo(pair p2)
    {
        return this.path-p2.path;
    }
}
void dij(ArrayList<edge>gra[],int src)
{
    int dist[]=new int[gra.length];
    for(int i=0;i<gra.length;i++)
    {
        if(i!=src)
        {
            dist[i]=Integer.MAX_VALUE;
        }
    }
    PriorityQueue<pair>pq=new PriorityQueue<>();
    pq.add(new pair(src,0) );
    boolean vis[]=new boolean[gra.length];

    while (!pq.isEmpty())
    {
     pair curr=pq.remove();
     if(!vis[curr.n])
     {
         vis[curr.n]=true;
         for(int i=0;i<gra[curr.n].size();i++)
         {
             edge e=gra[curr.n].get(i);
             int u=e.src;
             int v=e.dest;
             int w=e.wt;
             if(dist[u]+w<dist[v])
             {
                 dist[v]=dist[u]+w;
                 pq.add(new pair(v,dist[v]));
             }
         }

     }
    }
    for(int i:dist)
    {
        System.out.println(i+" ");
    }
}
    void add(ArrayList<edge>gra[])
    {
           for(int i=0;i<gra.length;i++)
           {
               gra[i]=new ArrayList<>();
           }
           /*Scanner in=new Scanner(System.in);
           int i=0;
           while(i<gra.length)
           {
               System.out.print(i+" to"+" ");
               int x=in.nextInt();

               if(x!=-1)
               {
                   System.out.print(" weight "+" ");
                   int w=in.nextInt();
                   gra[i].add(new edge(i,x,w));

               }
               else
               {
                   i++;
               }
           }*/
        gra[0].add(new edge(0,1,2));
        gra[0].add(new edge(0,2,4));


        gra[1].add(new edge(1,2,1));
        gra[1].add(new edge(1,3,7));

        gra[2].add(new edge(2,4,3));

        gra[3].add(new edge(3,5,1));

        gra[4].add(new edge(4,3,2));
        gra[4].add(new edge(4,5,5));



    }
    void printlgra(ArrayList<edge>gra[])
    {
        for(int i=0;i<gra.length;i++)
        {
            for(int j=0;j<gra[i].size();j++)
            {
                edge e=gra[i].get(j);
                System.out.print(e.src+" ="+e.wt+"=>"+e.dest+" ,  ");
            }
        }
    }

}
class maaa
{
    public static void main(String args[])
    {
        dijkastras d=new dijkastras();
        ArrayList<dijkastras.edge>gra[]=new ArrayList[6];
        d.add(gra);
        //d.printlgra(gra);
        d.dij(gra,0);
    }
}
