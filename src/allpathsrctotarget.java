import java.util.ArrayList;
import java.util.Scanner;

public class allpathsrctotarget {
         class n
         {
             int src;
             int dest;
             n(int src,int dest)
             {
                 this.src=src;
                 this.dest=dest;
             }
         }
         void ppath(ArrayList<n>[]gra,int src,int dest,String path)
         {
          if(src==dest)
          {
              System.out.println(path+dest);
              return;
          }
          for(int i=0;i<gra[src].size();i++)
          {
              n temp=gra[src].get(i);
              ppath(gra,temp.dest,dest,path+src);
          }
         }


         void add(ArrayList<n>gra[]) {
             for (int i = 0; i < gra.length; i++) {
                 gra[i] = new ArrayList<>();
             }
             /*
             Scanner in = new Scanner(System.in);
             int i = 0;
             while (i < gra.length) {
                 System.out.println(i+" to ");
                 int x = in.nextInt();
                 if (x == -1) {
                     i++;
                 } else {
                     gra[i].add(new n(i, x));
                     gra[x].add(new n(x, i));
                 }
             }*/
             gra[0].add(new n(0,3));
             gra[2].add(new n(2,3));
             gra[3].add(new n(3,1));
             gra[4].add(new n(4,0));
             gra[4].add(new n(4,1));

             gra[5].add(new n(5,0));
             gra[5].add(new n(5,2));
         }
         void printgra(ArrayList<n>[]gra)
    {
        for(int i=0;i<gra.length;i++)
        {
            for(int j=0;j<gra[i].size();j++)
            {
                n temp=gra[i].get(j);
                System.out.print(temp.src+"==>"+temp.dest+" , ");
            }
            System.out.println("");
        }
    }
}
class me
{
    public static void main(String args[])
    {
        allpathsrctotarget g=new  allpathsrctotarget();
        ArrayList< allpathsrctotarget.n>gra[]=new ArrayList[6];
        g.add(gra);
        g.printgra(gra);

        int src=5,dest=1;
        String path="";
        g.ppath(gra,src,dest,path);

    }
}
