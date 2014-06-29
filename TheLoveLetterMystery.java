import java.util.Scanner;

public class Solution {
	public static void main(String[] args){
		int t;
		Scanner s = new Scanner(System.in);
		t = s.nextInt();
		String[] strings = new String[t];
		for (int i = 0; i < strings.length; i++) {
			strings[i] = s.next();
		}
		for(String a : strings){
			int changes = 0;
			char[] word = a.toCharArray();
			for(int i=0, j=word.length-1; i<j; i++, j--){
				if(word[i] != word[j]){
					int x = (char)word[i];
					int y = (char)word[j];
					changes += x>y?(x-y):(y-x);
				}
			}
			System.out.println(changes);
		}
	}
}
