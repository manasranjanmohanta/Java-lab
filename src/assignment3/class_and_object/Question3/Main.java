package assignment3.class_and_object.Question3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length, width;
        System.out.println("Enter the length of the rectangle : ");
        length = sc.nextInt();
        System.out.println("Enter the width of the rectangle : ");
        width = sc.nextInt();

        Rectangle rect = new Rectangle(length, width);
        System.out.println("The area of the rectangle is : " + rect.area);
        System.out.println("The perimeter of the rectangle is : " + rect.perimeter);
    }
}
