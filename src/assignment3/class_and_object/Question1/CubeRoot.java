package assignment3.class_and_object.Question1;

public class CubeRoot {
    double crt;
    CubeRoot(double number){
        for (double i = 1; i <= number ; i++) {
            if(i * i * i <= number){
                crt = i;
            }
        }
    }
}
