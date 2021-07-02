package javaassign;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        int flag =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        while (num != 1) {
            if (num % 2 == 0) {
                num /= 2;
                flag =1;
            } else {
                flag =0;
            }
        }
        if (flag==1){
            System.out.println("Given is power of two");
        }else
            System.out.println("Given is not in power of two");
    }
}
