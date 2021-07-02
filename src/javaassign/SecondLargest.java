package javaassign;

import java.util.Scanner;

public class SecondLargest {

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


        int largest = arr[0];
        int secondLargest = arr[0];
        System.out.println("\nElements are: ");
        for (int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        for (int i=0;i<n;i++){
            if (arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }else if (arr[i]>secondLargest){
                secondLargest = arr[i];
            }
        }
        System.out.println("\nSecond largest number is: "+ secondLargest);
    }
}
