package be.vdab;

import java.util.Scanner;

public class StudentScores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        System.out.println("Enter " + numberOfStudents + " scores: ");
        int[] scores = new int[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            scores[i] = input.nextInt();
        }

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Student " + i + " score is " + scores[i]);
        }
    }
}
