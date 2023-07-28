import java.util.ArrayList;
import java.util.Scanner;

public class g1 {
    class node1 {
        int src;
        int dest;

        node1(int src, int dest) {
            this.src = src;
            this.dest -= dest;

        }
    }
       public void add(ArrayList<node1> gra[])
        {
            for(int i=0;i<gra.length;i++)
            {
                gra[i]=new ArrayList<>();
            }
            Scanner in=new Scanner(System.in);
            int i=0;
            while(i<gra.length)
            {
                int  x=in.nextInt();
                if(x!=-1)
                {
                    gra[i].add(new node1(i,x));
                }
                else
                {
                    i++;
                }
            }


        }
       void printgra(ArrayList<node1> gra[])
        {
            for(int i=0;i<gra.length;i++)
            {
                for(int j=0;j<gra[i].size();j++)
                {
                    node1 temp=gra[i].get(j);
                    System.out.print(temp.src +"==>"+temp.dest);

                }
                System.out.println();
            }
        }
    }


class m
{
    public static void main(String args[])
    {
        g1 t=new g1();
        ArrayList<g1.node1> gra[]=new ArrayList[5];
        t.add(gra);
        t.printgra(gra);

    }
}
