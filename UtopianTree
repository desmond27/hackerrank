import java.util.Scanner;

public class Solution {
	public static void main(String[] args){
		int T;
		Scanner s = new Scanner(System.in);
		T = s.nextInt();
		int N[] = new int[T];
		for(int i = 0; i < T; i++)
			N[i] = s.nextInt();
		for(int n : N){
			int height = 1;
			for(int j=0; j<n; j++){
				if(j%2==0)
					height=height*2;
				else
					height++;
			}
			System.out.println(height);
		}
	}
}
