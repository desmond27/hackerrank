import java.util.Scanner;

public class AlterChar {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int[] dels = new int[t];
		for(int i = 0; i < t; i++){
			dels[i] = getDels(s.next());
		}
		
		for(int d : dels){
			System.out.println(d);
		}
	}
	
	private static int getDels(String inp){
		int dels = 0;
		char firstChar = inp.charAt(0);
		for(int i = 1; i < inp.length(); i++){
			if(inp.charAt(i) == firstChar)
				dels++;
			else
				firstChar = inp.charAt(i);
		}
		return dels;
	}
}