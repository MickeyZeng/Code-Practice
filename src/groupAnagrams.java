import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class groupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hash = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] array = strs[i].toCharArray();

            Arrays.sort(array);

            String key = String.valueOf(array);

            if(hash.containsKey(key)){
                hash.get(key).add(strs[i]);
            }else{
                ArrayList<String> temp = new ArrayList<>();
                temp.add(strs[i]);
                hash.put(key, temp);
            }
        }
        return new ArrayList<List<String>>(hash.values());
    }

}
