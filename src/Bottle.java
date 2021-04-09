//华为面试题
public class Bottle {
    public static void main(String[] args) {
        System.out.println(bottle(81));
    }

    public static int bottle(int empty){
        int result = 0;

        while(empty >= 2){
            int prev = 0;
            if(empty == 2){
                result = result + 1;
                empty = 0;
            }else{
                result = empty / 3 + result;
                prev = empty / 3;
                empty = (empty % 3) + prev;
//                System.out.println(empty%3 + "****");
            }
        }
        return result;
    }
}
