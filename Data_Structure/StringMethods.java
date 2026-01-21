package Data_Structure;

public class StringMethods {

	public static void main(String[] args) {
		String Text="   Hello, How Is YoYo!";
		String Text1="Hello, How Is YoYo!";
		String Text2="hello, how Is yoYo!";
		
		System.out.println(Text.charAt(0));  // charAt() - method returns the character at the specified index in a string.
        System.out.println("Comares: "+Text.compareTo(Text1)); //compareTo()-method compares two strings lexicographicall
	    System.out.println("Index Of Character: "+Text.indexOf('Y'));//
	    String BugMeassage=Text.concat(Text1);//concat() method appends (concatenate) a string to the end of another string.
	    System.out.println(BugMeassage);
	    System.out.println("Is Message Contain \"YoYo\" : "+Text.contains("YoYo"));//ontains() method checks whether a string contains a sequence of characters.
	    System.out.println("Is String Starts With \"Hello\" : "+Text.startsWith("Hello"));
	    System.out.println("Is String Ends With \"Hello\" : "+Text.endsWith("Hello")); //endsWith() method checks whether a string ends with the specified character(s)
	    System.out.println("Is Two Strings are Same :"+Text.equals(Text1) ); //equals() method compares two strings, and returns true if the strings are equal, and false if not.
	    System.out.println("Is TwO Sreings are Same : "+Text.equalsIgnoreCase(Text2));//equalsIgnoreCase() method compares two strings, ignoring lower case and upper case differences
	    System.out.println("Length of the String : "+Text.length()); //length() method returns the length of a specified string.
	    System.out.println("Matches : "+Text.matches(".*Hello.*")); //matches() method searches a string for a match against a regular expression, and returns the matches.
	    System.out.println("Replace The Containt : "+Text.replace("YoYo", "You'r Daughter")); //replace() method searches a string for a specified character, and returns a new string where the specified character(s) are replaced
	    char MyChar[]=Text.toCharArray();
	    System.out.print("Character Array : ");  //toCharArray() method returns a new char array representing the contents of the string
	    for(int i=0;i<MyChar.length;i++)
	    {
	    	System.out.print(MyChar[i]+" ");
	    }
	     System.out.println();
	    System.out.println("Text In Lower Case : "+Text.toLowerCase());//toLowerCase() method converts a string to lower case letters.
	    System.out.println("Text In Upper Case : "+Text.toUpperCase());//toUpperCase() method converts a string to upper case letters
	    System.out.println("Test Without White Space : "+Text.trim());
	}

}
