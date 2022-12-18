package assignment3.class_and_object.Question2;

public class Prime {
    int n;
    Prime(int num){
        n = num;
    }
    public void isPrime(){
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if(n % i == 0){
                count ++;
            }
        }
        if(count == 2){
            System.out.println(n + " is prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
    }
}
