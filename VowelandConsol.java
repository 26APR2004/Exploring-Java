// Java program to show Vowels and Consol
import java.util.*;
class VowelandConsol
{
    static public void main(String...args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Alphabet:");
        char alp=sc.next().charAt(0);
        if((alp=='a'||alp=='e'||alp=='i'||alp=='o'||alp=='u')||(alp=='A'||alp=='E'||alp=='I'||alp=='O'||alp=='U'))
         System.out.println("Vowel");
        else
          System.out.println("Console");
    }
}
