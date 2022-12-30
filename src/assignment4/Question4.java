package assignment4;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Create an array to store the user-defined values
        int[] values = new int[20];

        // Prompt the user to enter the values for the array
        System.out.println("Enter 20 values for the array: ");
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        // Create a new array to store the unique values
        int[] uniqueValues = new int[values.length];

        // Initialize the uniqueValues array with the first element of the values array
        uniqueValues[0] = values[0];
        int uniqueValuesIndex = 1;

        // Find the repeated elements in the values array and remove them, updating the uniqueValues array with only unique values
        for (int i = 1; i < values.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < uniqueValuesIndex; j++) {
                if (values[i] == uniqueValues[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueValues[uniqueValuesIndex] = values[i];
                uniqueValuesIndex++;
            }
        }

        // Print the unique values
        System.out.println("Unique values: ");
        for (int i = 0; i < uniqueValuesIndex; i++) {
            System.out.print(uniqueValues[i] + " ");
        }
        System.out.println();

        // Find the repeated elements in the values array and print them along with their frequency
        System.out.println("Repeated elements and their frequency: ");
        for (int i = 0; i < uniqueValuesIndex; i++) {
            int count = 0;
            for (int j = 0; j < values.length; j++) {
                if (uniqueValues[i] == values[j]) {
                    count++;
                }
            }
            if (count > 1) {
                System.out.println(uniqueValues[i] + ": " + count);
            }
        }
    }
}
