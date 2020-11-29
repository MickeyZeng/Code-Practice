import java.util.ArrayList;
import java.util.Collections;

public class firstMissingPositive {
    public static void main(String[] args) {
        int[] nums = {7,8,9,11,12};
        System.out.println(firstMissingPositive(nums));
    }

    public static int firstMissingPositive(int[] nums) {
        int flag = 0;

        ArrayList<Integer> collection = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= 0){
                continue;
            }
            collection.add(nums[i]);
        }

        Collections.sort(collection);

        while (true){
            flag = flag + 1;
            if(!collection.contains(flag)){
                return flag;
            }
        }

    }
}
