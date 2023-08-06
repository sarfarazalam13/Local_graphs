import java.util.ArrayList;
import java.util.Stack;

public class topologicalsort {
    class ed {
        int src;
        int dest;

        ed(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    void topsort(ArrayList<ed>[] gra) {
        int n = gra.length;
        boolean[] vis = new boolean[n];
        Stack<Integer> stk = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                topsortutil(gra, vis, i, stk);
            }
        }
        while (!stk.isEmpty()) {
            System.out.print(stk.pop() + " ");
        }
    }

    void topsortutil(ArrayList<ed>[] gra, boolean[] vis, int curr, Stack<Integer> stk) {
        vis[curr] = true;
        for (int i = 0; i < gra[curr].size(); i++) {
            ed e = gra[curr].get(i);
            if (!vis[e.dest]) {
                topsortutil(gra, vis, e.dest, stk);
            }
        }
        stk.push(curr);
    }

    void add(ArrayList<ed>[] gra) {
        for (int i = 0; i < gra.length; i++) {
            gra[i] = new ArrayList<>();
        }

        gra[2].add(new ed(2, 3));
        gra[3].add(new ed(3, 1));
        gra[4].add(new ed(4, 0));
        gra[4].add(new ed(4, 1));
        gra[5].add(new ed(5, 0));
        gra[5].add(new ed(5, 2));
    }

    public static void main(String args[]) {
        topologicalsort t = new topologicalsort();
        ArrayList<topologicalsort.ed>[] gra = new ArrayList[6];
        t.add(gra);
        t.topsort(gra);
    }
}
