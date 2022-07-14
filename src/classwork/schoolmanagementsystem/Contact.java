package classwork.schoolmanagementsystem;

import java.util.ArrayList;

public class Contact {
    private int courseId;
    private String courseTitle;
    private String  courseCode;
    private int courseUnit;
    private boolean activeState;
    private ArrayList<Student> newStudents;

    public enum CourseType {COMPULSORY, ELECTIVE};
    private CourseType newCourseType;

    public Contact(int courseId, String courseTitle, String courseCode, int courseUnit) {
        this.courseId = courseId;
        this.courseTitle = courseTitle;
        this.courseCode = courseCode;
        this.courseUnit = courseUnit;
        newStudents = new ArrayList<>();
        newCourseType = CourseType.ELECTIVE;
        activeState = true;
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

    public void changeActiveState(boolean activeState) {
        this.activeState = activeState;
    }

    public CourseType getCourseType() {
        return newCourseType;
    }

    public void setCourseType(CourseType courseType) {
        newCourseType = courseType;
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
    public ArrayList<Student> getStudentsList() {
        return newStudents;
    }

    public void deleteStudent(Student student) {
        newStudents.remove(student);
    }
    public void deleteStudent(int index) {
        newStudents.remove(index);
    }

    @Override
    public String toString() {
        return String.format("Course Id: %03d%nCourse Title: %s%nCourse Code: %s%nCourse Unit: %d%n" +
                        "Course Type: %s%nNo. of Students Offering Course: %d%n%n",
                courseId, courseTitle, courseCode, courseUnit, newCourseType, totalStudentsOfferingCourse());
    }
}
