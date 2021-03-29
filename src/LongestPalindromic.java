public class LongestPalindromic {
    public static void main(String[] args) {
        String s = "ac";
        System.out.println(longestPalindrome(s));
    }

    public static String longestPalindrome(String s) {

        int length = s.length();
        boolean[][] palindrome = new boolean [length][length];

        for (int i = 0; i < length; i++) {
            palindrome[i][i] = true;
        }

        for (int i = 0; i < length - 1; i++) {
            palindrome[i][i + 1] = s.charAt(i) == s.charAt(i + 1);
        }


        for (int len = 2; len < length; len++) {
            for (int i = 0; i < length; i++) {
                int j = i + len;
                if(j >= length){
                    continue;
                }
                if (s.charAt(i) != s.charAt(j)) {
                    palindrome[i][j] = false;
                } else {
                    if (palindrome[i + 1][j - 1]) {
                        palindrome[i][j] = true;
                    } else {
                        palindrome[i][j] = false;
                    }
                }
            }
        }


//        for (int i = 0; i < length; i++) {
//            for (int j = 0; j < length; j++) {
//                System.out.print(palindrome[i][j] + "\t");
//            }
//            System.out.println("\n");
//        }

        int best = 0;
        int start = 0;
        int end = 0;
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                if(palindrome[i][i] && palindrome[i][j] && (j - i) > best){
                    best = j - i;
                    start = i;
                    end = j;
                }
            }
        }
//        System.out.println(start + "\t" + end + "\t" + best);
        return s.substring(start,end + 1);
    }
}
