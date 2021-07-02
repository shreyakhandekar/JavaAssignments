package javaassign;

import java.util.HashSet;
import java.util.Scanner;

public class RepeatedEle {
    public static int main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in array: ");
        int n = sc.nextInt();
        int[] arr = new int[20];
        System.out.println("Enter array: ");
        for (int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("\nElements are: ");
        for (int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        HashSet<Integer> hs = new HashSet<>();
        for (int i=0;i<arr.length;i++){
            if (hs.contains(arr[i])){
                return arr[i];}
            else
                hs.add(arr[i]);
        }
        return -1;
    }
}
