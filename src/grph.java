import java.util.ArrayList;

public class grph {

   public class edge extends ArrayList<edge> {
        int source;
        int dest;



    edge(int src,int dest) {
        this.source=src;
        this.dest=dest;

    }

}
public void addedge(ArrayList<edge>[] lis)
{
    for (int i=0;i<lis.length;i++)
    {
        lis[i]=new ArrayList<>();
    }
    lis[0].add(new grph.edge(0,2));

    lis[1].add(new edge(1,2));
    lis[1].add(new edge(1,3));

    lis[2].add(new edge(2,1));
    lis[2].add(new edge(2,3));

    lis[3].add(new edge(3,1));
    lis[3].add(new edge (3,2));

}

}
class sa {
    public static void main(String[] args) {
        int v = 4;

        ArrayList<grph.edge> graph[] = new ArrayList[v];
        grph g=new grph();
        g.addedge(graph);
        for (int i = 0; i < graph[2].size(); i++) {
            grph.edge e = graph[2].get(i);
            {
                System.out.println(e.dest );
            }
        }
    }
}
