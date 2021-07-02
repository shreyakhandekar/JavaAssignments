package javaassign;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to check if palindrome or not: ");
        String str = sc.nextLine();
        System.out.println("you have entered '" + str + "'");
        boolean flag = true;
        str = str.toLowerCase();
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println(str + " is palindrome!!");
        } else
            System.out.println(str + " not a palindrome !!");
    }
}
