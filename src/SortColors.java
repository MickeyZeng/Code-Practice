import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] test = {2,0,2,1,1,0};
        sortColors(test);
    }

    public static void sortColors(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + "\t");
        }
    }
}
