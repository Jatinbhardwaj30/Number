package Intenshipproject;

import java.util.Scanner;
// Student Grade Calculator..
public class task4 {
    public static void main(String[] args) {
        // Scanner class.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        // no. of subjects
        int numofSubjects = scanner.nextInt();
        double total_Marks = 0;

        for (int i = 1; i <= numofSubjects; i++) {
            System.out.print("Enter marks obtained in each subject " + i + " (out of 100): ");
            double marks = scanner.nextDouble();
            total_Marks += marks;
        }
// total percentage of a student
        double average_Percentage = (total_Marks / (numofSubjects * 100)) * 100;

        System.out.println("Total Marks: " + total_Marks);
        System.out.println("Average Percentage: " + average_Percentage);

        char grade;
// grade of a student..
        if (average_Percentage >= 90) {
            grade = 'A';
        } else if (average_Percentage >= 80) {
            grade = 'B';
        } else if (average_Percentage >= 70) {
            grade = 'C';
        } else if (average_Percentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
//print the final grade of a Student.
        System.out.println("Grade: " + grade);

    }
}
