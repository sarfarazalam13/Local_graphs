import java.util.ArrayList;

public class graphbuillding {
    class E {
        int src;
        int e;
        int wt;

        E(int src, int dest, int wt) {
            this.src = src;
            this.wt = wt;
            this.e = dest;

        }
    }
        public void addedge(ArrayList<E> graph[])
        {
            for(int i=0;i<graph.length;i++)
            {
                graph[i]=new ArrayList<E>();
            }
        }


}
class MAin
{
    public static void main(String[] args) {
        graphbuillding g=new graphbuillding();
        int v=5;
        ArrayList<graphbuillding.E> gra[]=new ArrayList[v];
        g.addedge(gra);
    }
}
