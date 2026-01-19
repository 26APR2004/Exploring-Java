// Largest Element From The Array

import java.util.Scanner;

class LargestElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums[] = new int[10];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int Largest = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > Largest) {
                Largest = nums[i];
            }
        }

        System.out.println("Largest Element: " + Largest);

    }
}
