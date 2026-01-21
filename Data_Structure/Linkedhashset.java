package Data_Structure;
import java.util.LinkedHashSet;
public class Linkedhashset {

	public static void main(String[] args) {
		var Industry = new LinkedHashSet<String>();
		Industry.add("Google");
		Industry.add("Amazon");
		Industry.add("Infosys");
		Industry.add("Tcs");
		System.out.println("Industy Name According LinkedHashSet : ");
		for(String i:Industry)
		{
			System.out.println(i);
		}

	}

}
