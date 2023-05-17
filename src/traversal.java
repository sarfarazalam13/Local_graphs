import java.util.ArrayList;

public class traversal {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();

        for(int i=0;i<=4;i++)
        {
            list.add(new ArrayList<>());
        }
            list.add(new ArrayList<>());
            list.get(1).add(2);
            list.get(2).add(1);

            list.get(3).add(1);
            list.get(1).add(3);

            list.get(2).add(3);
            list.get(3).add(2);

            list.get(2).add(4);
            list.get(4).add(2);

            for(int i=0;i<=4;i++)
            {
                for(int j=0;j<list.get(i).size();j++){
                    System.out.print("["+i+"]"+list.get(i).get(j)+" ");
                }
                System.out.println("");
            }
            int[] vis=new int[5];
            for (int i=1;i<=4;i++)
            {
                if(vis[i]==0)
                {
                    for(int j=0;j<list.get(i).size();j++){
                        vis[j]=1;
                        System.out.println(j);
                    }
                }
            }

        }
    }

