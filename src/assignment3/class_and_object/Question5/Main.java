package assignment3.class_and_object.Question5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double side1, side2, side3;
        System.out.println("Enter the first side of the triangle : ");
        side1 = sc.nextDouble();
        System.out.println("Enter the second side of the triangle : ");
        side2 = sc.nextDouble();
        System.out.println("Enter the third side of the triangle : ");
        side3 = sc.nextDouble();

        Triangle tr = new Triangle(side1, side2, side3);
        System.out.println("The area of the square is : " + tr.area);
        System.out.println("The perimeter of the square is : " + tr.perimeter);
    }
}
