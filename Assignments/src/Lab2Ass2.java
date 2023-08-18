import java.util.*;
import java.io.*;
public class Lab2Ass2 {
	public static String[] sortStr(String[] arr) {
		for(int i=0;i<arr.length - 1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].compareTo(arr[j])>0) {
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	public static String[] sortStrings(String[] arr) {
		arr = sortStr(arr);
		if(arr.length % 2 == 0) {
			for(int i=0;i<arr.length;i++) {
				if(i < arr.length/2 ) {
					arr[i] = arr[i].toUpperCase();
				}else {
					arr[i] = arr[i].toLowerCase();
				}
			}
		}else {
			for(int i=0;i<arr.length;i++) {
				if(i <= arr.length/2 ) {
					arr[i] = arr[i].toUpperCase();
				}else {
					arr[i] = arr[i].toLowerCase();
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of elements in string");
		int n = sc.nextInt();
		String[] arr = new String[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.next();
		}
		
		System.out.println("Sorted String is : "+Arrays.toString(sortStrings(arr)));

	}

}
