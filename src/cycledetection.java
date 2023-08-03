import java.util.ArrayList;

public class cycledetection {
    class cnode
    {
        int  src;
        int dest;
        cnode(int src,int dest)
        {
            this.src=src;
            this.dest=dest;
        }

    }
    void add(ArrayList<cnode> gra[])
    {
      for(int i=0;i<gra.length;i++)
        {
            gra[i]=new ArrayList<>();
        }
      /*
               0 ----------3
              /  |                    |
           /     |                    |
        1       |                    4
          \     |
            \   |

                2

       */
       gra[0].add(new cnode(0,1));
        //gra[0].add(new cnode(0,2));
        gra[0].add(new cnode(0,3));


        gra[1].add(new cnode(1,0));
        gra[1].add(new cnode(1,2));

        //gra[2].add(new cnode(2,0));
        gra[2].add(new cnode(2,1));

        gra[3].add(new cnode(3,0));
        gra[3].add(new cnode(3,4));

        gra[4].add(new cnode(4,3));


    }
    boolean detectcycle(ArrayList<cnode>gra[])
    {
        boolean vis[]=new boolean[gra.length];
        for(int i=0;i<gra.length;i++)
        {
            if(!vis[i])
            {
                if(detectCycleutil(gra,vis,i,-1))
                {
                    return true;
                }
            }
        }
        return false;
    }
    boolean detectCycleutil(ArrayList<cnode>gra[],boolean[]vis,int curr,int parent)
    {
        vis[curr]=true;
        for(int i=0;i<gra[curr].size();i++)
        {
            cnode temp=gra[curr].get(i);
            //not visited
            if(!vis[temp.dest])
            {
                if(detectCycleutil(gra,vis,temp.dest,curr))
                {
                    return true;
                }
            }

            else if(vis[temp.dest]&&temp.dest!=parent)
            {
                return true;
            }

        }
        return false;
    }
    void printgra(ArrayList<cnode>gra[])
    {
        for(int i=0;i<gra.length;i++)
        {
            for(int j=0;j<gra[i].size();j++)
            {
                cnode temp=gra[i].get(j);
                System.out.print(temp.src+"==>"+temp.dest+" , ");
            }
            System.out.println();
        }
    }
}
class ma
{
    public static void main(String a[])
    {
        cycledetection c=new cycledetection();
        ArrayList<cycledetection.cnode>gra[]=new ArrayList[5] ;
        c.add(gra);
        c.printgra(gra);
        System.out.println(c.detectcycle(gra));
    }
}
