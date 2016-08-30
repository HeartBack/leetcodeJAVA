import java.util.HashSet;
import java.util.Set;

public class LeetCode36 {
	public boolean isValidSudoku(char[][] board) {
		int[][] s=new int[9][10];
		int[][][] ss=new int [3][3][10];
		
		for (int i = 0; i < 9; i++) {
			int[] set=new int[10];
			for (int j = 0; j < 9; j++) {
				if (board[i][j] != '.') {
					if (set[board[i][j]-48]!=0) {
						return false;
					} else {
						set[board[i][j]-48]++;
						if (s[j][board[i][j]-48]!=0) {
							return false;
						} else {
							s[j][board[i][j]-48]++;
						}
						if (ss[i / 3][j / 3][board[i][j]-48]!=0) {
							return false;
						} else {
							ss[i / 3][j / 3][board[i][j]-48]++;
						}
					}
				}
			}
		}

		return true;
	}
}
