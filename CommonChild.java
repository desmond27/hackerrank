import java.util.Scanner;
public class Solution {
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		char[] a = s.next().toCharArray();
		char[] b = s.next().toCharArray();
		int[][] dp = new int[a.length + 1][b.length + 1];
		dp[0][0] = 1;
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < b.length; j++){
				if (a[i] == b[j]){
					dp[i + 1][j + 1] = dp[i][j] + 1;
				}
				else{
					dp[i + 1][j + 1] = Math.max(dp[i][j + 1], dp[i + 1][j]);
				}
			}
		System.out.println(dp[a.length][b.length]);
	}
}