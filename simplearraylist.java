import java.util.*;
class simplearraylist
{
    public static void main(String...args)
    {
        int sum=0;
        ArrayList<Integer>l=new ArrayList<Integer>();  // Declartion of array
        System.out.println("Enter the input");
        Scanner input=new Scanner(System.in);
        while(input.hasNextInt())   // This stepn will take input from user until ctrl+z press
        {
            l.add(input.nextInt());
        }
        for(int i=0;i<l.size();i++)  // This will calaculate the sum
        {
            sum+=l.get(i);
        }
        System.out.println("sum of all elements: "+sum);
    }
}