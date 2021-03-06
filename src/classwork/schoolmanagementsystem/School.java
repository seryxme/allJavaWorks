package classwork.schoolmanagementsystem;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class School {

    private final String schoolName;
    private String schoolLocation;
    private ArrayList<Student> newStudents;
    private ArrayList<Course> newCourses;
    public School(String name, String location) {
        schoolName = name;
        schoolLocation = location;
        newStudents = new ArrayList<>();
        newCourses = new ArrayList<>();
    }

    public void setSchoolLocation(String location) {
        schoolLocation = location;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public String getSchoolLocation() {
        return schoolLocation;
    }

    public void admitStudent(Student student) {
        newStudents.add(student);
    }

    public Student getStudent(int index) {
        return newStudents.get(index);
    }

    public void createCourse(Course course) {
        newCourses.add(course);
    }

    public Course getCourse(int index) {
        return newCourses.get(index);
    }

    public void getAllStudents() {
        for(Student student: newStudents) {
            System.out.println(student);
        }
    }

    public void getAllCourses() {
        for(Course course: newCourses) {
            System.out.println(course);
        }
    }

    public void deleteCourse(int index) {
        for(Student student: newStudents) {
            for (int i = 0; i < student.totalCoursesOfferedByStudent(); i++) {
                if (newCourses.get(index) == student.getCourse(i)) {
                    student.deleteCourse(i);
                }
            }
        }
        newCourses.set(index, null);
    }

    public void deleteStudent(int index) {
        for(Course course: newCourses) {
            for (int i = 0; i < course.totalStudentsOfferingCourse(); i++) {
                if (newStudents.get(index) == course.getStudent(i)) {
                    course.deleteStudent(i);
                }
            }
        }
        newStudents.set(index, null);
    }

    public void activateCourse(int index) {
        newCourses.get(index).changeActiveState(true);
    }

    public void deactivateCourse(int index) {
        newCourses.get(index).changeActiveState(false);
    }

    public void activateCourse(Course course) {
        course.changeActiveState(true);
    }

    public void deactivateCourse(Course course) {
        course.changeActiveState(false);

        int i = 0;
        while (i < course.totalStudentsOfferingCourse()) {
            course.getStudent(0).deleteCourse(course);
            i = 0;
        }
    }

    public void changeCourseType(Course course) {
        for (Student student:newStudents) {
            if (student.getStudentId() < 4 ) {
                course.setCourseType(Course.CourseType.COMPULSORY);
            } else course.setCourseType(Course.CourseType.ELECTIVE);
        }
    }

    public int totalCourses() {
        int counter = 0;
        for(Course course: newCourses) {
            if (course != null) {
                counter++;
            }
        }
        return counter;
    }

    public int totalStudents() {
        int counter = 0;
        for(Student student: newStudents) {
            if (student != null) {
                counter++;
            }
        }
        return counter;
    }

    public void updateStudentList(ArrayList<Student> studentList) {
        newStudents = studentList;
    }

    public void updateCourseList(ArrayList<Course> courseList) {
        newCourses = courseList;
    }

    public int totalStudentsOfferingCourse(int index) {
        return newCourses.get(index).totalStudentsOfferingCourse();
    }

    public String nameOfStudentOfferingCourse(int courseIndex, int studentIndex) {
        return newCourses.get(courseIndex).getStudent(studentIndex).getStudentName();
    }

    public int idOfStudentOfferingCourse(int courseIndex, int studentIndex) {
        return newCourses.get(courseIndex).getStudent(studentIndex).getStudentId();
    }
}
