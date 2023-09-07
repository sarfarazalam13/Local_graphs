import java.util.ArrayList;
import java.util.PriorityQueue;

public class g4 {
    class ed
    {
        int src,dest,wt;
        ed(int src,int dest ,int wt)
        {
            this.src=src;
            this.dest=dest;
            this.wt=wt;
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
    void dij(ArrayList<ed> gra[],int src)
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
        pq.add(new pair(src,0));
        boolean vis[]=new boolean[gra.length];
        while(!pq.isEmpty())
        {
            pair curr=pq.remove();
            if(!vis[curr.n])
            {

            }
        }
    }
}
