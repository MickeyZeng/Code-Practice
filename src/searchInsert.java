public class searchInsert {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 5;

        int result = searchInsert(nums, target);
        System.out.println(result);
    }

    public static int searchInsert(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if(target <= nums[i]){
                return i;
            }

        }

        return nums.length;
    }
}
