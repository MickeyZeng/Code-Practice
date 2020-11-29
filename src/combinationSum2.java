import java.util.*;

public class combinationSum2 {
    public static void main(String args[]) {
        int target = 8;
        int[] candidates = {10,1,2,7,6,1,5};
        System.out.println(combinationSum2(candidates, target));
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> resultList = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();

        dfsMethod(resultList, tempList, 0, candidates, target);

        resultList = deleteDuplicates(resultList);

        return resultList;
    }

    public static List<List<Integer>> dfsMethod(List<List<Integer>> resultList, List<Integer> tempList, int start, int[] nums, int remain){
        if(remain < 0 ){ return resultList;}
        if(remain == 0){
//            System.out.println("tempList is " + tempList);
            resultList.add(new ArrayList<>(tempList));
//            System.out.println("resultList is " + resultList);
        }else{
            for (int i = start; i < nums.length; i++) {
                tempList.add(nums[i]);
                dfsMethod(resultList, tempList, i + 1, nums, remain - nums[i]);
                tempList.remove(tempList.size() - 1);
            }
        }
//        System.out.println("Here is " + resultList);
        return resultList;
    }

    public static List<List<Integer>> deleteDuplicates(List<List<Integer>> duplicate){
        Map<String, String> ans = new HashMap<String, String>();
        for (int i = 0; i < duplicate.size(); i++) {
            List<Integer> l = duplicate.get(i);
            Collections.sort(l);
            String key = "";
            for (int j = 0; j < l.size() - 1; j++) {
                key = key + l.get(j) + ",";
            }
            key = key + l.get(l.size() - 1);
            ans.put(key, "");
        }

        List<List<Integer>> ans_list = new ArrayList<List<Integer>>();

        for (String k : ans.keySet()) {
            String[] l = k.split(",");
            List<Integer> temp = new ArrayList<Integer>();
            for (int i = 0; i < l.length; i++) {
                int c = Integer.parseInt(l[i]);
                temp.add(c);
            }
            ans_list.add(temp);
        }

        return ans_list;

    }
}
