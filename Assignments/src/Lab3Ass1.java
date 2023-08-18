import java.util.*;
public class Lab3Ass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line = "123,435,534,432,435";
		StringTokenizer st = new StringTokenizer(line,",");
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int sum =0;
		
		while(st.hasMoreTokens()) {
			int a = Integer.parseInt(st.nextToken());
			arr.add(a);
			sum += a;
		}
		
		System.out.println(arr);
		System.out.println("Sum of elements of array : "+sum);
		

	}

}
