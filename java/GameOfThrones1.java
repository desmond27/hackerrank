import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;


public class GameOfThrones1 {
	public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String inputString = myScan.nextLine();
        Set<Character> charSet = new HashSet<Character>();
        String ans = "YES";
        // Assign ans a value of s or no, depending on whether or not inputString satisfies the required condition
        for(char c : inputString.toCharArray())
        	charSet.add(Character.valueOf(c));
        if(charSet.size() == inputString.length()){
        	ans = "NO";
        }
        else{
	        int oddcount = 0;
	        Iterator iterator = charSet.iterator();
	        while(iterator.hasNext()){
	        	int count = countChars(inputString, (char)iterator.next());
	        	if(count % 2 != 0 || count == 1){
	        		oddcount++;
	        	}else continue;
	        	if(oddcount > 1){
	        		ans = "NO";
	        		break;
	        	}
	        }
        }
        System.out.println(ans);
        myScan.close();
    }
	
	public static int countChars(String inp, char c){
		int count=0;
		for(char x : inp.toCharArray()){
			if(x==c)
				count++;
		}
		return count;
	}
}