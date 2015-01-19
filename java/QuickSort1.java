/* Head ends here */
import java.util.*;
public class QuickSort1 {
       
          static void partition(int[] ar) {
             int j=0;
		int temp;
		for(int i = 1; i<ar.length; i++){
			if(ar[j]>ar[i]){
				temp = ar[i];
				for(int k=i;k>j;k--){
					ar[k]=ar[k-1];
				}
				ar[j]=temp;
				j++;
			}
		}
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
           partition(ar);
       }    
   }
