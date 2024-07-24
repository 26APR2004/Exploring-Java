import java.util.*;
class calendr
{
  public static void main(String...args)
 {
     Scanner sc=new Scanner(System.in);
   int date;
   int month;
   int year;
  System.out.println("Enter the date");
  date=sc.nextInt();
  System.out.println("Enter the month");
  month=sc.nextInt();
  System.out.println("Enter the year");
  year=sc.nextInt();
  
  System.out.println("Current date:"+date+"-"+month+"-"+year);
  int day_passed=date;
  int daymonth[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
  if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) 
  {
      daymonth[2]=29;
      
  }
  for(int i=1;i<month;i++)
  {
      day_passed+=daymonth[i];
  }
//   System.out.println("Day passed:"+day_passed);
int change_year=year-1;
// System.out.println(" Changed Year :"+change_year);
int odd_year1=change_year/400;
// System.out.println("odd_year1 :"+odd_year1);
int _years=(change_year%400);
// System.out.println(" remaing years1 :"+_years);
int odd_year2=_years/100;
//  System.out.println("odd_year2 :"+odd_year2);
int _years1=(_years%100);
// System.out.println("remaing of  years2 :"+_years1);

int StartYear=(change_year - _years1)+1;
int lepYear=0;
// System.out.println("Start Year :"+StartYear);
for(int i=StartYear;i<change_year;i++)
{
    if(i%4==0 && i%100==0)
        lepYear++;
    else if(i%100==0 && i%400==0)
      lepYear++;
}

 int ordinary_year=_years1-lepYear;
    
// **System.out.println("ordinary year :"+ordinary_year);
int total_days=day_passed+(odd_year2*1)+(lepYear*2);// System.out.println("Total_days :"+total_days);

int odd_day=total_days%7;
// System.out.println("odd_days :"+odd_day);

switch(odd_day)
{
    case 0:
        System.out.println("Sunday");
        break;
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;    
    case 3:
        System.out.println("Wensday");
        break;
    case 4:
        System.out.println("Thursday");
        break;
    case 5:
        System.out.println("Friday");
        break;
    case 6:
        System.out.println("Saturday");
        break;
}

}}
