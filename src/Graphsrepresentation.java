public class Graphsrepresentation {
    public static void main(String[] args) {
        int v=5;
        int arr[][]=new int[5][5];

        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }



    }
    void addEdge(int arr[][],int source,int dest)
    {
        arr[source][dest]=1;
        arr[dest][source]=1;
    }
}
