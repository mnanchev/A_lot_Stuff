package homework;

import java.time.LocalDate;
import java.time.LocalDateTime;;

public class CurrentDateTime {
	public static void main(String[] args){
	LocalDateTime dateTime = LocalDateTime.now();
	LocalDate ld = dateTime.toLocalDate();
	System.out.println("Local date: "+ld +"    "+"Local time: "+dateTime.toLocalTime());
	}
	
}
