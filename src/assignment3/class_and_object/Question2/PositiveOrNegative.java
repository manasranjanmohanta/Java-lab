package assignment3.class_and_object.Question2;

public class PositiveOrNegative {
    int n;
    PositiveOrNegative(int num){
        n = num;
    }
    public void isPositive(){
        if(n >= 0){
            System.out.println(n + " is a positive number");
        } else {
            System.out.println(n + " is negative number");
        }
    }
}
