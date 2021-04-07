import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class merge {
    public static void main(String[] args) {
        int[][] intervals = {{1,4},{4,5}};
        int[][] result = merge(intervals);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList();

        int[] prev = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            int[] curr = intervals[i];
            int currEnd = curr[1];
            int currStart = curr[0];

            if (prev[1] >= currStart && prev[1] <= currEnd)
                prev[1] = currEnd;

            else if (prev[1] < currStart) {
                merged.add(prev);
                prev = curr;
            }
        }

        merged.add(prev);

        return merged.toArray(new int[merged.size()][]);
    }
}
