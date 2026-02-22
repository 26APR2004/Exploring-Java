/*An international round table conference will be held in india. 
 * Presidents from all over the world representing their respective countries will be attending the conference. 
 * The task is to find the possible number of ways(P) to make the N members sit around the circular table such that.
 *

The president and prime minister of India will always sit next to each other.

Example 1:

Input :

4   -> Value of N(No. of members)

Output : 

12  -> Possible ways of seating the members

Explanation:

2  members should always be next to each other. 

So, 2 members can be in 2!ways

Rest of the members can be arranged in (4-1)! ways.(1 is subtracted because the previously selected two members will be considered as single members now).

So total possible ways 4 members can be seated around the circular table 2*6= 12. */
package dataStructure;
import java.util.Scanner;
public class TCSNQT_Prpblem_7 {
	
    public static int Fact(int N)
    {
    	    if(N<=1)
    	    	  return 1;
    	    return N*Fact(N-1);
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of members :");
		int N = sc.nextInt();
	    int possiblitiy = Fact(2)*Fact(N-1);
	    System.out.println(possiblitiy);
	    sc.close();

	}

}
