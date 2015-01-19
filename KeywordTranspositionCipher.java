import java.util.Arrays;
import java.util.Scanner;


public class Solution {
	private static String alphabets = new String("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		String[] res = new String[N];
		for(int i = 0; i < N; i++){
			String keyword = scanner.next();
			String substitution = getSubstitution(keyword);
			scanner.nextLine();
			String[] ciphertext = scanner.nextLine().split(" ");
			StringBuilder temp = new StringBuilder();
			for(String el : ciphertext){
				for(char c : el.toCharArray()){
					temp.append(alphabets.charAt(substitution.indexOf(String.valueOf(c))));
				}
				temp.append(" ");
			}
			res[i] = temp.toString();
		}
		for(String r : res)
			System.out.println(r);
	}
	
	public static String getSubstitution(String key){
		StringBuilder sub = new StringBuilder(26);
		StringBuilder noDup = new StringBuilder();
		StringBuilder noDupKey = new StringBuilder();
		String temp = key + alphabets;
		for(char c : temp.toCharArray()){
			if(noDup.toString().indexOf(c) > -1)
				continue;
			noDup.append(c);
		}
		for(char c : key.toCharArray()){
			if(noDupKey.toString().indexOf(c) > -1)
				continue;
			noDupKey.append(c);
		}
		temp = noDupKey.toString();
		char[] sortKey = temp.toCharArray();
		Arrays.sort(sortKey);
		for(int i = 0; i < sortKey.length; i++){
			for(int j = noDup.indexOf(String.valueOf(sortKey[i])); j < noDup.length(); j=j+sortKey.length){
				sub.append(noDup.charAt(j));
			}
		}
		return sub.toString();
	}
}