public class strStr {

    public static void main(String[] args) {
        System.out.println(strStr("mississippi","issipi"));
    }

    public static int strStr(String haystack, String needle) {
        if(needle.length() == 0){
            return 0;
        }

        if(needle.length() > haystack.length()){
            return -1;
        }

        if(haystack.length() == needle.length()){
            return haystack.equals(needle) ? 0 : -1;
        }

//        int position = haystack.indexOf(needle);

        int position = -1;
        boolean flag = false;   //needle 字符串的位置

        for (int i = 0; i < haystack.length(); i++) {
            if(haystack.charAt(i) == needle.charAt(0)){
                for (int j = 0; j < needle.length(); j++) {
                    if(i + j >= haystack.length()){
                        break;
                    }
                    if(haystack.charAt(i + j) == needle.charAt(j)){
                        if(j == needle.length() - 1){
                            return i;
                        }
                        continue;
                    }else{
                        break;
                    }
                }
            }
        }

        return -1;
    }

}
