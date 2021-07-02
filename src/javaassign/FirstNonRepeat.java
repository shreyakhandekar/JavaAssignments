package javaassign;

import java.util.Scanner;

public class FirstNonRepeat {
    static final int NoOfChar = 256;
    static char count[] = new char[NoOfChar];

    static void getCharCount(String str)
    {
        for (int i=0;i<str.length();i++)
            count[str.charAt(i)]++;
    }

    static int firstNonRepeat(String str){
        getCharCount(str);
        int index = -1, i;
        for (i=0;i<str.length();i++){
            if (count[str.charAt(i)]==1){
                index = i;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        int index = firstNonRepeat(str);

        System.out.println(index == -1
                        ? "All characters repeating "
                        : "First non-repeating character is "
                        + str.charAt(index));
    }
}
