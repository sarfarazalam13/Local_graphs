import java.util.ArrayList;
import java.util.PriorityQueue;

public class mst {
    class edg
    {
        int src,dest,wt;
        edg(int src,int dest,int wt)
        {
            this.src=src;
            this.dest=dest;
            this.wt=wt;
        }

    }

    void  add(ArrayList<edg>gra[])
    {
        for(int i=0;i<gra.length;i++)
        {
            gra[i]=new ArrayList<>();
        }
        gra[0].add(new edg(0,1,10));
        gra[0].add(new edg(0,2,15));
        gra[0].add(new edg(0,3,30));

        gra[1].add(new edg(1,0,10));
        gra[1].add(new edg(1,3,40));

        gra[2].add(new edg(2,0,15));
        gra[2].add(new edg(2,3,50));

        gra[3].add(new edg(3,1,40));
        gra[3].add(new edg(3,2,50));
        gra[3].add(new edg(3,0,30));



    }
    class pair implements Comparable<pair>
    {
        int v,cost;
        pair(int v,int cost)
        {
            this.v=v;
            this.cost=cost;
        }
        public int compareTo(pair p2)
        {
            return this.cost-p2.cost;
        }
    }

    void prims(ArrayList<edg>gra[],int src)
    {
boolean vis[]=new boolean[gra.length];
        PriorityQueue<pair>pq =new PriorityQueue<>();

    }

        }
