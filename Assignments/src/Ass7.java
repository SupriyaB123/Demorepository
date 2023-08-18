import java.util.Scanner;

public class Ass7 {
	public static boolean checkNumber(int n,int curr) {
		while(n!=0) {
			int prev = n % 10;
			if(curr < prev) {
				return false;
			}
			n = n/10;
			curr = prev;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int curr = n % 10;
		System.out.println(checkNumber(n/10,curr));
		

	}

}
