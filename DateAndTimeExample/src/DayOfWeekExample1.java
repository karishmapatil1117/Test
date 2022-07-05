import java.time.*;  
import java.time.temporal.ChronoField;  
public class DayOfWeekExample1 {  
  public static void main(String[] args) {  
    LocalDate localDate = LocalDate.of(2022, Month.JUNE, 15);  
    DayOfWeek dayOfWeek = DayOfWeek.from(localDate);  
    System.out.println(dayOfWeek.get(ChronoField.DAY_OF_WEEK));  
  }  
}  