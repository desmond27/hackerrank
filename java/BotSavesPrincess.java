import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BotSavesPrincess {
	static int mX=0;
	static int mY=0;
	static int pX=0;
	static int pY=0;
	/* Head ends here */
	static void displayPathtoPrincess(int n, String [] grid){
		while((mX != pX) && (mY != pY)){
			if(mY < pY){
				System.out.println("DOWN");
				mY++;
			}
			if(mY > pY){
				System.out.println("UP");
				mY--;
			}
			if(mX < pX){
				System.out.println("RIGHT");
				mX++;
			}
			if(mX > pX){
				System.out.println("LEFT");
				mX--;
			}
		}
	}
	/* Tail starts here */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m;
		m = in.nextInt();
		String grid[] = new String[m];
		for(int i = 0; i < m; i++) {
			grid[i] = in.next();
		}
		
		for(int i=0;i<m;i++){
			if(grid[i].indexOf('m') != -1){
				mX = grid[i].indexOf('m');
				mY = i;
			}
			if(grid[i].indexOf('p') != -1){
				pX = grid[i].indexOf('p');
				pY = i;
			}
		}

		displayPathtoPrincess(m,grid);
	}
}