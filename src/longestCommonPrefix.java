public class longestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"aca","cba"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs){
        if(strs.length == 0){
            return "";
        }
        String result = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if(commonPart(result,strs[i]).equals("")){
                return "";
            }
            result = commonPart(result, strs[i]);
        }
        return result;
    }

    public static String commonPart(String s1, String s2){
        String result = "";

        for (int i = 0; i < (Math.min(s1.length(), s2.length())); i++) {
            if(s1.charAt(i) == s2.charAt(i)){
                result = result + String.valueOf(s1.charAt(i));
            }else{
                return result;
            }
        }

        return result;
    }
}
