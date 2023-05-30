import java.util.*;
public class connectedcomponents {
    class nody
    {
        int src,dest;
        nody(int src,int dest)
        {
            this.src=src;
            this.dest=dest;
        }
    }
    void  creategra(ArrayList<nody>graph[])
    {
        for(int i=0;i<graph.length;i++)
        {
            graph[i]=new ArrayList<>();
        }
        int i=0;

        Scanner in=new Scanner(System.in);

        while(i<graph.length)
        {
            System.out.print("Src ="+i+" dest =");
            int x=in.nextInt();
            if(x==-1)
            {
                i++;
            }
            else
            {
                graph[i].add(new nody(i,x));
            }
        }


    }
    void printgrah(ArrayList<nody> gra[])
    {
        for (int i = 0; i < gra.length; i++) {
            for (int j = 0; j < gra[i].size(); j++) {
                nody e = gra[i].get(j);
                System.out.print(e.src + "==>" + e.dest + " ,");
            }
            System.out.println();
        }
    }



}

class maruti
{
    public static void main(String[] args)
    {
        connectedcomponents x=new connectedcomponents();
        ArrayList<connectedcomponents.nody> [] list=new  ArrayList[3];
        x.creategra(list);
        x.printgrah(list);
    }
}