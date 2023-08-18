import java.util.*;

public class Lab2Ass4 {
	public static int[] modifyArray(int[] arr) {
		Arrays.sort(arr);
		
		//To remove Duplicates we use HashSet
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}

		//To take elements from hash set to array
		int j=0;
		int[] ar = new int[set.size()];
		for(Integer b:set) {
			ar[j]=b;
			j++;
		}
		
		//Sort array in the reverse order
		for(int i=0;i<ar.length-1;i++) {
			for(int k=i+1;k<ar.length;k++) {
				if(ar[k]>ar[i]) {
					int temp = ar[k];
					ar[k] = ar[i];
					ar[i] = temp;
				}
			}
		}
		
		return ar;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(modifyArray(arr)));
	}

}
