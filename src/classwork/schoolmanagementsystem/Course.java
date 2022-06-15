package classwork.schoolmanagementsystem;

import java.util.ArrayList;

public class Course {
    private int courseId;
    private String courseTitle;
    private String  courseCode;
    private int courseUnit;
    private ArrayList<Student> newStudents;

    public Course(int courseId, String courseTitle, String courseCode, int courseUnit) {
        this.courseId = courseId;
        this.courseTitle = courseTitle;
        this.courseCode = courseCode;
        this.courseUnit = courseUnit;
        newStudents = new ArrayList<>();
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle= courseTitle;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseUnit(int courseUnit) {
        this.courseUnit = courseUnit;
    }

    public int getCourseUnit() {
        return courseUnit;
    }

    public void addStudent(Student student) {
        newStudents.add(student);
    }

    public Student getStudent(int index) {
        return newStudents.get(index);
    }

    public int totalStudentsOfferingCourse() {
        return newStudents.size();
    }

    public void getAllStudents() {
        for(Student student: newStudents) {
            System.out.println(student);
        }
    }

    public void deleteStudent(Student student) {
        newStudents.remove(student);
    }
    public void deleteStudent(int index) {
        newStudents.remove(index);
    }

    @Override
    public String toString() {
        return String.format("Course Id: %d%nCourse Title: %s%nCourse Code: %s%nCourse Unit: %d%n%n",
                courseId, courseTitle, courseCode, courseUnit);
    }
}
