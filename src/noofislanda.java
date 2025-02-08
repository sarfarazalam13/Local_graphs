import java.util.*;

class Codechef {
    static int islands(int arr[][]) {
        int m = arr.length;
        int n = arr[0].length;
        int count = 0;

        int vis[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 1 && vis[i][j] == 0) { // Fix: Correct check for unvisited land
                    bfs(arr, i, j, vis);
                    count++;
                }
            }
        }
        return count;
    }

    static void bfs(int arr[][], int x, int y, int vis[][]) {
        vis[x][y] = 1;
        int dir[][] = { {0,1}, {1,0}, {0,-1}, {-1,0} }; // Right, Down, Left, Up

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {x, y});

        while (!q.isEmpty()) {
            int curr[] = q.remove();
            int i = curr[0];
            int j = curr[1];

            for (int direc[] : dir) {
                int newx = i + direc[0];
                int newy = j + direc[1];

                if (newx >= 0 && newx < arr.length && newy >= 0 && newy < arr[0].length &&
                    arr[newx][newy] == 1 && vis[newx][newy] == 0) {
                    q.add(new int[] {newx, newy});
                    vis[newx][newy] = 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();

        int arr[][] = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println("Number of Islands: " + islands(arr));

        in.close(); // Prevent scanner resource leak
    }
}
