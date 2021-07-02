package javaassign;

import java.util.Scanner;

public class Permutations {
    public static String swapString(String str1, int i, int j){
        char[] str2 = str1.toCharArray();
        char ch;
        ch = str2[i];
        str2[i] = str2[j];
        str2[j] = ch;
        return String.valueOf(str2);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        int len = str.length();
        System.out.println("Permutations of string are: ");
        generatePermutation(str,0,len);
    }
    public static void generatePermutation(String str,int start, int end)
    {
        if (start==end-1)
            System.out.println(str);
        else
        {
            for (int i = start;i<end;i++)
            {
                str = swapString(str,start,i);
                generatePermutation(str,start+1,end);
                str = swapString(str,start,i);
            }
        }
    }
}
