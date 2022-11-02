//j) find the sum of product of corresponding digits of 2nd largest even number and 3rd smallest odd number?

package assignment2;

public class Question11j {
    public static void main(String[] args) {
        int countEven = 0, countOdd = 0, secondLargest = 0, thirdSmallest = 0;

        //for finding the even number
        for (int i = 248; i > 23; i--) {
            if(i % 2 == 0){
                countEven++;
                if(countEven == 2){
                    secondLargest = i;
                    break;
                }
            }
        }

        // for finding the odd number
        for (int i = 24; i < 249; i++) {
            if(i % 2 != 0){
                countOdd++;
                if(countOdd == 3){
                    thirdSmallest = i;
                    break;
                }
            }
        }

        int temp1 = secondLargest, temp2 = thirdSmallest;
        int rem1, rem2, sum = 0;
        while(temp1 != 0 && temp2 != 0){
            rem1 = temp1 % 10;
            rem2 = temp2 % 10;
            sum += rem1 * rem2;
            temp1 = temp1 / 10;
            temp2 = temp2 / 10;
        }

        System.out.println("The 2nd largest even number : " + secondLargest);
        System.out.println("The 3rd smallest odd number : " + thirdSmallest);
        System.out.println("sum of product of corresponding digits of 2nd largest even number and 3rd smallest odd number : " + sum);
    }
}
