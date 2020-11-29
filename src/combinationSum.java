
import java.util.ArrayList;
import java.util.List;

public class combinationSum {
    public static void main(String args[]) {
        int target = 7;
        int[] candidates = {2,3,6,7};
        System.out.println(combinationSum(candidates, target));
    }

    public static List<List<Integer>> combinationSum (int[] candidates, int target){
        List<List<Integer>> resultList = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();
        dfsMethod(target, tempList, resultList , 0 ,candidates);
        return resultList;
    }

    public static List<List<Integer>> dfsMethod(int target, List<Integer> tempList, List<List<Integer>> resultList, int start, int nums[]){
        if(target < 0) return resultList;
        else if(target == 0) resultList.add(new ArrayList<>(tempList));
        else {
            for (int i = start; i < nums.length; i++) {
                tempList.add(nums[i]);
                dfsMethod(target - nums[i], tempList, resultList, i, nums);
                //找到了一个解或者 remain < 0 了，将当前数字移除，然后继续尝试
                tempList.remove(tempList.size() - 1);
            }
        }
        return resultList;
    }
}
