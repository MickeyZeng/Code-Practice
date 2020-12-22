import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        int[] nums = {3,3,0,3};

        System.out.println(permuteUnique(nums));
    }

    public static List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> resultList = new ArrayList<>();

        backTrack(nums, resultList, new ArrayList<Integer>(), new ArrayList<Integer>());

        return resultList;
    }

    public static void backTrack(int[] nums, List<List<Integer>> resultList, ArrayList<Integer> tempList, ArrayList<Integer> oldList){

        if(tempList.size() == nums.length){
            resultList.add(new ArrayList<>(tempList));
        }

        for (int i = 0; i < nums.length; i++) {
            if(oldList.contains(i)){
                continue;
            }

            if (i > 0 && !oldList.contains(i - 1) && nums[i - 1] == nums[i]) {
                continue;
            }
            oldList.add(i);
            tempList.add(nums[i]);
            backTrack(nums,resultList,tempList, oldList);
            oldList.remove(oldList.size() - 1);
            tempList.remove(tempList.size() - 1);
        }
    }

}
