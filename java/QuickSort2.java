import java.util.*;
public class QuickSort2 {
	
	static void quickSort(int[] ar) {
		int p = 0;
		int start = p;
		int end = ar.length - 1;
		if(end-start<=1){
			return;
		}
		partition(ar, start, end);
	}

	static void partition(int[] ar, int start, int end) {
		int p=start;
		int temp;
		if(end-start<=0)
			return;
		for(int i = p+1; i<=end; i++){
			if(ar[p]>ar[i]){
				temp = ar[i];
				for(int k=i;k>p;k--){
					ar[k]=ar[k-1];
				}
				ar[p]=temp;
				p++;
			}
		}
		partition(ar, start, p-1);
		partition(ar, p+1, end);
		printArray(ar, start, end);
	}

	/* Tail starts here */
	
	static void printArray(int[] ar, int start, int end) {
		for(int i = start; i<=end; i++){
			System.out.print(ar[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for(int i=0;i<n;i++){
			ar[i]=in.nextInt(); 
		}
		quickSort(ar);
	}    
}