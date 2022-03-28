package genericLibrary;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;

public class JavaLibrary {

	public static void getRandomNumber() {
		Random num=new Random();
		num.nextInt(1000);
	}
	public static void main(String[] args) {    
		   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd_MM/yyyy HH:mm:ss");  
		   LocalDateTime now = LocalDateTime.now();  
		   System.out.println(dtf.format(now));  
		   
		   SimpleDateFormat formatter = new SimpleDateFormat("dd/MM_yyyy HH_mm:ss");  
		    Date date = new Date();  
		    System.out.println(formatter.format(date)); 
		    
		   // System.out.println(java.time.LocalDate.now());
		    
		   // System.out.println(java.time.LocalTime.now()); 
		    
		   // System.out.println(java.time.LocalDateTime.now());   
		    
		    System.out.println(java.time.Clock.systemUTC().instant()); 
		   
		    java.util.Date date1 = new java.util.Date();    
		    System.out.println(date1);
		    
		    long millis = System.currentTimeMillis();  
		    // creating a new object of the class Date  
		    java.util.Date date2 = new java.util.Date(millis);      
		    System.out.println(date2);   
		    
		  
		  }  
	
}
