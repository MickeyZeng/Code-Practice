public class isMatchDP {
    public static void main(String[] args) {
         String s = "bbbba";
         String p = ".*a*a";

        System.out.println(isMatch(s, p));
    }

    public static boolean isMatch(String s, String p) {

        if (p.equals(".*")) {
            return true;
        }

        s = " " + s;
        p = " " + p;
        
        int stringLength = s.length();
        int patternLength = p.length();

//        System.out.println(s.length() + "\t " + p.length());

        boolean[][] resultExpression = new boolean[stringLength][patternLength];

        for (int i = 0; i < stringLength; i++) {
            if(i == 0){
                resultExpression[i][0] = true;
            }else{
                resultExpression[i][0] = false;
            }
        }

        for (int i = 0; i < resultExpression.length; i++) {
            for (int j = 1; j < resultExpression[i].length; j++) {
                if(p.charAt(j) == '.' || p.charAt(j) == s.charAt(i)){
                    if(i == 0){
                        if(p.charAt(j) == s.charAt(i)){
                            resultExpression[i][j] = true;
                        }else{
                            resultExpression[i][j] = resultExpression[i][j - 1];
                        }

                    }else {
                        resultExpression[i][j] = resultExpression[i - 1][j - 1];
                    }

                }else if(p.charAt(j) == '*'){

                    if(i == 0){
                        resultExpression[i][j] = resultExpression[i][j - 2];
                    }else {
                        resultExpression[i][j] = resultExpression[i][j - 2] ? resultExpression[i][j - 2] : ((s.charAt(i) == p.charAt(j - 1)|| p.charAt(j-1) == '.') && resultExpression[i - 1][j]);
                    }

                }else{

                    resultExpression[i][j] = false;

                }
            }
        }

        for (int i = 0; i < resultExpression.length; i++) {
            for (int j = 0; j < resultExpression[i].length; j++) {
                System.out.print(resultExpression[i][j] + "\t");
            }
            System.out.println("\n");
        }

        return resultExpression[stringLength - 1][patternLength - 1];
    }
}
