package javaassign;

import java.util.Scanner;

public class DuplicateElements {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n;
        System.out.println("Enter number of elements: ");
        n = sc.nextInt();
        int[] arr = new int[20];
        System.out.println("\nPlease enter elements: ");
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("\nElements are: ");
        for (int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
       // int[] arr = new int[] {1,2,3,4,2,3,9,9,3};
        System.out.println("Duplicate elements are: ");

        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (arr[i]==arr[j])
                    System.out.println(arr[j]);
            }
        }
    }
}
