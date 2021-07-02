package javaassign;

import java.util.Scanner;

public class SmallestLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[20];
        System.out.println("\nEnter array: ");
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int smallest = arr[0];
        int largest = arr[0];
        for (int i=0;i<n;i++){
            if (arr[i]<smallest){
                smallest = arr[i];
            }else if (arr[i]>largest){
                largest = arr[i];
            }
        }
        System.out.println("\nSmallest: "+smallest+"\nLargest: "+largest);

    }
}
