package chapter5;

import java.util.Objects;
import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {

        Scanner dataReader = new Scanner(System.in);

        int counter = 5;
        int gradeNumber = 0;
        int studentNumber = 0;
        int aCounter = 0;
        int bCounter = 0;
        int cCounter = 0;
        int dCounter = 0;

        while (counter > 0) {
            System.out.println("Enter student's name: ");
            String studentName = dataReader.nextLine();
            System.out.println("Enter student's grade: ");
            String studentGrade = dataReader.nextLine();

            studentNumber++;

            if (Objects.equals(studentGrade, "A")) {
                gradeNumber = 5;
            } else if (Objects.equals(studentGrade, "B")) {
                gradeNumber = 4;                
            } else if (Objects.equals(studentGrade, "C")) {
                gradeNumber = 3;
            } else gradeNumber = 2;

            System.out.printf("Student%d scored grade %s.%n%n", studentNumber, studentGrade);

            counter--;

            switch (gradeNumber) {
                case 3:
                    cCounter++;
                    break;
                case 4:
                    bCounter++;
                    break;
                case 5:
                    aCounter++;
                    break;
                default:
                    dCounter++;
            }
        }
        System.out.printf("Number of A grades: %d%n" +
                "Number of B grades: %d%n" +
                "Number of C grades: %d%n" +
                "Number of D grades: %d%n", aCounter, bCounter, cCounter, dCounter);
    }
}
