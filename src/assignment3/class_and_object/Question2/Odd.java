package assignment3.class_and_object.Question2;

public class Odd {
    int n;
    Odd(int num){
       n = num;
    }
    public void isOdd(){
        if(n % 2 != 0){
            System.out.println(n + " is odd");
        } else {
            System.out.println(n + " is not odd");
        }
    }
}
