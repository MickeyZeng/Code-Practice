public class maxSubArray {

    public static void main(String[] args) {
        int[] nums = {5,4,-1,7,8};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int[] reusltArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if(i == 0) {
                reusltArray[i] = nums[i];
            }else{
                if(reusltArray[i -1] + nums[i] > nums[i]){
                    reusltArray[i] = reusltArray[i - 1] + nums[i];
                }else{
                    reusltArray[i] = nums[i];
                }
            }
        }

        int best = Integer.MIN_VALUE;

        for (int i = 0; i < reusltArray.length; i++) {
            if(reusltArray[i] > best){
                best = reusltArray[i];
            }
        }
        return best;
    }
}
