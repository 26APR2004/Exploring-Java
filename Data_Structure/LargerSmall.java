// Laregest And Smallest Elements From The Array

import java.util.Scanner;

class LargerSmall {

    public static void sec_large(int arr[]) {
        int larger = Integer.MIN_VALUE, secSmall = Integer.MAX_VALUE;
        int small = Integer.MAX_VALUE, secLarger = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            small = Math.min(small, arr[i]);
            larger = Math.max(larger, arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secLarger && larger > arr[i]) {
                secLarger = arr[i];
            }
            if (arr[i] < secSmall && small < arr[i]) {
                secSmall = arr[i];
            }
        }
        System.out.println("Largest Element From The Array : " + larger);
        System.out.println("Smallest Element From The Array : " + small);
        System.out.println("Second Largest Element From The Array : " + secLarger);
        System.out.println("Second Smallest Element From The Array : " + secSmall);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println(" Enter The Array Element : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sec_large(arr);
    }
}
