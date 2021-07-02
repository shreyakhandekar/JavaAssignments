package javaassign;

import java.util.Scanner;

public class CheckAnagrams {
    static int NO_OF_CHAR = 256;

    static boolean Anagramstrings(char[] str1, char[] str2) {
        int[] count = new int[NO_OF_CHAR];
        int i;
        for (i = 0; i < str1.length; i++) {
            count[str1[i] - 'a']++;
            count[str2[i] - 'a']--;
        }
        if (str1.length != str2.length)
            return false;
        for (i = 0; i < NO_OF_CHAR; i++)
            if (count[i] != 0) {
                return false;
            }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string: ");
        char[] str1 = sc.next().toCharArray();
        System.out.println("Enter second string: ");
        char[] str2 = sc.next().toCharArray();

        if (Anagramstrings(str1, str2))
            System.out.println("Two strings are anagram of each other ");
        else
            System.out.println("Given strings are not anagram of each other ");
    }
}