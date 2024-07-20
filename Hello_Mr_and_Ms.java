/*Write a program that has name and gender as the variable.Use switch case statment that prints:
Hello Mr for male and Hello Ms for female*/
import java.util.*;
class Hello_Mr_and_Ms
{
    static public void main(String...args)
    {
        Scanner h=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=h.nextLine();
        System.out.println("Enter your gender in small letter:");
        String gender=h.nextLine();
        
        switch(gender)
        {
            case "male":
            System.out.println("Hello Mr:"+name);  
            break;
            case "female":
            System.out.println("Hello Ms:"+name);  
            break;
            default:
            System.out.println("What's up "+name);  
            break;
            
        }
    }
}
