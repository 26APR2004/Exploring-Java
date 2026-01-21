package Data_Structure;
import java.util.Collections;
import java.util.LinkedList;
public class SortingList {

	public static void AscSorting(LinkedList<String> list)
	{
		Collections.sort(list);
		System.out.print("List In Ascending Order : ");
		for(String i:list)
		{
			System.out.print(i+" ");
		}
		
	}
	
	public static void DescSorting(LinkedList<String> list)
	{
		Collections.sort(list,Collections.reverseOrder());
		System.out.print("List In Descending Order : ");
		for(String i :list)
		{
			System.out.print(i+" ");
		}
		
	}
	public static void main(String[] args) {
		var list = new LinkedList<String>();
		list.add("Onion");
		list.add("Tomato");
		list.add("Green-Onion");
		list.add("Potato");
		System.out.print("List Before Sorting : ");
		for(String i:list)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		AscSorting( list);
		System.out.println();
		DescSorting(list);
	}

}
