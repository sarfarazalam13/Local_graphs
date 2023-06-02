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

    void bfs(ArrayList<nody> gra[])
    {
        boolean[]  isVisited=new boolean[gra.length];
        for(int i=0;i<gra.length;i++)
        {
            if(!isVisited[i])
            {
                bfsutil(gra,isVisited);
            }
        }
    }
    void bfsutil(ArrayList<nody> gra[],boolean isVisited[])
    {
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        while(!q.isEmpty())
        {
            int curr=q.remove();
            if(!isVisited[curr])
            {
                System.out.print(curr);
                isVisited[curr]=true;
                for(int i=0;i< gra[curr].size();i++)
                {
                    nody e=gra[curr].get(i);
                    q.add(e.dest);
                }

            }


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