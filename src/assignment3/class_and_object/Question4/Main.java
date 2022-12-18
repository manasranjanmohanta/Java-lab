package assignment3.class_and_object.Question4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double side;
        System.out.println("Enter the side of the square : ");
        side = sc.nextDouble();

        Square rect = new Square(side);
        System.out.println("The area of the square is : " + rect.area);
        System.out.println("The perimeter of the square is : " + rect.perimeter);
    }
}
