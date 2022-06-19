package classwork.schoolmanagementsystem;

import java.util.ArrayList;

public class DummyData {
    public static ArrayList<Student> dummyStudents = new ArrayList<>();
    public static ArrayList<Course> dummyCourses = new ArrayList<>();

    ArrayList<ArrayList<Course>> allStudentCourses = new ArrayList<>();
    public static ArrayList<Course> dummyStudent1Courses = new ArrayList<>();
    public static ArrayList<Course> dummyStudent2Courses = new ArrayList<>();
    public static ArrayList<Course> dummyStudent3Courses = new ArrayList<>();
    public static ArrayList<Course> dummyStudent4Courses = new ArrayList<>();
    public static ArrayList<Course> dummyStudent5Courses = new ArrayList<>();

    private static Course course1 = new Course(1, "Intro to Java", "JAV101", 2);
    private static Course course2 = new Course(2, "Intro to Database", "DBS101", 2);
    private static Course course3 = new Course(3, "Intro to Python", "PYT101", 2);
    private static Course course4 = new Course(4, "Design Thinking", "DST101", 3);
    private static Course course5 = new Course(5, "Intro to JavaScript", "JVS101", 2);
    private static Course course6 = new Course(6, "Industrial Design", "DST101", 3);

    private static Student student1 = new Student("Ayoola Popoola", 1, 29, "Male");
    private static Student student2 = new Student("Junior Effiong", 2, 19, "Male");
    private static Student student3 = new Student("Joy Ikechukwu", 3, 23, "Female");
    private static Student student4 = new Student("Ayomide Adeoti", 4, 25, "Female");
    private static Student student5 = new Student("Hassan Rilwan", 5, 22, "Male");

    public void addDummies() {
        dummyCourses.add(course1);
        dummyCourses.add(course2);
        dummyCourses.add(course3);
        dummyCourses.add(course4);
        dummyCourses.add(course5);
        dummyCourses.add(course6);

        dummyStudents.add(student1);
        dummyStudents.add(student2);
        dummyStudents.add(student3);
        dummyStudents.add(student4);
        dummyStudents.add(student5);

        dummyStudent1Courses.add(course1);
        dummyStudent1Courses.add(course3);
        dummyStudent1Courses.add(course5);

        dummyStudent2Courses.add(course1);
        dummyStudent2Courses.add(course3);
        dummyStudent2Courses.add(course4);
        dummyStudent2Courses.add(course6);

        dummyStudent3Courses.add(course1);
        dummyStudent3Courses.add(course3);

        dummyStudent4Courses.add(course1);
        dummyStudent4Courses.add(course2);
        dummyStudent4Courses.add(course4);
        dummyStudent4Courses.add(course5);
        dummyStudent4Courses.add(course6);

        dummyStudent5Courses.add(course2);
        dummyStudent5Courses.add(course5);
        dummyStudent5Courses.add(course6);

        allStudentCourses.add(dummyStudent1Courses);
        allStudentCourses.add(dummyStudent2Courses);
        allStudentCourses.add(dummyStudent3Courses);
        allStudentCourses.add(dummyStudent4Courses);
        allStudentCourses.add(dummyStudent5Courses);

    }

    public ArrayList<Student> getDummyStudents() {
        return dummyStudents;
    }

    public ArrayList<Course> getDummyCourses() {
        return dummyCourses;
    }
}
