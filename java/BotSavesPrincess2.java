import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BotSavesPrincess2 {
	//static int pX=0;
	//static int pY=0;
	//static int r=0;
	//static int mY=0;
	/* Head ends here */
	static void nextMove(int n, int r, int c, String [] grid){
		int pX =0;
		int pY =0;
		for(int i=0;i<n;i++){
			if(grid[i].indexOf('p') != -1){
				pX = grid[i].indexOf('p');
				pY = i;
			}
		}
		
		if(c < pX){
			System.out.println("RIGHT");
			//r++;
			return;
		}
		if(c > pX){
			System.out.println("LEFT");
			//r--;
			return;
		}
		if(r < pY){
			System.out.println("DOWN");
			//mY++;
			return;
		}
		if(r > pY){
			System.out.println("UP");
			//mY--;
			return;
		}
	}
	/* Tail starts here */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n,r,c;
		n = in.nextInt();
		r = in.nextInt();
		c = in.nextInt();
		in.useDelimiter("\n");
		String grid[] = new String[n];


		for(int i = 0; i < n; i++) {
			grid[i] = in.next();
		}
		
		nextMove(n,r,c,grid);

	}
}