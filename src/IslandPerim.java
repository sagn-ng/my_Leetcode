package leet_S;
import java.util.Scanner;
public class IslandPerim {
    public static int islandPerimeter(int[][] grid) {
        int row=grid.length, col=grid[0].length;
        int ttl_sq=0, ttl_edges=0;
        
        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                if (grid[i][j]==1){
                    ttl_sq++;
                    if (i<row-1 && grid[i+1][j]==1) ttl_edges++;
                    if (j<col-1 && grid[i][j+1]==1) ttl_edges++;
                }
            }
        }
        return 4*ttl_sq-2*ttl_edges;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows: "); int row=sc.nextInt();
        System.out.print("Enter number of columns: "); int col=sc.nextInt();
        int[][] grid=new int[row][col];
        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++) grid[i][j]=sc.nextInt();
        }
        sc.close();

        System.out.println(islandPerimeter(grid));
    }
}
