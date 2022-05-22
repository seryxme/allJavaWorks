package chapter7;

import java.util.Scanner;

public class StudentGradeReport {
    public static void main(String[] args) {
        Scanner dataReader = new Scanner(System.in);

        String schoolName = "Citadel Institute";
        String location = "Plot 7B, Gradient Crescent, Ikeja, Lagos";

        int numberOfStudents = 5;
        int numberOfSubjects = 4;

        StudentGrade citadel = new StudentGrade(numberOfStudents, numberOfSubjects);

        int counter = 0;

        while(counter < numberOfStudents) {
            System.out.printf("Enter the full name of Student %d: ", counter+1);
            String studentName = dataReader.nextLine();
            citadel.enterStudentName(counter, studentName);

//            System.out.println("Enter the number of subjects offered: ");
//            String numOfSubjects = dataReader.nextLine();

            ++counter;
        }

        counter = 0;

        while(counter < numberOfSubjects) {
            System.out.printf("Enter Subject %d title: ", counter+1);
            String subjectName = dataReader.nextLine();
            citadel.enterSubjectName(counter, subjectName);

            ++counter;
        }

        for (int student = 0;student < numberOfStudents; student++) {
            for (int subject = 0;subject < numberOfSubjects; subject++) {
                System.out.printf("What did %s score in %s? ", citadel.whoIsStudent(student), citadel.whatIsSubject(subject));
                int score = dataReader.nextInt();
                citadel.enterScore(student, subject, score);
            }
        }

        citadel.gradeReport();
    }
}
