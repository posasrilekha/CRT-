import java.util.*;

public class NQueens {
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];

        for (char[] row : board)
            Arrays.fill(row, '.');

        backtrack(0, board, result);
        return result;
    }

    private static void backtrack(int row, char[][] board, List<List<String>> result) {
        int n = board.length;
        if (row == n) {
            List<String> solution = new ArrayList<>();
            for (char[] line : board)
                solution.add(new String(line));
            result.add(solution);
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';
                backtrack(row + 1, board, result);
                board[row][col] = '.'; 
            }
        }
    }

    private static boolean isSafe(int row, int col, char[][] board) {
        int n = board.length;

        for (int i = 0; i < row; i++) 
            if (board[i][col] == 'Q')
                return false;

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) 
            if (board[i][j] == 'Q')
                return false;

        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) 
            if (board[i][j] == 'Q')
                return false;

        return true;
    }

    public static void main(String[] args) {
        int n = 4;
        List<List<String>> solutions = solveNQueens(n);
        System.out.println("Total Solutions: " + solutions.size());
        for (List<String> sol : solutions) {
            for (String row : sol)
                System.out.println(row);
            System.out.println();
        }
    }
}