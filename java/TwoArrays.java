import java.util.Arrays;
import java.util.Scanner;


public class TwoArrays {
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		String[] res = new String[t];
		for(int i = 0; i < t; i++){
			res[i] = "YES";
			int n = s.nextInt();
			int k = s.nextInt();
			int[] a = new int[n];
			int[] b = new int[n];
			for(int j = 0; j < n; j++){
				a[j] = s.nextInt();
			}
			Arrays.sort(a);
			for(int j = 0; j < n; j++){
				b[j] = s.nextInt();
			}
			Arrays.sort(b);
			for(int j = 0, l = b.length-1; j < a.length-1; j++, l--){
				if(!(a[j]+b[l] >= k)){
					res[i] = "NO";
					break;
				}
			}
		}
		for(String r : res)
			System.out.println(r);
	}
}