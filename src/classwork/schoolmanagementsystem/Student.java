package classwork.schoolmanagementsystem;

import java.util.ArrayList;

public class Student {
    private String studentName;
    private int studentId;
    private ArrayList<Course> newCourse;
//    private int[] courseScore = new int[newCourse.size()];;

    public Student(String name , int studentID) {
        studentName = name;
        this.studentId = studentID;
        newCourse = new ArrayList<>();
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentId(int studentID) {
        this.studentId = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void addCourse(Course course) {
        newCourse.add(course);

        course.addStudent(this);
    }

    public Course getCourse(int index) {
        return newCourse.get(index);
    }

    public void getAllCourses() {
        System.out.println("Course List:");
        for(Course course: newCourse) {
            System.out.println(course);
        }
    }

    public void deleteCourse(int index) {
        newCourse.remove(index);
        newCourse.get(index).deleteStudent(this);
    }

    public void deleteCourse(Course course) {
        newCourse.remove(course);
        course.deleteStudent(this);
    }

    public void withdraw(School school) {
        school.deleteStudent(studentId - 1);
    }

    public int totalCoursesOfferedByStudent() {
        return newCourse.size();
    }

    @Override
    public String toString() {
        return String.format("Student ID: %d%nStudent Name: %s%nNo. of Courses Offered: %d%n%n",
                studentId, studentName, totalCoursesOfferedByStudent());
    }
}

