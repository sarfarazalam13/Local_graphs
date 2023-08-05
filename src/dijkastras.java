import java.util.ArrayList;
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
    void add(ArrayList<edge>gra[])
    {
           for(int i=0;i<gra.length;i++)
           {
               gra[i]=new ArrayList<>();
           }
           Scanner in=new Scanner(System.in);
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
           }

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
        ArrayList<dijkastras.edge>gra[]=new ArrayList[5];
        d.add(gra);
        d.printlgra(gra);
    }
}
