import java.util.ArrayList;

public class bipartite {
    class nd
    {
        int src;
        int dest;
        nd(int src,int dest)
        {
            this.src=src;
            this.dest=dest;
        }
    }
    void add(ArrayList<nd>gra[])
    {
        for(int i=0;i<gra.length;i++)
        {
            gra[i]=new ArrayList<>();
        }
        gra[0].add(new nd(0,1));
        gra[0].add(new nd(0,2));


        gra[1].add(new nd(1,0));
        gra[1].add(new nd(1,3));

        gra[2].add(new nd(2,0));
        gra[2].add(new nd(2,3));

        gra[3].add(new nd(3,1));
        gra[3].add(new nd(3,2));


    }
    void printgra(ArrayList<nd>gra[])
    {
        for(int i=0;i<gra.length;i++)
        {
        for(int j=0;j<gra[i].size();j++)
        {
            nd e=gra[i].get(j);
            System.out.print(e.src+"==>"+e.dest+" , ");
        }
            System.out.println();
        }
    }


}
class mia
{
    public static void main(String args[])
    {
        bipartite bp=new bipartite();
        ArrayList<bipartite.nd>gra[]=new ArrayList[4];
        bp.add(gra);
        bp.printgra(gra);

    }
}
