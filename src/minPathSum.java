public class minPathSum {
    public static void main(String[] args) {
        int[][] grid = {{1,2,3},{4,5,6}};
        System.out.println(minPathSum(grid));
    }

    public static int minPathSum(int[][] grid) {
        int[][] reusltArray = new int[grid.length][grid[0].length];

        for (int i = 0; i < reusltArray.length; i++) {
            for (int j = 0; j < reusltArray[i].length; j++) {
                if(i == 0 && j == 0){
                    reusltArray[i][j] = grid[i][j];
                }else if(i > 0 && j > 0){
                    reusltArray[i][j] = Math.min(reusltArray[i - 1][j] + grid[i][j], reusltArray[i][j - 1] + grid[i][j]);
                }else if(i == 0){
                    reusltArray[i][j] = reusltArray[i][j - 1] + grid[i][j];
                }else if(j == 0){
                    reusltArray[i][j] = reusltArray[i - 1][j] + grid[i][j];
                }
            }
        }

        return reusltArray[reusltArray.length - 1][reusltArray[0].length - 1];

    }
}
