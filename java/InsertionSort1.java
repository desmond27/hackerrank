/* Head ends here */
import java.util.*;
public class Solution {
       
          static void insertionSort(int[] ar) {
           int currInt = ar[ar.length - 1];
    	   int i;
    	   try{
    	   for(i = ar.length - 2;i>=0 && currInt < ar[i];i--){
    		   ar[i+1]=ar[i];
    		   printArray(ar);
    	   }
    	   ar[i+1]=currInt;
    	   }
    	   catch(ArrayIndexOutOfBoundsException e){ar[0]=currInt;}
    	   printArray(ar);
       }   

/* Tail starts here */
 
 static void printArray(int[] ar) {
         for(int n: ar){
            System.out.print(n+" ");
         }
           System.out.println("");
      }
       
      public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
           int n = in.nextInt();
           int[] ar = new int[n];
           for(int i=0;i<n;i++){
              ar[i]=in.nextInt(); 
           }
           insertionSort(ar);
       }    
   }
