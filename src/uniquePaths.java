public class uniquePaths {
    public static void main(String[] args) {
        int m = 3;
        int n = 7;
        System.out.println(uniquePaths(3, 7));
    }

    public static int uniquePaths(int m, int n){
        int[][] resultArray = new int[m][n];

        for (int i = 0; i < resultArray.length; i++) {
            for (int j = 0; j < resultArray[i].length; j++) {
                if(i == 0 || j == 0){
                    resultArray[i][j] = 1;
                }else{
                    resultArray[i][j] = resultArray[i - 1][j] + resultArray[i][j - 1];
                }
            }
        }


        return resultArray[m-1][n-1];
    }
}
