// Find The Second Largest Element Of The Array

import java.util.Arrays;
import java.util.Scanner;

class SecondLargest {

    // T.C = O(N^2)
    public static int secLargest(int arr[]) {
        // First Finf Largset Element
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        // With The Help Of Largest Element Find Second Largest Element
        int seclarg = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > seclarg && arr[i] < largest) {
                seclarg = arr[i];
            }
        }
        return seclarg;
    }

    public static int secSmallest(int arr[]) {
        // Smallest Element
        int smallest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        int secsmall = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < secsmall && arr[i] > smallest) {
                secsmall = arr[i];
            }
        }
        return secsmall;
    }
    // Brute Force Approach To Find Second Smallest Element

    public static int secSmall(int arr[]) {
        Arrays.sort(arr);

        return arr[arr.length - 4];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter The Array Elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(" Second Largest Element : " + secLargest(arr));
        System.out.println(" Second Smallest Element : " + secSmall(arr));

    }
}
