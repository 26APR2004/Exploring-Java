package Data_Structure;
import java.util.TreeSet;
public class Treeset {

	public static void main(String[] args) {
		var trset = new TreeSet<Integer>();
		trset.add(50);
		trset.add(20);
		trset.add(10);
		trset.add(40);
		trset.add(50);
		
		System.out.print("Treeset Elemnts : ");
		for(Integer i : trset)
		{
			System.out.print(i+" ");
		}
		System.out.println();
        System.out.println(trset.contains(10));
        System.out.println("Size Of The TreeSet : "+trset.size());
	}

}
