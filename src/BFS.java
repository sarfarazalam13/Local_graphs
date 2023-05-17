import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    static void bfsgraph(int v, ArrayList<ArrayList<Integer>> arr)

    {
    Boolean vis[]=new Boolean[v];
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        vis[0]=true;
        while(!q.isEmpty())
        {
            Integer Node =q.poll();
            System.out.println(Node);
        }
    }
    public static void main(String[] args) {

    }
}
