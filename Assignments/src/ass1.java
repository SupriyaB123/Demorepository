import java.util.*;
public class ass1 {
	public static int calculateSum(int n,int sum) {
		for(int i=0;i<=n;i++) {
			if(i%3==0 || i%5==0) {
				sum += i;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		System.out.println("Total sum which no. divisible by 3 and 5: "+calculateSum(n,sum));

	}

}
