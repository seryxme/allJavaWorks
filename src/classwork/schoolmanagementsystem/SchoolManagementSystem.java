package classwork.schoolmanagementsystem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SchoolManagementSystem {
    private static School newSchool = new School("Semicolon Institute", "Yaba");

    private static int userOption;
    private static int studentId;
    private static int courseId;

    private static final Scanner entry = new Scanner(System.in);
    public static void main(String[] args) {

        appMenu();
    }
    private static void appMenu() throws InputMismatchException {
        try {
            System.out.println("""
                    -----------------------------------
                    Semicolon School Management System
                    -----------------------------------
                    Choose your login access.
                                    
                    1. Admin
                    2. Student
                    0. Exit app
                    """);
            userOption = entry.nextInt();
            entry.nextLine();

            if (userOption == 1) adminApp();
            else if (userOption == 2) studentApp();
            else if (userOption == 0) {
                System.out.println("Thank you for using Semicolon School Management System.\nGoodbye!");
                System.exit(0);
            }
            else {
                System.out.println("Invalid input. Try again.");
                appMenu();
            }
        } catch (InputMismatchException ex) {
            entry.nextLine();
            System.out.println("Please use only appropriate input.");
            appMenu();
        }
    }

    private static void adminApp() throws InputMismatchException {
        try {
            System.out.println("""
                    -----------------------------------
                    Semicolon School Management System
                    -----------------------------------
                    Welcome admin,
                                    
                    What would you like to do?
                                    
                    1. Admit Student
                    2. Get Student Information
                    3. Add Course
                    4. Get Course Information
                    5. Expel Student
                    6. Delete Course
                    7. Check All Courses
                    8. Show All Admitted Students
                    0. Exit
                    """);
            userOption = entry.nextInt();
            entry.nextLine();

            switch (userOption) {
                case 1 -> studentAdmission();
                case 2 -> studentDetails();
                case 3 -> courseCreation();
                case 4 -> courseDetails();
                case 5 -> expelStudent();
                case 6 -> deleteCourse();
                case 7 -> courseDetails();
                case 8 -> studentDetails();
                case 0 -> appMenu();
                default -> {
                    System.out.println("Invalid input. Try again.");
                    adminApp();
                }
            }
        } catch (InputMismatchException ex) {
            entry.nextLine();
            System.out.println("Please use only appropriate input.");
            adminApp();
        }
    }

    private static void studentApp() throws InputMismatchException {
        try {
            System.out.println("""
                                    
                    Welcome to Semicolon.
                                    
                    What would you like to do?
                                    
                    1. Select Course
                    2. Check All Courses
                    3. Check My Courses
                    4. Drop Course
                    5. Check My Info
                    6. Request Withdrawal
                    0. Exit
                    """);
            userOption = entry.nextInt();
            entry.nextLine();

            switch (userOption) {
                case 1 -> courseSelection();
                case 2 -> viewAllCourses();
                case 3 -> studentCourseList();
                case 4 -> dropCourse();
                case 5 -> personalDetails();
                case 6 -> studentWithdrawal();
                case 0 -> appMenu();
                default -> {
                    entry.nextLine();
                    System.out.println("Invalid input. Try again.");
                    studentApp();
                }
            }
        } catch (InputMismatchException ex) {
            System.out.println("Please use only appropriate input.");
            studentApp();
        }
    }

    private static void studentAdmission() {
        try {
            System.out.println("Enter student's full name: ");
            String studentName = entry.nextLine();

            Student newStudent = new Student(studentName, studentId + 1);

            newSchool.admitStudent(newStudent);
            studentId++;

            System.out.printf("%s has been successfully admitted into Semicolon.", studentName);

            System.out.println("Would you like to admit another student?\n1. Yes\n2. No");
            userOption = entry.nextInt();
            entry.nextLine();

            if (userOption == 1) studentAdmission();
            else adminApp();
        } catch (InputMismatchException ex) {
            entry.nextLine();
            System.out.println("Please use only appropriate input. Start again.");
            studentAdmission();
        }
    }

    private static void courseCreation() {
        try {
            System.out.println("Enter the course title: ");
            String courseName = entry.nextLine();

            System.out.println("Enter the course code: ");
            String courseCode = entry.nextLine();

            System.out.println("Enter the course units: ");
            int courseUnit = entry.nextInt();

            Course newCourse = new Course(courseId + 1, courseName, courseCode, courseUnit);

            newSchool.createCourse(newCourse);
            courseId++;

            System.out.println("\nWould you like to add another course?\n1. Yes\n2. No");
            userOption = entry.nextInt();
            entry.nextLine();

            if (userOption == 1) courseCreation();
            else adminApp();
        } catch (InputMismatchException ex) {
            entry.nextLine();
            System.out.println("Please use only appropriate input. Start again.");
            courseCreation();
        }
    }

    private static void courseDetails() {
        try {
            if (newSchool.totalCourses() == 0) System.out.println("No courses offered yet.");
            else {
                System.out.println("1. View a course's details\n2. View all courses");
                userOption = entry.nextInt();

                if (userOption == 1) {
                    System.out.println("Enter course ID: ");
                    int courseNum = entry.nextInt();

                    System.out.println(newSchool.getCourse(courseNum - 1));
                } else if (userOption == 2) {
                    viewAllCourses();
                } else {
                    System.out.println("Invalid input.");
                    courseDetails();
                }
            }

            System.out.println("Would you like to check course details again?\n1. Yes\n2. No");
            userOption = entry.nextInt();

            if (userOption == 1) courseDetails();
            else adminApp();
        } catch (InputMismatchException | ArrayIndexOutOfBoundsException ex) {
            System.out.println("Please use only appropriate input. Start again.");
            courseDetails();
        }
    }


    private static void courseSelection() {
        try {
            System.out.println("Enter your Student ID: ");
            int idNum = entry.nextInt();

            System.out.println("Enter the Course ID: ");
            int courseNum = entry.nextInt();

            newSchool.getStudent(idNum - 1).addCourse(newSchool.getCourse(courseNum - 1));

            System.out.printf("You are now offering %s.", newSchool.getCourse(courseNum - 1));

            System.out.println("Would you like to add another course?\n1. Yes\n2. No");
            userOption = entry.nextInt();

            if (userOption == 1) courseSelection();
            else studentApp();
        } catch (InputMismatchException | ArrayIndexOutOfBoundsException ex) {
            entry.nextLine();
            System.out.println("Please use only appropriate input. Start again.");
            courseSelection();
        }
    }

    private static void studentDetails() {
        try {
            if (newSchool.totalStudents() == 0) System.out.println("No students have been admitted yet.");
            else {
                System.out.println("1. View a student's details\n2. View all students");
                userOption = entry.nextInt();

                if (userOption == 1) {
                    System.out.println("Enter student ID: ");
                    int studentNum = entry.nextInt();

                    System.out.println(newSchool.getStudent(studentNum - 1));
                    newSchool.getStudent(studentNum - 1).getAllCourses();
                } else if (userOption == 2) {
                    System.out.printf("There are %d students registered currently.%n%n", newSchool.totalStudents());
                    newSchool.getAllStudents();
                } else {
                    System.out.println("Invalid input.");
                    studentDetails();
                }
            }

            System.out.println("Would you like to check student details again?\n1. Yes\n2. No");
            userOption = entry.nextInt();

            if (userOption == 1) studentDetails();
            else adminApp();
        } catch (InputMismatchException | ArrayIndexOutOfBoundsException ex) {
            entry.nextLine();
            System.out.println("Please use only appropriate input. Start again.");
            studentDetails();
        }
    }

    private static void personalDetails() {
        try {
            System.out.println("Enter your Student ID: ");
            int studentNum = entry.nextInt();

            System.out.println(newSchool.getStudent(studentNum - 1));
            newSchool.getStudent(studentNum - 1).getAllCourses();

            System.out.println("\n1. Back to Student Menu\n2. Log Out");
            userOption = entry.nextInt();

            if (userOption == 1) studentApp();
            else appMenu();
        } catch (InputMismatchException | ArrayIndexOutOfBoundsException ex) {
            System.out.println("Please use only appropriate input. Start again.");
            personalDetails();
        }
    }

    private static void studentCourseList() {
        try {
            System.out.println("Enter your Student ID: ");
            int studentNum = entry.nextInt();

            newSchool.getStudent(studentNum - 1).getAllCourses();

            System.out.println("\n1. Back to Student Menu\n2. Log Out");
            userOption = entry.nextInt();

            if (userOption == 1) studentApp();
            else appMenu();
        } catch (InputMismatchException | ArrayIndexOutOfBoundsException ex) {
            System.out.println("Please use only appropriate input. Start again.");
            studentDetails();
        }
    }


    private static void viewAllCourses() {
        try {
            if (newSchool.totalCourses() == 0) System.out.println("No courses offered yet.");
            else {
                System.out.println("""
                        ---------------------------------
                        All Courses Offered in Semicolon
                        ---------------------------------
                        """);

                newSchool.getAllCourses();
            }

            System.out.println("\n1. Back to Admin Menu\n2. Log Out");
            userOption = entry.nextInt();

            if (userOption == 1) adminApp();
            else appMenu();
        } catch (InputMismatchException ex) {
            System.out.println("Please use only appropriate input.");
            adminApp();
        }
    }

    private static void deleteCourse() {
        try {
            System.out.println("Enter course ID: ");
            int courseNum = entry.nextInt();
            String courseName = newSchool.getCourse(courseNum - 1).getCourseTitle();

            newSchool.deleteCourse(courseNum - 1);

            System.out.printf("%s is no longer offered in Semicolon.%n", courseName);

            System.out.println("Would you like to delete another course?\n1. Yes\n2. No");
            userOption = entry.nextInt();

            if (userOption == 1) deleteCourse();
            else adminApp();
        } catch (InputMismatchException | ArrayIndexOutOfBoundsException ex) {
            System.out.println("Please use only appropriate input. Start again.");
            deleteCourse();
        }
    }

    private static void dropCourse() {
        try {
            System.out.println("Enter your Student ID: ");
            int studentNum = entry.nextInt();

            System.out.println("Enter course ID: ");
            int courseNum = entry.nextInt();

            String courseName = newSchool.getCourse(courseNum - 1).getCourseTitle();

            newSchool.getStudent(studentNum - 1).deleteCourse(newSchool.getCourse(courseNum - 1));

            System.out.printf("%s has been successfully dropped.%n", courseName);

            System.out.println("Would you like to drop another course?\n1. Yes\n2. No");
            userOption = entry.nextInt();

            if (userOption == 1) dropCourse();
            else studentApp();
        } catch (InputMismatchException | ArrayIndexOutOfBoundsException ex) {
            System.out.println("Please use only appropriate input. Start again.");
            dropCourse();
        }
    }

    private static void expelStudent() {
        try {
            System.out.println("Enter student ID: ");
            int studentNum = entry.nextInt();
            String studentName = newSchool.getStudent(studentNum - 1).getStudentName();

            newSchool.deleteStudent(studentNum - 1);

            System.out.printf("%s has been successfully expelled.%n", studentName);

            System.out.println("Would you like to expel another student?\n1. Yes\n2. No");
            userOption = entry.nextInt();

            if (userOption == 1) expelStudent();
            else adminApp();
        } catch (InputMismatchException | ArrayIndexOutOfBoundsException ex) {
            System.out.println("Please use only appropriate input. Start again.");
            expelStudent();
        }
    }

    private static void studentWithdrawal() {
        try {
            System.out.println("Enter your Student ID: ");
            int studentNum = entry.nextInt();

            newSchool.getStudent(studentNum - 1).withdraw(newSchool);

            System.out.println("You have successfully left Semicolon. We are sad to see you go.");

            appMenu();
        } catch (InputMismatchException | ArrayIndexOutOfBoundsException ex) {
            System.out.println("Please use only appropriate input. Start again.");
            studentWithdrawal();
        }
    }

}

