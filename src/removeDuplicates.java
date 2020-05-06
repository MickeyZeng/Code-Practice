public class removeDuplicates {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,4};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int duplicates = -1;
        if(duplicates == nums[0]){
            duplicates = 0;
        }
        int length = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == duplicates){
                nums[i] = -1;
                continue;
            }else{
                length++;
                duplicates = nums[i];
                nums[length - 1] = duplicates;
            }
        }



        return length;

    }

}
