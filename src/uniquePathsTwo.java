public class uniquePathsTwo {
    public static void main(String[] args) {
        int[][] obstacleGrid = {{0,0},{1,1},{0,0}};
        System.out.println(uniquePathsWithObstacles(obstacleGrid));
    }

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid[0][0] == 1){
            return 0;
        }

        int width = obstacleGrid.length;
        int height = obstacleGrid[0].length;

        int[][] resultArray = new int[width][height];
        boolean widthFlag = true;
        boolean heightFlag = true;

        for (int i = 0; i < obstacleGrid.length; i++) {
            for (int j = 0; j < obstacleGrid[i].length; j++) {
                if(i == 0){
                    if (widthFlag) {
                        resultArray[i][j] = 1;
                    }else{
                        resultArray[i][j] = 0;
                    }
                }else if(j == 0){
                    if (heightFlag){
                        resultArray[i][j] = 1;
                    }else{
                        resultArray[i][j] = 0;
                    }
                }
                if(obstacleGrid[i][j] == 1){
                    resultArray[i][j] = -1;

                    if(i == 0){
                        widthFlag = false;
                    }

                    if(j == 0){
                        heightFlag = false;
                    }

                    continue;
                }
                if(j != 0 && i != 0){
                    if(resultArray[i -1][j] == -1 || resultArray[i][j - 1] == -1){
                        if(resultArray[i -1][j] == resultArray[i][j - 1]){
                            resultArray[i][j] = 0;
                        }else {
                            resultArray[i][j] = resultArray[i - 1][j] == -1 ? resultArray[i][j - 1] : resultArray[i - 1][j];
                        }
                    }else{
                        resultArray[i][j] = resultArray[i - 1][j] + resultArray[i][j - 1];
                    }
                }

            }
        }


        for (int i = 0; i < resultArray.length; i++) {
            for (int j = 0; j < resultArray[i].length; j++) {
                System.out.print(resultArray[i][j] + "\t");
            }
            System.out.println("\n");
        }

        return resultArray[width - 1][height - 1] == -1 ? 0 : resultArray[width - 1][height - 1];
    }
}
