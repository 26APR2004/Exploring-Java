// Verfy Array Is Sorted

import java.util.Scanner;

class IsArraySorted {

    // Brute Force Approach  T.C = O(N^2)
    public static boolean IsSorted(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    // Optimal Approach      T.C =O(N)
    public static boolean IsArraySorted(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int Arrlength = arr.length;
        System.out.println("Enter Array Elemnets : ");
        for (int i = 0; i < Arrlength; i++) {
            arr[i] = sc.nextInt();
        }
        // System.out.println(IsSorted(arr));
        System.out.println(IsArraySorted(arr));
    }
}
