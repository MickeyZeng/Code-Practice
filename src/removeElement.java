public class removeElement {

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        System.out.println(removeElement(nums , 2));
    }

    public static int removeElement(int[] nums, int val) {
        if(nums.length == 0){
            return 0;
        }

        int duplicates = val;
        int length = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == duplicates){
                continue;
            }else{
                nums[length] = nums[i];
                length++;
            }
        }

        return length;
    }
}
