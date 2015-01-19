import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		String inputs[] = new String[t];
		for(int i=0; i<t; i++)
			inputs[i] = s.next();
		for(String x:inputs){
			int mid = x.length() / 2;
			String a = x.substring(0, mid);
			String b = x.substring(mid, x.length());
			if(x.length() % 2 > 0)
				System.out.println(-1);
			else{
				List<Character> lista = new ArrayList<Character>();
				List<Character> listb = new ArrayList<Character>();
				for(int j = 0; j < a.length(); j++)
					lista.add(a.charAt(j));
				for(int k = 0; k < b.length(); k++)
					listb.add(b.charAt(k));
				for(Character y : listb)
					lista.remove(y);
				System.out.println(lista.size());
			}
		}
	}
}