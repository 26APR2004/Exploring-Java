import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.format.DateTimeFormatter;
import java.util.*;

class day
{
  public static void main(String[]args)
  {
      Scanner sc=new Scanner(System.in);
      
      DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
      System.out.println("Enter the date in the form(dd-mm-yyyy):");
      String inputdate=sc.nextLine();
      LocalDate date=LocalDate.parse(inputdate,formatter);
      DayOfWeek dayweek=date.getDayOfWeek();
      System.out.println("Day of the given date is:"+dayweek);
      
  }
}
