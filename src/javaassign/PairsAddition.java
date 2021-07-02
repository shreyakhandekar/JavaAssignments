package javaassign;

import java.util.HashSet;
import java.util.Scanner;

public class PairsAddition {
    static void printpairs(int arr[], int sum)
    {
        HashSet<Integer> s = new HashSet<Integer>();
        for (int i = 0; i < arr.length; ++i)
        {
            int temp = sum - arr[i];

            // checking for condition
            if (s.contains(temp)) {
                System.out.println(
                        "Pair with given sum "
                                + sum + " is (" + arr[i]
                                + ", " + temp + ")");
            }
            s.add(arr[i]);
        }
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in array: ");
        int m = sc.nextInt();
        int[] arr = new int[20];
        System.out.println("Enter array: ");
        for (int i=0;i<m;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("\nElements are: ");
        for (int i=0;i<m;i++){
            System.out.println(arr[i]);
        }
        System.out.println("\nEnter sum to find pairs : ");
        int n = sc.nextInt();
        printpairs(arr, n);
    }
}