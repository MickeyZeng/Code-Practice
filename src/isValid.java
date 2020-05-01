import java.util.ArrayList;

public class isValid {
    public static void main(String[] args) {
        System.out.println(isValid("]}"));
    }

    public static boolean isValid(String s){
        ArrayList<Character> left = new ArrayList<Character>();

        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if(temp == '(' || temp == '{' || temp == '['){
                left.add(temp);
            }else{
                if(left.size() == 0){
                    return false;
                }
                if((left.get(left.size() - 1) == '(' && temp == ')') || (left.get(left.size() - 1 ) == '{' && temp == '}') || (left.get(left.size() - 1) == '[') && temp == ']'){
                    left.remove(left.size() - 1);
                }else{
                    return false;
                }
            }
        }

        if(left.size() == 0){
            return  true;
        }

        return false;
    }
}
