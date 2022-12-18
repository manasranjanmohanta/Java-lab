package assignment3.class_and_object.Question1;

public class Factorial {
    int factorial;
    Factorial(int num1){
        for (int i = 1; i <= num1 ; i++) {
            factorial *= i;
        }
    }
}
