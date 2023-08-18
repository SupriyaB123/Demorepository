import java.util.*;
public class Ass6 {
	public static int calculateDifference(int n) {
		int sum = 0;
		int squareSum = 0;
		int diff = 0;
		for(int i=1;i<=n;i++) {
			squareSum += i*i;
			sum += i;
		}
		return squareSum - (sum*sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Difference is : "+calculateDifference(n));
		

	}

}
