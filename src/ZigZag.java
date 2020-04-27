import java.util.ArrayList;
import java.util.Vector;

public class ZigZag {
    public static void main(String[] args) {
//        System.out.println(convert("AB", 1));
//        System.out.println(reverse(-2147483648));
        pop(1234);
    }

    public static String convert(String s, int numRows) {
        if(numRows == 1){
            return s;
        }
        int direction = 1;
        int flag = 0;

        String result = "";
        Vector<Vector<String>> vectors = new Vector<Vector<String>>();
        for (int i = 0; i < numRows; i++) {
            Vector<String> tempVector = new Vector<>();
            vectors.add(tempVector);
        }

        for(int i = 0 ; i < s.length() ; i++){
            if(direction > 0){
                vectors.get(flag).add(String.valueOf(s.charAt(i)));
                if(flag < numRows - 1){
                    flag = flag + 1;
                }else{
                    direction = -1;
                    flag = flag - 1;
                }
            }else{
                vectors.get(flag).add(String.valueOf(s.charAt(i)));
                if(flag >= 1){
                    flag = flag - 1;
                }else{
                    direction = 1;
                    flag = flag + 1;
                }
            }
        }
        for (int i = 0; i < vectors.size(); i++) {
            for (int j = 0; j < vectors.get(i).size(); j++) {
                result = result + vectors.get(i).get(j);
            }
        }

        return result;
    }

    public static int reverse(int x) {

        if (x < Integer.MIN_VALUE || x > Integer.MAX_VALUE) {
            return 0;
        }

        int index = 1;
        double tempResult = 0.0;
        if(x < 0){
            index = -1;
        }

        String result = "";
        String number = Integer.toString(x);
        for(int i = 0 ; i < number.length() ; i++){
            if(index == -1 && i == 0){
                continue;
            }
            result = String.valueOf(number.charAt(i)) + result;
        }

        if(index == 1){
            tempResult =  Double.valueOf(result.trim());
        }else{
            tempResult =  Double.valueOf(result.trim()) * (-1);
        }

        if (tempResult < Integer.MIN_VALUE || tempResult > Integer.MAX_VALUE) {
            return 0;
        }else{
            x = (int) tempResult;
        }

        return x;
    }

    //简单de把数字反过来
    public static int pop(int x){
        ArrayList<Integer> pop = new ArrayList<Integer>();
        int temp = 0;
        int rev = 0;

        //把数字一个一个取出来
        while(x != 0) {
            pop.add(x % 10);
            x /= 10;
        }
        System.out.println(pop);

        //把数字反过来后组成一个新的数字
        for (int i = 0; i < pop.size(); i++) {
            temp = pop.get(i) + temp*10;
        }
        System.out.println(temp);
        return temp;
    }
}
