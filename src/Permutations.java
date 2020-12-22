import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(permute(nums));

    }

    public static List<List<Integer>> permute(int[] nums){
        List<List<Integer>> resultList = new ArrayList<>();
        backtrack(nums, resultList, new ArrayList<>());
        return resultList;
    }

    public static void backtrack(int[] nums,List<List<Integer>> resultList, List<Integer> tempList) {


        if(tempList.size() == nums.length){
            resultList.add(new ArrayList<>(tempList));
        }

        for (int i = 0; i < nums.length; i++) {
            if(tempList.contains(nums[i])){
                continue;
            }else{
                tempList.add(nums[i]);
                backtrack(nums, resultList, tempList);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}
