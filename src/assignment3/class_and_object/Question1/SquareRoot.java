package assignment3.class_and_object.Question1;

public class SquareRoot {
    double sqrt = 0;
    SquareRoot(double number){

//iterator variable
            int i = 1;
            while(true)
            {
//for perfect square numbers
                if(i*i == number) {
                    sqrt = i;
                    break;
                }
//for not perfect square numbers
                else if(i*i > number) {
//returns the value calculated by the method decimalSqrt()
                    sqrt = decimalSqrt(number, i - 1, i);
                    break;
                }
//increments the variable i by 1
                i++;
            }
        }
// recursive method to find the square root of a number up to 7 decimal places
        private double decimalSqrt(double number, double i, double j)
        {
//calculates the middle of i and j
            double midvalue = (i+j)/2;
//finds the square of the midvalue
            double square = midvalue * midvalue;
//compares the midvalue with square up to n decimal places
            if(square==number||Math.abs(square-number)<0.0000001)
                return midvalue;
//if the square root belongs to second half
            else if(square>number)
                return decimalSqrt(number, i, midvalue);
//if the square root belongs to first half
            else
                return decimalSqrt(number, midvalue, j);
        }
    }
