import java.util.*;
public class Lab3Ass3 {
	public static String alterString(String str){
		char c[] = new char[] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		char v[] = new char[] {'a','e','i','o','u'};
		String ne = "";
		for(int i=0;i<str.length();i++) {
			if(Arrays.binarySearch(v,str.charAt(i)) < 0) {
				int n = Arrays.binarySearch(c, str.charAt(i));
				if(n<25) {
					ne += c[n+1];
				}else {
					ne += c[0];
				}
			}else {
				ne+=str.charAt(i);
			}
		}

		return ne;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println("Old string : "+str+" \nNew String : "+alterString(str));

	}

}
