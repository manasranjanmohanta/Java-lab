package assignment3.class_and_object.Question1;

public class GCD {
    int gcd = 0;
    GCD(int number1, int number2){
        int smaller = 0;
        if(number1 < number2){
            smaller = number1;
        } else {
            smaller = number2;
        }
        for (int i = smaller; i > 0 ; i--) {
            if(number1 % i == 0 && number2 % i == 0){
                gcd = i;
                break;
            }
        }
    }
}
