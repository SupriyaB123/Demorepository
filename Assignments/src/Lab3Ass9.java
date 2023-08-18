import java.time.LocalTime;
import java.util.*;
import java.util.Date;
import java.time.Month;
import java.time.LocalDate;
import java.time.LocalTime;

public class Lab3Ass9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String date = "2023-08-18";
		LocalDate currentDate = LocalDate.parse(date);
		LocalDate ld = LocalDate.now();
		
		int day = currentDate.getDayOfMonth();
		int dayNow = ld.getDayOfMonth();		 
        // Get month from date
        Month month = currentDate.getMonth();
        Month monthNow = ld.getMonth();
 
        // Get year from date
        int year = currentDate.getYear();
        int yearNow = ld.getYear();
        
        int diffDay = day - dayNow;
 
        int diffYear = year - yearNow;
        
        System.out.println("Day: " + Math.subtractExact(day, dayNow));

        System.out.println("Year: " + Math.subtractExact(year, yearNow));
		
	}

}
