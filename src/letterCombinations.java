import java.util.ArrayList;
import java.util.List;

public class letterCombinations {

    public static ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) {
        String digits = "";
        System.out.println(letterCombinations(digits));
    }

    public static List<String> letterCombinations(String digits) {
        ArrayList<Character> digitsList = new ArrayList<>();
        for (int i = 0; i < digits.length(); i++) {
            digitsList.add(digits.charAt(i));
        }
        addList(digitsList);
        return list;
    }

    public static void addList(ArrayList<Character> input){
        ArrayList<String> charForTwo = new ArrayList<String>();
        charForTwo.add("a");
        charForTwo.add("b");
        charForTwo.add("c");
        ArrayList<String> charForThree = new ArrayList<String>();
        charForThree.add("d");
        charForThree.add("e");
        charForThree.add("f");
        ArrayList<String> charForFour = new ArrayList<String>();
        charForFour.add("g");
        charForFour.add("h");
        charForFour.add("i");
        ArrayList<String> charForFive = new ArrayList<String>();
        charForFive.add("j");
        charForFive.add("k");
        charForFive.add("l");
        ArrayList<String> charForSix = new ArrayList<String>();
        charForSix.add("m");
        charForSix.add("n");
        charForSix.add("o");
        ArrayList<String> charForSeven = new ArrayList<String>();
        charForSeven.add("p");
        charForSeven.add("q");
        charForSeven.add("r");
        charForSeven.add("s");
        ArrayList<String> charForEight = new ArrayList<String>();
        charForEight.add("t");
        charForEight.add("u");
        charForEight.add("v");
        ArrayList<String> charForNine = new ArrayList<String>();
        charForNine.add("w");
        charForNine.add("x");
        charForNine.add("y");
        charForNine.add("z");

        if(input.size() > 0){
            char temp = input.get(0);
            if(temp == '2'){
                expandList(charForTwo);
            }else if(temp == '3'){
                expandList(charForThree);
            }else if(temp == '4'){
                expandList(charForFour);
            }else if(temp == '5'){
                expandList(charForFive);
            }else if(temp == '6'){
                expandList(charForSix);
            }else if(temp == '7'){
                expandList(charForSeven);
            }else if(temp == '8'){
                expandList(charForEight);
            }else if(temp == '9'){
                expandList(charForNine);
            }
            input.remove(0);
            addList(input);
        }
    }

    public static void expandList(ArrayList<String> characterList){
        if(list.size() == 0){
            for (int i = 0; i < characterList.size(); i++) {
                list.add(characterList.get(i));
            }
        }else {
            ArrayList<String> temp = new ArrayList<>();

            for (int i = 0; i < list.size(); i++) {

                for (int j = 0; j < characterList.size(); j++) {
                    temp.add(list.get(i) + characterList.get(j));
                }
            }
            list.clear();
            list = (ArrayList<String>) temp.clone();
        }
    }
}
