import java.util.*;
public class Lab3Ass4 {
	
	public static int modifyNumber(int n) {
		int count = 0;
		int no = 0;
		int prev = 0;
		while(n!=0) {
			int curr = n%10;
			int ten = (int) (Math.pow(10,count));
			
			//ternary operator
			int diff = curr>prev ? curr - prev : prev - curr;
			
			//Operation
			no += ten*diff;
			
			//This is only for iteration
			prev = curr;
			count++;
			n = n/10;
		}
		return no;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(modifyNumber(a));
	}

}
