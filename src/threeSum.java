import java.util.ArrayList;
import java.util.List;

public class threeSum {
    public static void main(String[] args) {
        int[] test = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(test));
    }

    public static List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for (int i = 2; i < nums.length; i++) {
            for (int j = 1; j < i; j++) {
                for (int k = 0; k < j; k++) {
                    if(nums[i] + nums[j] + nums[k] == 0){
                        ArrayList<Integer> tempList = new ArrayList<>();
                        tempList.add(nums[i]);
                        tempList.add(nums[j]);
                        tempList.add(nums[k]);
                        result.add(tempList);
                    }
                }
            }
        }
        System.out.println(result);
        return result;
    }
}
