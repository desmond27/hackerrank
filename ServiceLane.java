import java.util.Scanner;

public class ServiceLane {
	public static int maxVeh(int[] lanes, int ent, int ext){
		int max=3;
		for(int i = ent; i <= ext; i++){
			if(lanes[i]<max) max=lanes[i];
		}
		return max;
	}
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int T = s.nextInt();
		int[] lanes = new int[N];
		for(int i=0; i<N; i++)
			lanes[i] = s.nextInt();
		for(int i=0; i<T; i++){
			int ent = s.nextInt();
			int ext = s.nextInt();
			System.out.println(maxVeh(lanes, ent, ext));
		}
	}
}
