public class binarySearch {
    public static int search(int[] nums, int target) {

        int start = 0 ;
        int end = nums.length - 1 ;
        int cut;


        while (start < end){

            cut = (start + end) / 2;

            if(nums[cut] == target){
                return cut ;
            }else if(nums[cut] < target){
                start = cut + 1;
            }else if(nums[cut] > target){
                end = cut - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(search(nums, target));
    }
}
