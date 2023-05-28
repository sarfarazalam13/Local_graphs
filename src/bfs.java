import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bfs {
    class nose{
        int src;
        int dest;
        nose(int src,int dest)
        {
        this.src=src;
        this.dest=dest;
        }
    }
    void added(ArrayList<nose> graph[])
    {
        for(int i=0;i<graph.length;i++)
        {
            graph[i]=new ArrayList<>();
        }
        /*int i=0,j=0;
        Scanner in=new Scanner(System.in);
        while(i<graph.length)
        {
            int x=in.nextInt();
            if(x!=-1)
            {
                graph[i].add(new nose(i,x));
                j++;
            }else
            {
                i++;
                j=0;
            }

        }*/
        graph[0].add(new nose(0,2));

        graph[1].add(new nose(1,2));
        graph[1].add(new nose(1,3));

        graph[2].add(new nose(2,1));
        graph[2].add(new nose(2,3));

        graph[3].add(new nose(3,1));
        graph[3].add(new nose(3,2));

    }
    void bfss(ArrayList<nose> lis[])
    {
        Queue<Integer> q=new LinkedList<>();
        boolean arr[]=new boolean[lis.length];
        q.add(0);
        while(!q.isEmpty()) {
            int curr = q.remove();

            if (!arr[curr])
            {
                System.out.print(curr+" ");
                arr[curr]=true;
                for(int i=0;i<lis[curr].size();i++)
                {
                    nose e=lis[curr].get(i);
                    q.add(e.dest);

                }
            }
        }




    }


}
class mani {
    public static void main(String[] args) {
        bfs x = new bfs();
        ArrayList<bfs.nose> lis[] = new ArrayList[4];
        x.added(lis);
        x.bfss(lis);
        int z;

      /* for (int i = 0; i < lis[2].size(); i++) {
            bfs.nose e = lis[2].get(i);
            {
                System.out.println(e.dest);
            }
        }*/
    }
}

