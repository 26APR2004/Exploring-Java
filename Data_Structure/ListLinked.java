package Data_Structure;
import java.util.LinkedList;
public class ListLinked {

	public static void main(String[] args) {
		var num =new LinkedList<String>();
		num.add("Akash");
		num.add("Anish");
		num.add("Parth");
		num.add("Sujal");
		
		num.addFirst("Pranav");
		num.addLast("Amey");
		
		num.removeFirst();
		num.removeLast();
		System.out.println(num);
		System.out.println(num.getFirst());
		System.out.println(num.getLast());

	}

}
