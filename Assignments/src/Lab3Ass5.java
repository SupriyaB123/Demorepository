import java.util.*;
public class Lab3Ass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		HashMap<String,Integer> map = new HashMap<String,Integer>();
	
		StringTokenizer st = new StringTokenizer(line);
		int countOfWords = 0;
		while(st.hasMoreElements()) {
			String temp = (String) st.nextElement();
			map.put(temp, temp.length());
			countOfWords++;
		}
		
		System.out.println("No. of Words : "+countOfWords);
		System.out.println("No. of letters present in the word : "+map);

	}

}
