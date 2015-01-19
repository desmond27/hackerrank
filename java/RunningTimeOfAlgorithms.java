/* Head ends here */
import java.util.*;
public class RunningTimeOfAlgorithms {
       
       static void insertionSort(int[] ar) {
    	   int count=0;
    	   for(int i=1;i<ar.length;i++){
    		   int currInt = ar[i];
    		   int j=i-1;
    		   while(j>=0 && ar[j]>currInt){
    			   ar[j+1]=ar[j];
    			   count++;
    			   j--;
    		   }
    		   ar[j+1]=currInt;
    	   }
    	   System.out.println(count);
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
