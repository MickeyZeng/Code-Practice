import java.util.ArrayList;

public class isPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(10));
    }

    public static boolean isPalindrome(int x) {

        if(x < 0){
            return false;
        }else if(x == 0){
            return true;
        }

        //First of all reverse the number
        int sub = x;
        int num = 0;
        int newNum = 0;

        ArrayList<Integer> arraylist = new ArrayList<Integer>();
        while(sub != 0){
            num = sub % 10;
            sub = sub / 10;
            arraylist.add(num);
        }

        for (int i = 0; i < arraylist.size(); i++) {
            newNum = newNum * 10 + arraylist.get(i);
        }

        if(newNum == x){
            return true;
        }else{
            return false;
        }


    }
}
