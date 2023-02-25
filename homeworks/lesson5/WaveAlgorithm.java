package homeworks.lesson5;

public class WaveAlgorithm {
    public static void main(String[] args) {
        int[][] grid = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
 
        for (int row = 0; row < grid.length; row++) {
            if (row % 2 == 0) {
                for (int col = 0; col < grid[row].length; col++) {
                    System.out.print(grid[row][col] + " ");
                }
            } else {
                for (int col = grid[row].length - 1; col >= 0; col--) {
                    System.out.print(grid[row][col] + " ");
                }
            }
        }
    }
}
