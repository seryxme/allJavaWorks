package classwork.schoolmanagementsystem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SchoolManagementSystem {
    private static final School newSchool = new School("Semicolon Institute", "Yaba");
    private static DummyData dummyData = new DummyData();

    private static int userOption;
    private static int studentNum;
    private static int courseNum;
    private static final Scanner entry = new Scanner(System.in);
    public static void main(String[] args) {
        //Adding dummy data to school data. Remove cod segment to add manually
        dummyData.addDummies();
        newSchool.updateCourseList(dummyData.getDummyCourses());
        newSchool.updateStudentList(dummyData.getDummyStudents());
        for (int i = 0; i < newSchool.totalStudents(); i++) {
            newSchool.getStudent(i).updateCourseList(dummyData.allStudentCourses.get(i));
        }
        appMenu();
    }
    private static void appMenu() throws InputMismatchException {
        try {
            if (newSchool.totalStudents() == 0) {
                System.out.println("""
                    -----------------------------------
                    Semicolon School Management System
                    -----------------------------------
                    Choose your login access.
                                    
                    1. Admin
                    0. Exit app
                    """);
                userOption = entry.nextInt();
                entry.nextLine();
                if (userOption == 1) adminApp();
                else if (userOption == 0) {
                    System.out.println("Thank you for using Semicolon School Management System.\nGoodbye!");
                    System.exit(0);
                }
                else {
                    System.out.println("Invalid input. Try again.");
                    appMenu();
                }
            } else {
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
                else if (userOption == 2) {
                    System.out.println("Enter your Student ID: ");
                    int studentOption = entry.nextInt();
                    entry.nextLine();

                    studentApp(studentOption);
                } else if (userOption == 0) {
                    System.out.println("Thank you for using Semicolon School Management System.\nGoodbye!");
                    System.exit(0);
                } else {
                    System.out.println("Invalid input. Try again.");
                    appMenu();
                }
            }
        } catch (InputMismatchException | IllegalArgumentException ex) {
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
                                    
                    1. Admit New Student
                    2. Get Student Information
                    3. Add New Course
                    4. Get Course Information
                    5. Show All Admitted Students
                    6. Check All Courses
                    7. Expel Student
                    8. Delete Course
                    9. Edit Course
                    0. Exit
                    """);
            userOption = entry.nextInt();
            entry.nextLine();

            switch (userOption) {
                case 1 -> studentAdmission();
                case 2 -> studentDetails(1);
                case 3 -> courseCreation();
                case 4 -> courseDetails(1);
                case 5 -> studentDetails(2);
                case 7 -> expelStudent();
                case 6 -> courseDetails(2);
                case 8 -> deleteCourse();
                case 9 -> editCourse();
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

    private static void studentApp(int studentId) throws IllegalArgumentException {
        try {
            System.out.printf("""
                                    
                    Welcome, %s!
                    
                    This is your Semicolon Student Manager.
                    What would you like to do?
                                    
                    1. Select Course
                    2. Check All Courses
                    3. Check My Courses
                    4. Drop Course
                    5. Check My Info
                    6. Request Withdrawal
                    0. Exit
                    
                    """, newSchool.getStudent(studentId - 1).getStudentName());
            userOption = entry.nextInt();
            entry.nextLine();

            switch (userOption) {
                case 1 -> courseSelection(studentId);
                case 2 -> studentViewAllCourses(studentId);
                case 3 -> studentCourseList(studentId);
                case 4 -> dropCourse(studentId);
                case 5 -> personalDetails(studentId);
                case 6 -> studentWithdrawal(studentId);
                case 0 -> appMenu();
                default -> {
                    entry.nextLine();
                    System.out.println("Invalid input. Try again.");
                    studentApp(studentId);
                }
            }
        } catch (InputMismatchException | IllegalArgumentException ex) {
            System.out.println("Please use only appropriate input.");
            studentApp(studentId);
        }
    }

    private static void studentAdmission() {
        try {
            studentNum = newSchool.totalStudents();

            System.out.println("Enter student's full name: ");
            String studentName = entry.nextLine();

            System.out.println("Enter student's age: ");
            int studentAge = entry.nextInt();
            entry.nextLine();

            System.out.println("Enter student's gender: ");
            String studentGender = entry.nextLine();

            Student newStudent = new Student(studentName, studentNum + 1, studentAge, studentGender);

            newSchool.admitStudent(newStudent);
            studentNum++;

            System.out.printf("%s has been successfully admitted into Semicolon.%n%n", studentName);

            System.out.println("Would you like to admit another student?\n1. Yes\n2. No");
            userOption = entry.nextInt();
            entry.nextLine();

            if (userOption == 1) studentAdmission();
            else adminApp();
        } catch (InputMismatchException ex) {
            entry.nextLine();
            System.out.println("Please use only appropriate input.");
            studentAdmission();
        }
    }

    private static void courseCreation() {
        try {
            courseNum = newSchool.totalCourses();

            System.out.println("Enter the course title: ");
            String courseName = entry.nextLine();

            System.out.println("Enter the course code: ");
            String courseCode = entry.nextLine();

            System.out.println("Enter the course units: ");
            int courseUnit = entry.nextInt();

            Course newCourse = new Course(courseNum + 1, courseName, courseCode, courseUnit);

            newSchool.createCourse(newCourse);
            courseNum++;

            System.out.printf("%s has been successfully added to Semicolon curriculum.%n%n", courseName);

            System.out.println("Would you like to add another course?\n1. Yes\n2. No");
            userOption = entry.nextInt();
            entry.nextLine();

            if (userOption == 1) courseCreation();
            else adminApp();
        } catch (InputMismatchException | IndexOutOfBoundsException ex) {
            entry.nextLine();
            System.out.println("Please use only appropriate input. Start again.");
            courseCreation();
        }
    }

    private static void studentDetails(int userOption) {
        try {
            if (newSchool.totalStudents() == 0) {
                System.out.println("No students have been admitted yet.");

                System.out.println("Would you like to add a new student?\n1. Yes\n2. No");
                int response = entry.nextInt();

                if (response == 1) studentAdmission();
                else adminApp();
            }
            else {
                if (userOption == 1) {
                    System.out.println("Enter student ID: ");
                    int studentNum = entry.nextInt();

                    System.out.println(newSchool.getStudent(studentNum - 1));
                    newSchool.getStudent(studentNum - 1).getAllCourses();

                    System.out.println("Would you like to check another student's details?\n1. Yes\n2. No");
                    int response = entry.nextInt();

                    if (response == 1) studentDetails(1);
                    else adminApp();
                } else if (userOption == 2) {
                    System.out.printf("There are %d students registered currently.%n%n", newSchool.totalStudents());
                    newSchool.getAllStudents();

                    System.out.println("0. Back");
                    int response = entry.nextInt();
                    adminApp();
                } else {
                    System.out.println("Invalid input.");
                    studentDetails(userOption);
                }
            }

        } catch (InputMismatchException | IndexOutOfBoundsException ex) {
            entry.nextLine();
            System.out.println("Please use only appropriate input. Start again.");
            studentDetails(userOption);
        }
    }

    private static void personalDetails(int studentId) {
        try {
            System.out.println("""
                    ----------------
                    Student Profile
                    ----------------
                    """);
            System.out.println(newSchool.getStudent(studentId - 1));
            newSchool.getStudent(studentId - 1).getAllCourses();

            System.out.println("\n1. Back to Student Menu\n2. Log Out");
            userOption = entry.nextInt();

            if (userOption == 1) studentApp(studentId);
            else appMenu();
        } catch (InputMismatchException | IndexOutOfBoundsException ex) {
            entry.nextLine();
            System.out.println("Please use only appropriate input. Start again.");
            personalDetails(studentId);
        }
    }

    private static void courseDetails(int userOption) {
        try {
            if (newSchool.totalCourses() == 0) {
                System.out.println("No courses offered yet.");

                System.out.println("Would you like to add a new course?\n1. Yes\n2. No");
                int response = entry.nextInt();

                if (response == 1) courseCreation();
                else adminApp();
            }
            else {
                if (userOption == 1) {
                    System.out.println("Enter course ID: ");
                    int courseNum = entry.nextInt();

                    System.out.println(newSchool.getCourse(courseNum - 1));
                    if (newSchool.getCourse(courseNum - 1).totalStudentsOfferingCourse() != 0) {
                        System.out.println("Students offering this course:");
                        for (int i = 0; i < newSchool.getCourse(courseNum - 1).totalStudentsOfferingCourse(); i++) {
                            System.out.print((i + 1) + ".\t");
                            System.out.print(newSchool.getCourse(courseNum - 1).getStudent(i).getStudentName());
                            System.out.printf("\tID: %03d%n", newSchool.getCourse(courseNum - 1).getStudent(i).getStudentId());
                        }
                    }

                    System.out.println("Would you like to check another course's details?\n1. Yes\n2. No");
                    userOption = entry.nextInt();

                    if (userOption == 1) courseDetails(1);
                    else adminApp();
                } else if (userOption == 2) {
                    viewAllCourses();

                    System.out.println("0. Back");
                    userOption = entry.nextInt();
                    adminApp();
                } else {
                    System.out.println("Invalid input.");
                    courseDetails(userOption);
                }

            }
        } catch (InputMismatchException | IndexOutOfBoundsException ex) {
            entry.nextLine();
            System.out.println("Please use only appropriate input. Start again.");
            courseDetails(1);
        }
    }

    private static void editCourse() {
        try {
            if (newSchool.totalCourses() == 0) {
                System.out.println("No courses offered yet.");

                System.out.println("Would you like to add a new course?\n1. Yes\n2. No");
                int response = entry.nextInt();

                if (response == 1) courseCreation();
                else adminApp();
            }
            else {
                System.out.println("Enter course ID: ");
                int courseNum = entry.nextInt();

                System.out.println("""
                        
                        1. Activate Course
                        2. Deactivate Course
                        3. Set Course Type
                        4. Edit Course Name
                        5. Edit Course Units
                        0. Back
                        """);
                userOption = entry.nextInt();

                switch (userOption) {
                    case 1 -> newSchool.activateCourse(newSchool.getCourse(courseNum - 1));
                    case 2 -> newSchool.deactivateCourse(newSchool.getCourse(courseNum - 1));
                    case 3 -> newSchool.changeCourseType(newSchool.getCourse(courseNum - 1));
                    case 4 -> {
                        System.out.println("Enter new course name: ");
                        String courseName = entry.nextLine();
                        newSchool.getCourse(courseNum - 1).setCourseTitle(courseName);
                    }
                    case 5 -> {
                        System.out.println("Enter new course units: ");
                        int courseUnit = entry.nextInt();
                        newSchool.getCourse(courseNum - 1).setCourseUnit(courseUnit);
                    }
                    case 0 -> adminApp();
                }

                System.out.println("Would you like to edit another course?\n1. Yes\n2. No");
                userOption = entry.nextInt();

                if (userOption == 1) editCourse();
                else adminApp();
            }
        } catch (InputMismatchException | IndexOutOfBoundsException ex) {
            entry.nextLine();
            System.out.println("Please use only appropriate input. Start again.");
            editCourse();
        }

    }

    private static void courseSelection(int studentId) {
        if (newSchool.totalCourses() == 0) {
            System.out.println("No courses available yet.");
        } else {
            try {
                System.out.println("Enter the Course ID: ");
                int courseNum = entry.nextInt();

                if (newSchool.getStudent(studentId - 1).checkCourseAlreadyOffered(newSchool.getCourse(courseNum - 1))) {
                    System.out.println("You have already selected this course.");
                    System.out.println("Would you like to add another course?\n1. Yes\n2. No");
                    userOption = entry.nextInt();

                    if (userOption == 1) courseSelection(studentId);
                    else studentApp(studentId);
                }
                else {
                    newSchool.getStudent(studentId - 1).addCourse(newSchool.getCourse(courseNum - 1));

                    System.out.printf("You are now offering %s.%n%n", newSchool.getCourse(courseNum - 1).getCourseTitle());

                    System.out.println("Would you like to add another course?\n1. Yes\n2. No");
                    userOption = entry.nextInt();

                    if (userOption == 1) courseSelection(studentId);
                    else studentApp(studentId);
                }
            } catch (InputMismatchException ex) {
                entry.nextLine();
                System.out.println("Please use only appropriate input. Start again.");
                courseSelection(studentId);
            }
            catch (IndexOutOfBoundsException e) {
                entry.nextLine();
                System.out.println("Please select the appropriate Course ID.");
                courseSelection(studentId);
            }
        }
        studentApp(studentId);
    }

    private static void studentCourseList(int studentId) {
        try {
            newSchool.getStudent(studentId - 1).getAllCourses();

            System.out.println("\n1. Back to Student Menu\n2. Log Out");
            userOption = entry.nextInt();

            if (userOption == 1) studentApp(studentId);
            else appMenu();
        } catch (InputMismatchException | IndexOutOfBoundsException ex) {
            entry.nextLine();
            System.out.println("Please use only appropriate input. Start again.");
            studentCourseList(studentId);
        }
    }

    private static void studentViewAllCourses(int studentId) {
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

            if (userOption == 1) studentApp(studentId);
            else appMenu();
        } catch (InputMismatchException ex) {
            entry.nextLine();
            System.out.println("Please use only appropriate input.");
            studentApp(studentId);
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
            entry.nextLine();
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
        } catch (InputMismatchException | IndexOutOfBoundsException ex) {
            entry.nextLine();
            System.out.println("Please use only appropriate input. Start again.");
            deleteCourse();
        }
    }

    private static void dropCourse(int studentId) {
        try {
            System.out.println("Enter course ID: ");
            int courseNum = entry.nextInt();

            if (!newSchool.getStudent(studentId - 1).deleteCourse(newSchool.getCourse(courseNum - 1))) {

                System.out.println("Would you like to drop another course?\n1. Yes\n2. No");
                userOption = entry.nextInt();

                if (userOption == 1) dropCourse(studentId);
                else studentApp(studentId);
            }
            else {
                String courseName = newSchool.getCourse(courseNum - 1).getCourseTitle();

                System.out.printf("%s has been successfully dropped.%n", courseName);

                System.out.println("Would you like to drop another course?\n1. Yes\n2. No");
                userOption = entry.nextInt();

                if (userOption == 1) dropCourse(studentId);
                else studentApp(studentId);
            }
        } catch (InputMismatchException | IndexOutOfBoundsException ex) {
            entry.nextLine();
            System.out.println("Please use only appropriate input. Start again.");
            dropCourse(studentId);
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
        } catch (InputMismatchException | IndexOutOfBoundsException ex) {
            entry.nextLine();
            System.out.println("Please use only appropriate input. Start again.");
            expelStudent();
        }
    }

    private static void studentWithdrawal(int studentId) {
        try {
            newSchool.getStudent(studentId - 1).withdraw(newSchool);

            System.out.println("You have successfully left Semicolon. We are sad to see you go.");

            appMenu();
        } catch (InputMismatchException | IndexOutOfBoundsException ex) {
            entry.nextLine();
            System.out.println("Please use only appropriate input. Start again.");
            studentWithdrawal(studentId);
        }
    }

}

