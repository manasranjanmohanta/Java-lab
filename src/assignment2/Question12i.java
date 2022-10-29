//12. Write a java program to find following of 10 numbers using command line arguments?
// Do not use array a) find difference between greatest and smallest number?
package assignment2;

public class Question12i {
    public static void main(String[] args) {
      int greatest = Integer.parseInt(args[0]), smallest = Integer.parseInt(args[0]), diff;

// Finding the greatest number
        for(int i = 0; i < 10; i++){
          if(greatest < Integer.parseInt(args[i])){
              greatest = Integer.parseInt(args[i]);
          }
        }

// Finding the smallest number
        for (int i = 0; i < 10; i++) {
            if(smallest > Integer.parseInt(args[i])){
                smallest = Integer.parseInt(args[i]);
            }
        }

        diff = greatest - smallest;
        System.out.println("The greatest number is : " + greatest);
        System.out.println("The smallest number is : " + smallest);
        System.out.println("The difference between greatest and smallest number is : " + diff);
    }
}
