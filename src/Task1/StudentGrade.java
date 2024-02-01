package Task1;

import java.util.Scanner;

public class StudentGrade {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");

        int no_Student = input.nextInt();
        int[] grade = new int[no_Student];

        int sum = 0;
        int lowest = Integer.MAX_VALUE;
        int highest = Integer.MIN_VALUE;

        for (int x=0; x < no_Student; x++) {

            System.out.print("Enter the grade for student: ");
            grade[x] = input.nextInt();

            sum = sum + grade[x];

            if (grade[x] > highest) {

                highest = grade[x];
            }

            else {

                lowest = grade[x];
            }
        }

        double average = (double) sum/no_Student;

        System.out.println("The Avarage grade is: " +average);
        System.out.println("The Highest grade is: " +highest);
        System.out.println("The Lowest grade is: " +lowest);


    }

}
