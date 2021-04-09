import com.sun.tools.hat.internal.util.Comparer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

//华为面试题
//10
//20
//40
//32
//67
//40
//20
//89
//300
//400
//15
public class SortAndNoRepetive {
    public static void main(String[] args) {
        int[] array = {10,20,40,32,67,40,20,89,300,400,15};
        sort(array);
    }

    public static void sort(int[] array){
        Arrays.sort(array);
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if(!hashMap.containsKey(array[i])){
                hashMap.put(array[i], array[i]);
                System.out.println(array[i]);
            }
        }
    }
}
