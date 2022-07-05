

	import java.time.LocalTime;  
	public class Date { 
	  public static void main(String[] args) {  
	    LocalTime time = LocalTime.now();  
	    System.out.println(time); 
	    
	    LocalTime time1 = LocalTime.of(10,43,12);  
	    System.out.println(time1); 
	    
	    LocalTime time2=time1.minusHours(2);  
	    LocalTime time3=time2.minusMinutes(34);  
	    System.out.println(time3);
	    
	    LocalTime time4=time1.plusHours(4);  
	    LocalTime time5=time4.plusMinutes(18);  
	    System.out.println(time5);  
	  }  
	}  

