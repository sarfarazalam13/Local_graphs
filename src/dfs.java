import  java.util.*;
public class dfs {
    class nude{
        int  src,dest;
        nude(int src,int dest)
        {
            this.src=src;
            this.dest=dest;
        }
    }
    void build(ArrayList<nude> gra[])
    {

        for (int i = 0; i < gra.length; i++)
        {
            gra[i] = new ArrayList<>();
        }
        Scanner in = new Scanner(System.in);

        int i = 0;
        while (i < gra.length) {
            System.out.print("Src ="+i+" dest =");
            int x = in.nextInt();
            if (x != -1) {

                gra[i].add(new nude(i, x));
            } else {
                i++;
            }
        }
    }

    void print(ArrayList<nude> gra[])
    {
        for(int i=0;i<gra.length;i++)
        {
            for(int j=0;j<gra[i].size();j++)
            {
                nude e=gra[i].get(j);
                System.out.print(e.src+" ==> "+e.dest);
            }
            System.out.println();
        }
    }
    void dfss(ArrayList<nude>gra[],int curr,boolean vis[])
    {
        System.out.print(curr);
        vis[curr]=true;
        for(int  i=0;i< gra[curr].size();i++)
        {
            nude e=gra[curr].get(i);
            if(!vis[e.dest])
            {
                dfss(gra,e.dest,vis);
            }
        }


    }

}
class manik
{
    public static void main(String args[])
    {
        dfs x=new dfs();
        ArrayList<dfs.nude>gra[]=new  ArrayList[3];
        x.build(gra);
        x.print(gra);
        boolean vis[]=new boolean [gra.length];
        x.dfss(gra,0,vis);

    }
}
