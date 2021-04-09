import java.util.ArrayList;
import java.util.List;

public class InsertInterval {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{6,9}};
        int[] newInterval = {2,5};
        int[][] result = insert(intervals, newInterval);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] insert(int[][] intervals, int[] newInterval) {

        List<int[]> resultList = new ArrayList<>();

        for (int[] interval : intervals) {
            if(interval[1] < newInterval[0]){
                resultList.add(interval);
            }else if(interval[0] > newInterval[1]){
                resultList.add(newInterval);
                newInterval = interval;
            }else{
                newInterval[0] = Math.min(interval[0],newInterval[0]);
                newInterval[1] = Math.max(interval[1], newInterval[1]);
            }

        }

        resultList.add(newInterval);
        return resultList.toArray(new int[resultList.size()][]);
    }
}
