import java.util.ArrayList;

public class g2 {
    class node
    {
        int src,dest,w;
        node(int src,int dest,int w)
        {
            this.src=src;
            this.dest=dest;
            this.w=w;
        }
    }

    boolean cycledetection(ArrayList<node>gra[])
    {
  boolean vis[]=new boolean[gra.length];
  for(int i=0;i<gra.length;i++)
  {
      if(!vis[i])
      {
          if(detectcycleUtil(gra,vis,i,-1))
          {
              return true;
          }

      }
  }
  return false;
    }
    boolean detectcycleUtil(ArrayList<node>gra[],boolean vis[],int curr,int par)
    {
        vis[curr]=true;
        for(int i=0;i<gra[curr].size();i++)
        {
            node e=gra[curr].get(i);
            if(!vis[e.dest])
            {
                if(detectcycleUtil(gra,vis,e.dest,curr))
                {
                    return true;
                }
            }
            else if(vis[e.dest] && e.dest!=par)
            {
                return true;
            }

        }
        return false;
    }

    void add(ArrayList<node>gra[])
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
        gra[0].add(new node(0,1,2));
        gra[0].add(new node(0,2,1));
        gra[0].add(new node(0,3,5));


        gra[1].add(new node(1,0,2));
        gra[1].add(new node(1,2,5));

        gra[2].add(new node(2,0,1));
        gra[2].add(new node(2,1,5));

        gra[3].add(new node(3,0,5));
        gra[3].add(new node(3,4,6));

        gra[4].add(new node(4,3,6));
    }

    void printgra(ArrayList<node>gra[])
    {
        for(int i=0;i<gra.length;i++)
        {
            for(int j=0;j<gra[i].size();j++)
            {
                node e=gra[i].get(j);
                System.out.print(e.src+"==>"+e.dest);
            }
            System.out.println();
        }
    }
}
class g2main
{
    public static void main(String args[])
    {
        g2 g=new g2();
        ArrayList<g2.node>gra[]=new ArrayList[5];
        g.add(gra);
        g.printgra(gra);
        System.out.println(g.cycledetection(gra));

    }
}
