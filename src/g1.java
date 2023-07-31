import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class g1 {
    class node1 {
        int src;
        int dest;

        node1(int src, int dest) {
            this.src = src;
            this.dest = dest;

        }
    }
       public void add(ArrayList<node1> gra[])
        {
            for(int i=0;i<gra.length;i++)
            {
                gra[i]=new ArrayList<>();
            }
            /*
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
            }*/
            gra[0].add(new node1(0,2));

            gra[1].add(new node1(1,2));
            gra[1].add(new node1(1,3));

            gra[2].add(new node1(2,1));
            gra[2].add(new node1(2,3));

            gra[3].add(new node1(3,1));
            gra[3].add(new node1(3,2));

            gra[4].add(new node1(4,5));

        }


        public void bfs(ArrayList<node1>gra[])
        {
            boolean vis[]=new boolean[gra.length];
            for(int i=0;i<gra.length;i++)
            {
                if(!vis[i])
                {
                    bfsutil(gra,i,vis);
                }
            }
        }
        void bfsutil(ArrayList<node1>gra[],int v,boolean vis[])
        {
                Queue<Integer>q=new LinkedList<>();
                q.add(v);
                while(!q.isEmpty())
                {
                    int curr=q.remove();
                    if(!vis[curr])
                    {
                        System.out.println(curr);
                        vis[curr]=true;
                        for(int i=0;i<gra[curr].size();i++)
                        {
                            node1 c=gra[curr].get(i);
                            q.add(c.dest);
                        }
                    }
                }


        }
        void dfs(ArrayList<node1>gra[],int curr,boolean vis[] )
        {
            System.out.print(curr);
            vis[curr]=true;
            for(int i=0;i<gra[curr].size();i++)
            {
                node1 t=gra[curr].get(i);
                if(!vis[t.dest])
                {
                    dfs(gra,t.dest, vis);
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
                    System.out.print(temp.src +"==>"+temp.dest+" , ");

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
        ArrayList<g1.node1> gra[]=new ArrayList[6];
        t.add(gra);

        t.printgra(gra);
        t.bfs(gra);
        boolean vis[]=new boolean [gra.length];
       // t.dfs(gra,0,vis);

    }
}
