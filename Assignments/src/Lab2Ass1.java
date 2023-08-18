import java.util.*;
public class Lab2Ass1 {
	public static int getSecondSmallest(int[] num) {
		Arrays.sort(num);
		return num[1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("no. in the array");
		int n = sc.nextInt();
		int num[]= new int[n];
		for(int i=0;i<n;i++) {
			num[i] = sc.nextInt();
		}
		System.out.println("Second smallest no."+getSecondSmallest(num));

	}

}
