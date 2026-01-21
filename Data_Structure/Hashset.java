package Data_Structure;
import java.util.HashSet;
import java.util.Scanner;
public class Hashset {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		var city = new HashSet<String>();
		System.out.println("Enter The City Name : ");
		for(int i=0;i<5;i++)
		{
			city.add(sc.next());
		}
		
		// Remove an Element
//		city.remove("Sangli");
		
		//Remove all Elements 
//		city.clear();
		
		System.out.println("Set Citys : ");
		for(String i : city)
		{
			System.out.println(i);
		}
        
		// Check if an Element Is Present
		System.out.println(city.contains("Mumabi"));
		
		// Size Of The  Hashset
		System.out.println("Size Of The Set : "+city.size());
	
		
	}

}
