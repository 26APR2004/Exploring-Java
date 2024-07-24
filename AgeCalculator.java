import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class AgeCalculator
{
    static public void main(String...args)
    {
   
        LocalDate DOB = LocalDate.of(2004, 04, 26);  
        LocalDate  current_date=LocalDate.now();

        long year=ChronoUnit.YEARS.between(DOB,current_date);
        System.out.println("You are "+year+" years old");
    }
}
