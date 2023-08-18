import java.util.*;
public class Ass8 {
	public static boolean checkNumber(int n) {
		int two = 2;
		while(two<n) {
			System.out.println(two);
			if(n/two == 2) {
				return true;
			}
			two *= 2;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (checkNumber(n)==true) {
			System.out.print("No. entered is power of 2");
		}else {
			System.out.print("No. entered is not power of 2");
		}
		
	}

}
