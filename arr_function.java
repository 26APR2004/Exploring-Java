// java program to find minimum number from arr
import java.util.*;
class arr_function
{
    static void min(int arr[])
    {
        int min=arr[0];
        for(int i=1;i<arr.length;i++)
        if(min>arr[i])
          min=arr[i];

        System.out.println("min is:"+min);
    }
    public static void main(String...args)
    {
        int a[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array:");
        for(int i=0;i<a.length;i++)
           a[i]=sc.nextInt();
         
        min(a);
    }
}