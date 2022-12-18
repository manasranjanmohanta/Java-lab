package assignment3.class_and_object.Question1;

public class Modulus {
    int modulus = 0;
    Modulus(int number1){
        if(modulus < 0){
            modulus *= -1;
        }
        else {
            modulus = number1;
        }
    }
}
