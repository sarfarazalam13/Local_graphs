import java.util.ArrayList;
import java.util.Stack;

public class g3 {
    class noty
    {
        int src ,dest;
        noty(int src,int dest)
        {
            this.src=src;
            this.dest=dest;
        }
    }
    void add(ArrayList<noty> gra[])
    {
        for(int i=0;i<gra.length;i++)
        {
            gra[i]=new ArrayList<>();
        }
        gra[2].add(new noty(2, 3));
        gra[3].add(new noty(3, 1));
        gra[4].add(new noty(4, 0));
        gra[4].add(new noty(4, 1));
        gra[5].add(new noty(5, 0));
        gra[5].add(new noty(5, 2));
    }

    void toposort(ArrayList<noty>gra[])
    {
        boolean vis[]=new boolean[gra.length];
        Stack<Integer> stk=new Stack<>();
        for(int i=0;i<gra.length;i++)
        {
            if(!vis[i])
            {
                topsortutil(gra,i,vis,stk);
            }
        }
        while(!stk.isEmpty())
        {
            System.out.println(stk.pop());
        }
    }
    void topsortutil(ArrayList<noty>gra[],int curr,boolean vis[],Stack<Integer>stk)
        {
            vis[curr]=true;

                for(int j=0;j<gra[curr].size();j++)
                {
                    noty temp=gra[curr].get(j);
                    if(!vis[temp.dest])
                    topsortutil(gra,temp.dest,vis,stk);
                }

            stk.push(curr);

        }
}
class maing3
{
    public static void main(String args[])
    {
        g3 x=new g3();
        ArrayList<g3.noty>gra[]=new ArrayList[6];
        x.add(gra);
        x.toposort(gra);
    }
}
