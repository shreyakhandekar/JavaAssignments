package javaassign;

import java.util.Scanner;


public class CharOccurrence {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        System.out.println("Enter the character: ");
        char check = sc.next().charAt(0);
        int count = 0;
        for (int i=0;i<str.length();i++)
        {
            if (str.charAt(i)==check)
                count++;
        }
        System.out.println("Character '"+check+"' appears "+count+" times");
    }
}
