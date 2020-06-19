import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class isValidSudoku {
    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        boolean result = isValidSudoku(board);
        System.out.println(result);
    }

    public static boolean isValidSudoku(char[][] board) {

        List<Set<Character>> rows = new ArrayList<>(9);
        List<Set<Character>> cols = new ArrayList<>(9);
        List<Set<Character>> boxs = new ArrayList<>(9);

        for (int i = 0; i < 9; i++) {
            rows.add(new HashSet<>());
            cols.add(new HashSet<>());
            boxs.add(new HashSet<>());
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == '.') {
                    break;
                } else {
                    int boxRow = i / 3;
                    int boxCol = j / 3;
                    int idx = 3 * boxRow + boxCol;

                    Set<Character> row = rows.get(i);
                    Set<Character> col = cols.get(j);
                    Set<Character> box = boxs.get(idx);

                    if(row.contains(board[i][j]) || col.contains(board[i][j]) || box.contains(board[i][j])){
                        return false;
                    }else{
                        row.add(board[i][j]);
                        col.add(board[i][j]);
                        box.add(board[i][j]);
                    }
                }
            }
        }

        return true;
    }
}
