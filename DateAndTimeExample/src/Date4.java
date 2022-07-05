import java.time.OffsetDateTime;  
public class Date4  {  
    public static void main(String[] args) {  
        OffsetDateTime offsetDT = OffsetDateTime.now();  
        System.out.println(offsetDT.getDayOfMonth());  
       
        System.out.println(offsetDT.getDayOfWeek()); 
    }  
}  



