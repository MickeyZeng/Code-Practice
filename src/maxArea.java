public class maxArea {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea2(height));
    }

    //First Solution
    public static int maxArea(int[] height) {
        int maxAre = 0;
        int tempSqure;

        for (int i = 0; i < height.length; i++) {
            for (int j = 0; j < i; j++) {
                tempSqure = Math.abs(i - j) * (Math.min(height[i], height[j]));
                if(maxAre < tempSqure){
                    maxAre = tempSqure;
                }
            }
        }
        return  maxAre;
    }

    //Second Solution
    public static int maxArea2(int[] height){
        int maxArea = 0, l = 0, r = height.length - 1;
        while( l < r){
            maxArea = Math.max(maxArea, (r - l) * Math.min(height[l], height[r]));

            if(height[l] < height[r]){
                l++;
            }else{
                r--;
            }
        }
        return maxArea;
    }
}
