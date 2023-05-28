import java.lang.reflect.Array;
import java .util.*;
public class graphprac {
    class no {
        int dest, src;

        no(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    void create(ArrayList<no> gra[]) {
        for (int i = 0; i < gra.length; i++) {
            gra[i] = new ArrayList<>();
        }
        Scanner in = new Scanner(System.in);

        int i = 0, j = 0;
        while (i != gra.length) {
            int x = in.nextInt();
            if (x != -1) {
                gra[i].add(new no(i, x));
                j++;
            } else {
                i++;
                j = 0;
            }
        }
    }

    void printgra(ArrayList<no> gra[]) {
        for (int i = 0; i < gra.length; i++) {
            for (int j = 0; j < gra[i].size(); j++) {
                no e = gra[i].get(j);
                System.out.print(e.src + "==>" + e.dest + " ,");
            }
            System.out.println();
        }
    }

    void bfs(ArrayList<no> gra[]) {
          Queue<Integer> q=new LinkedList<>();
          boolean isVisited[]=new boolean[gra.length];
          q.add(0);
          while(!q.isEmpty())
          {
              int cur=q.remove();
              if(!isVisited[cur])
              {
                  System.out.print(cur+" ");
                  isVisited[cur]=true;
                  for(int i=0;i<gra[cur].size();i++)
                  {
                      no e=gra[cur].get(i);
                      q.add(e.dest);
                  }
              }




          }
    }
}
class prac
{
    public static void main(String args[])
    {
        graphprac x=new graphprac();
        ArrayList<graphprac.no> gra[]=new ArrayList[3];
        x.create(gra);
        x.printgra(gra);
        x.bfs(gra);
    }

}
