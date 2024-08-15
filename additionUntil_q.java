import java.util.*;

public class additionUntil_q{
  public static void main(String[] args) {

    String choice = "";
    Scanner input = new Scanner(System.in);

    int sum = 0;
    int product = 1;
    int count = 0;

    while (true) {

      choice = input.nextLine();

      if (choice.equalsIgnoreCase("q")) {
        break;
      }

      try {
        int number = Integer.parseInt(choice);
        sum += number;
        product *= number;
        count++;
      } catch (NumberFormatException e) {
        System.out.println("Invalid input. Please enter a valid integer or 'q' to quit.");
      }
    }

    if (count > 0) {
      double average = (double) sum / count;
      System.out.println("Product is: " + product);
      System.out.printf("Average is:%5f ", average);
    } else {
      System.out.println("No numbers were entered.");
    }

    input.close(); // Close the scanner to avoid resource leaks
  }
}
