import java.util.Vector;

public class Solution {
    public static void main(String[] args) {
        System.out.println(convert("AB", 1));
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
}
