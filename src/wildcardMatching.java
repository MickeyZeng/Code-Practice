public class wildcardMatching {
    public static void main(String[] args) {

        String s = "aa";
        String p = "*";

        System.out.println("Hello" + isMatch(s,p));
    }

    public static boolean isMatch(String s, String p) {
        boolean[][] result = new boolean[s.length() + 1][p.length() + 1];
//        System.out.println(result.length + " And " + result[0].length);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                char tempRow = ' ';
                char tempColum = ' ';

                if(i != 0){
                    tempRow = s.charAt(i - 1);
                }

                if(j != 0){
                    tempColum = p.charAt(j - 1);
                }

                if(tempRow == ' ' && (tempRow == tempColum || tempColum == '*')){
                    if(j == 0) {
                        result[i][j] = true;
                    }else{
                        result[i][j] = result[i][j - 1];
                    }
                }else if(tempColum == '?' && tempRow == ' '){
                    result[i][j] = false;
                }else if(tempColum == '?'){
                    result[i][j] = result[i - 1][j -1];
                }else if(tempColum == '*'){
                    result[i][j] = (result[i - 1][j] || result[i][j - 1]);
                }else if(tempColum == tempRow){
                    result[i][j] = result[i - 1][j -1];
                }else{
                    result[i][j] = false;
                }
            }
        }

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + "\t");
            }
            System.out.println("\n");
        }

        return result[s.length()][p.length()];
    }

}
