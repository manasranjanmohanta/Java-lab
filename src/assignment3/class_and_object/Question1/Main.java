package assignment3.class_and_object.Question1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        double x;

        int ch;
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        System.out.println("6. Factorial");
        System.out.println("7. GCD");
        System.out.println("8. LCM");
        System.out.println("9. Power");
        System.out.println("10. Square root");
        System.out.println("11. Cube root");

        System.out.println("Enter your choice : ");
        ch = sc.nextInt();

        switch(ch){
            case 1 :
                System.out.println("Enter the first number : ");
                num1 = sc.nextInt();
                System.out.println("Enter the second number : ");
                num2 = sc.nextInt();

                Addition add = new Addition(num1, num2);
                System.out.println("The Addition of two numbers using class and object is : " + add.addition);
                break;
            case 2:
                System.out.println("Enter the first number : ");
                num1 = sc.nextInt();
                System.out.println("Enter the second number : ");
                num2 = sc.nextInt();

                Subtraction sub = new Subtraction(num1, num2);
                System.out.println("The Subtraction of two numbers using class and object is : " + sub.subtraction);
                break;
            case 3:
                System.out.println("Enter the first number : ");
                num1 = sc.nextInt();
                System.out.println("Enter the second number : ");
                num2 = sc.nextInt();

                Multiplication multi = new Multiplication(num1, num2);
                System.out.println("The Multiplication of two numbers using class and object is : " + multi.multiplication);
                break;
            case 4 :
                System.out.println("Enter the first number : ");
                num1 = sc.nextInt();
                System.out.println("Enter the second number : ");
                num2 = sc.nextInt();

                Division div = new Division(num1, num2);
                System.out.println("The Division of two numbers using class and object is : " + div.division);
                break;
            case 5 :
                System.out.println("Enter a number : ");
                num1 = sc.nextInt();

                Modulus mod = new Modulus(num1);
                System.out.println("The Modulus of " + num1 + "using class and object is : " + mod.modulus);
                break;
            case 6:
                System.out.println("Enter the first number : ");
                num1 = sc.nextInt();

                Factorial fact = new Factorial(num1);
                System.out.println("The Factorial of " + num1 + "using class and object is : " + fact.factorial);
                break;
            case 7 :
                System.out.println("Enter the first number : ");
                num1 = sc.nextInt();
                System.out.println("Enter the second number : ");
                num2 = sc.nextInt();

                GCD gcd = new GCD(num1, num2);
                System.out.println("The GCD of two numbers using class and object is : " + gcd.gcd);
                break;
            case 8 :
                System.out.println("Enter the first number : ");
                num1 = sc.nextInt();
                System.out.println("Enter the second number : ");
                num2 = sc.nextInt();

                LCM lcm = new LCM(num1, num2);
                System.out.println("The LCM of two numbers using class and object is : " + lcm.lcm);
                break;
            case 9 :
                System.out.println("Enter a number : ");
                num1 = sc.nextInt();

                Power pow = new Power(num1);
                System.out.println("The Power of " + num1 + "using class and object is : " + pow.power);
                break;
            case 10 :
                System.out.println("Enter a number : ");
                x = sc.nextDouble();

                SquareRoot sr = new SquareRoot(x);
                System.out.println("The Square root of " + (int)x + " using class and object is : " + sr.sqrt);
                break;
            case 11 :
                System.out.println("Enter a number : ");
                x = sc.nextDouble();

                CubeRoot cr = new CubeRoot(x);
                System.out.println("The Square root of " + x + " using class and object is : " + cr.crt);
                break;

        }
    }
}
