import java.util.ArrayList;

public class romanToInt {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        String[] resultDictionary = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        int[] numDictionary = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
        int result = 0;

        ArrayList<String> tempList = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {

            if(i < s.length() - 1){
                if(String.valueOf(s.charAt(i)).equals("I") && String.valueOf(s.charAt(i + 1)).equals("V")){
                    tempList.add("IV");
                    ++i;
                }else if(String.valueOf(s.charAt(i)).equals("I") && String.valueOf(s.charAt(i + 1)).equals("X")){
                    tempList.add("IX");
                    ++i;
                }else if(String.valueOf(s.charAt(i)).equals("X") && String.valueOf(s.charAt(i + 1)).equals("L")){
                    tempList.add("XL");
                    ++i;
                }else if(String.valueOf(s.charAt(i)).equals("X") && String.valueOf(s.charAt(i + 1)).equals("C")){
                    tempList.add("XC");
                    ++i;
                }else if(String.valueOf(s.charAt(i)).equals("C") && String.valueOf(s.charAt(i + 1)).equals("D")){
                    tempList.add("CD");
                    ++i;
                }else if(String.valueOf(s.charAt(i)).equals("C") && String.valueOf(s.charAt(i + 1)).equals("M")){
                    tempList.add("CM");
                    ++i;
                }else{
                    tempList.add(String.valueOf(s.charAt(i)));
                }
            }else{
                tempList.add(String.valueOf(s.charAt(i)));
            }
        }

        for (int i = 0; i < tempList.size(); i++) {
            for (int j = 0; j < resultDictionary.length; j++) {
                if(tempList.get(i).equals(resultDictionary[j])){
                    result = result + numDictionary[j];
                    break;
                }
            }
        }
        return result;
    }
}
