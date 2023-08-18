import java.util.*;
public class Lab3Ass2 {
	public static String getImage(String s1) {
		StringBuffer sb = new StringBuffer(s1);
		sb.reverse();
		String s2 = sb.toString();
		return s2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		
		System.out.println(s1+"|"+getImage(s1));

	}

}
