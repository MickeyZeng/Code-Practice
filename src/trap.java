public class trap {
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }

    public static int trap(int[] height) {
        int maxValue = getMaxHeight(height);


        int ans = 0;

        for (int i = 1; i <= maxValue; i++) {
            int temp = 0;
            boolean isStart = false;
            for (int j = 0; j < height.length; j++) {
                if(isStart && height[j] < i){
                    temp = temp + 1;
                }

                if(height[j] >= i){
                    ans = temp + ans;
                    isStart = true;
                    temp = 0;
                }
            }
        }

        return ans;
    }

    public static int getMaxHeight(int[] height){
        int maxValue = 0;
        for (int i = 0; i < height.length; i++) {
            if(height[i] > maxValue){
                maxValue = height[i];
            }else{
                continue;
            }
        }
        return maxValue;
    }
}
