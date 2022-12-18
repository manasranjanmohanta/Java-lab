package assignment3.class_and_object.Question1;

public class LCM {
    int lcm = 0;
    LCM(int number1, int number2){
        int gcd = 0, smaller = 0;
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
        lcm = (number1 * number2) / gcd;
    }
}
