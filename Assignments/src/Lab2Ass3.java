import java.util.*;
public class Lab2Ass3 {
	public static int[] getSorted(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int n = arr[i];
			
			//Reverse of digits of number
			int rev = 0;
			while(n>0){
			    rev = (rev) * 10 + (n%10);
			    n = n/10;
			}
			arr[i] = rev;
		}
		Arrays.sort(arr);
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter elements in the array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Sorted array after reversing"+Arrays.toString(getSorted(arr)));

	}

}
