package javaassign;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting number of range: ");
        int start = sc.nextInt();
        System.out.println("Enter ending number of range: ");
        int end = sc.nextInt();
        System.out.println("Prime numbers in "+start+" to "+end+" range: ");
        int count;
        for (int i=start;i<=end;i++){
            count =0;
            for (int j=1;j<=i;j++){
                if (i%j==0)
                    count = count+1;
            }
            if (count==2)
                System.out.println(i);
        }
    }
}
