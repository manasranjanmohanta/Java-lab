//8. Write a program to find following data of student using mark of four subjects like
// C, C++, Java, and Python. Mark of 4 subjects will be accepted at the run time and
// credit of all the mentioned subject is 3?
//        a) Grade of 4 subjects?
//        b) Total Mark and %age of mark secured by Students?
//        c) SGPA of Student?

package assignment2;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mark1, mark2, mark3, mark4, choice;
        char grade1, grade2, grade3, grade4;
        System.out.println("Enter marks in C : ");
        mark1 = sc.nextInt();
        System.out.println("Enter marks in C++ : ");
        mark2 = sc.nextInt();
        System.out.println("Enter marks in JAVA : ");
        mark3 = sc.nextInt();
        System.out.println("Enter marks in Python: ");
        mark4 = sc.nextInt();

        System.out.println("1. Grade of 4 subjects.");
        System.out.println("2. Total Mark and %age of mark secures by students.");
        System.out.println("3. SGPA of student.");
        System.out.println("Enter your choice : ");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                if (mark1 >= 90 && mark1 <= 100) {
                    grade1 = 'S';
                } else if (mark1 >= 80 && mark1 <= 89) {
                    grade1 = 'O';
                } else if (mark1 >= 70 && mark1 <= 79) {
                    grade1 = 'A';
                } else if (mark1 >= 60 && mark1 <= 69) {
                    grade1 = 'B';
                } else if (mark1 >= 50 && mark1 <= 59) {
                    grade1 = 'C';
                } else if (mark1 >= 40 && mark1 <= 49) {
                    grade1 = 'D';
                } else if (mark1 >= 30 && mark1 <= 39) {
                    grade1 = 'E';
                } else {
                    grade1 = 'F';
                }
// For Mark2

                if (mark2 >= 90 && mark2 <= 100) {
                    grade2 = 'S';
                } else if (mark2 >= 80 && mark2 <= 89) {
                    grade2 = 'O';
                } else if (mark2 >= 70 && mark2 <= 79) {
                    grade2 = 'A';
                } else if (mark2 >= 60 && mark2 <= 69) {
                    grade2 = 'B';
                } else if (mark2 >= 50  && mark2 <= 59) {
                    grade2 = 'C';
                } else if (mark2 >= 40 && mark2 <= 49) {
                    grade2 = 'D';
                } else if (mark2 >= 30 && mark2 <= 39) {
                    grade2 = 'E';
                } else {
                    grade2 = 'F';
                }
// For Mark3
                if (mark3 >= 90 && mark3 <= 100) {
                    grade3 = 'S';
                } else if (mark3 >= 80 && mark3 <= 89) {
                    grade3 = 'O';
                } else if (mark3 >= 70 && mark3 <= 79) {
                    grade3 = 'A';
                } else if (mark3 >= 60 && mark3 <= 69) {
                    grade3 = 'B';
                } else if (mark3 >= 50 && mark3 <= 59) {
                    grade3 = 'C';
                } else if (mark3 >= 40 && mark3 <= 49) {
                    grade3 = 'D';
                } else if (mark3 >= 30 && mark3 <= 39) {
                    grade3 = 'E';
                } else {
                    grade3 = 'F';
                }
// For Grade 4
                if (mark4 >= 90 && mark4 <= 100) {
                    grade4 = 'S';
                } else if (mark4 >= 80 && mark4 <= 89) {
                    grade4 = 'O';
                } else if (mark4 >= 70 && mark4 <= 79) {
                    grade4 = 'A';
                } else if (mark4 >= 60 && mark4 <= 69) {
                    grade4 = 'B';
                } else if (mark4 >= 50 && mark4 <= 59) {
                    grade4 = 'C';
                } else if (mark4 >= 40 && mark4 <= 49) {
                    grade4 = 'D';
                } else if (mark4 >= 30 && mark4 <= 39) {
                    grade4 = 'E';
                } else {
                    grade4 = 'F';
                }

// Displaying grades of 4 subjects

                System.out.println("The grade in C : " + grade1);
                System.out.println("The grade in C++ : " + grade2);
                System.out.println("The grade in JAVA : " + grade3);
                System.out.println("The grade in Python : " + grade4);
                break;

//  Total Mark and %age of mark secured by Students?
            case 2:
                int totalMark = 400;
                float percentage = 0;
                int totalMarkObtain = mark1 + mark2 + mark3 + mark4;
                percentage = (float) totalMarkObtain / totalMark * 100;
                System.out.println("Total mark secured by Students is : " + totalMarkObtain);
                System.out.println("Percentage secured by Students is : " + percentage + "%");
                break;

//  SGPA of Student?
            case 3:
                float creditSub1, creditSub2, creditSub3, creditSub4;
                float totalCreXMark, SGPA;
                creditSub1 = 3 * mark1 / 10;
                creditSub2 = 3 * mark2 / 10;
                creditSub3 = 3 * mark3 / 10;
                creditSub4 = 3 * mark4 / 10;

                totalCreXMark = creditSub1 + creditSub2 + creditSub3+ creditSub4;
                SGPA = totalCreXMark / (3 + 3 + 3 + 3);
                System.out.printf("SGPA: %.2f", SGPA);
                break;
        }
    }
}
