import java.util.*;
public class Lab3Ass8 {
	public static String checkStr(String str) {
		char[] tempArray = str.toCharArray();
		Arrays.sort(tempArray);
		String newStr = "";
		
		for(int i=0;i<tempArray.length;i++) {
			newStr += tempArray[i];
		}
		
		if(newStr.equals(str)) {
			return "Yes";
		}else {
			return "No";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(checkStr(str));

	}

}
