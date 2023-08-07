import java.util.ArrayList;
import java.util.PriorityQueue;

public class mst {
    class edg {
        int src, dest, wt;

        edg(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    void add(ArrayList<edg> gra[]) {
        for (int i = 0; i < gra.length; i++) {
            gra[i] = new ArrayList<>();
        }
        gra[0].add(new edg(0, 1, 10));
        gra[0].add(new edg(0, 2, 15));
        gra[0].add(new edg(0, 3, 30));

        gra[1].add(new edg(1, 0, 10));
        gra[1].add(new edg(1, 3, 40));

        gra[2].add(new edg(2, 0, 15));
        gra[2].add(new edg(2, 3, 50));

        gra[3].add(new edg(3, 1, 40));
        gra[3].add(new edg(3, 2, 50));
        gra[3].add(new edg(3, 0, 30));
    }

    class pair implements Comparable<pair> {
        int v, src, cost;

        pair(int v, int src, int cost) {
            this.v = v;
            this.src = src;
            this.cost = cost;
        }

        public int compareTo(pair p2) {
            return this.cost - p2.cost;
        }
    }

    ArrayList<edg> prims(ArrayList<edg> gra[], int src) {
        boolean vis[] = new boolean[gra.length];
        PriorityQueue<pair> pq = new PriorityQueue<>();
        pq.add(new pair(src, -1, 0));
        ArrayList<edg> mstEdges = new ArrayList<>();

        while (!pq.isEmpty()) {
            pair curr = pq.remove();
            if (!vis[curr.v]) {
                vis[curr.v] = true;
                if (curr.src != -1) {
                    mstEdges.add(new edg(curr.src, curr.v, curr.cost));
                }
                for (int i = 0; i < gra[curr.v].size(); i++) {
                    edg e = gra[curr.v].get(i);
                    if (!vis[e.dest]) {
                        pq.add(new pair(e.dest, curr.v, e.wt));
                    }
                }
            }
        }

        // Print the MST Edges
        for (edg e : mstEdges) {
            System.out.println("Edge from " + e.src + " to " + e.dest + " with weight " + e.wt);
        }

        return mstEdges;
    }
}

class mstmain {
    public static void main(String args[]) {
        mst m = new mst();
        ArrayList<mst.edg> gra[] = new ArrayList[4];
        m.add(gra);
        m.prims(gra, 0);
    }
}
