package javaassign;
//Total Area = (Area of 1st rectangle + area of 2nd rectangle) - area of intersecting part
import java.awt.*;
import java.util.Scanner;

public class RectangleOverlap {
    static boolean isOverlapping(Point l1, Point r1, Point l2, Point r2){
        if (l1.x>r2.x || l2.x> r1.x)
            return false;
        if (l1.y< r2.y || l2.y< r1.y)
            return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Point l1 = new Point(), r1 = new Point(), l2 = new Point(), r2 = new Point();
        System.out.println("Enter left-top and bottom-right corner of first rectangle: ");
        l1.x = sc.nextInt();
        l1.y = sc.nextInt();

        r1.x = sc.nextInt();
        r1.y = sc.nextInt();

        System.out.println("Enter left-top and bottom-right corner of second rectangle: ");

        l2.x = sc.nextInt();
        l2.y = sc.nextInt();

        r1.x = sc.nextInt();
        r2.y = sc.nextInt();
        if(isOverlapping(l1,r1,l2,r2)){
            System.out.println("Rectangles are overlapping");
        }else{
            System.out.println("Rectangles are not overlapping");
        }

    }
}
