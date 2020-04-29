import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class intToRoman {
    public static void main(String[] args) {
        System.out.println(intToRoman(20));
    }

    public static String intToRoman(int num) {
        String returnResult = "";
        ArrayList<String> result = new ArrayList<String>();
        String[] resultDictionary = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        int[] numDictionary = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
        while (num > 0) {
            for (int i = numDictionary.length - 1; i >= 0 ; i--) {
                if(num >= numDictionary[i]){
                    num = num - numDictionary[i];
                    result.add(resultDictionary[i]);
                    ++i;
                }
            }
        }

        for (int i = 0; i < result.size(); i++) {
            returnResult = returnResult + result.get(i);
        }
        return returnResult;
    }
}
