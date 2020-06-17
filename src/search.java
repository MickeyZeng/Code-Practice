public class search {

    public static void main(String[] args) {
        int target = 8;
        int nums[] = {5,7,7,8,8,10};
        System.out.println(searchRange(nums,target)[0] + " *** " + searchRange(nums,target)[1]);
    }

    public static int search(int[] nums, int target) {

        int result = -1;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target){
                result = i;
                break;
            }
        }

        return result;
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] targetRange = {-1, -1};
        // find the index of the leftmost appearance of `target`.
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                targetRange[0] = i;
                break;
            }
        }

        // if the last loop did not find any index, then there is no valid range
        // and we return [-1, -1].
        if (targetRange[0] == -1) {
            return targetRange;
        }

        // find the index of the rightmost appearance of `target` (by reverse
        // iteration). it is guaranteed to appear.
        for (int j = nums.length-1; j >= 0; j--) {
            if (nums[j] == target) {
                targetRange[1] = j;
                break;
            }
        }

        return targetRange;
    }
}
