package classwork.schoolmanagementsystem;

import java.util.ArrayList;

public class Student {
    private String studentName;
    private int studentId;
    private int age;
    private String gender;
    private ArrayList<Course> newCourse;
//    private int[] courseScore = new int[newCourse.size()];;

    public Student(String name, int studentId, int age, String gender) {
        studentName = name;
        this.studentId = studentId;
        this.age = age;
        this.gender = gender;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public boolean checkCourseAlreadyOffered(Course addedCourse) {
        boolean b = false;

        for (Course course : newCourse) {
            if (course == addedCourse) {
                b = true;
                break;
            }
        }
        return b;
    }

    public boolean deleteCourse(int index) {
        boolean b = true;

        if (!newCourse.contains(newCourse.get(index))) {
            System.out.println("You do not offer this course.");
            b = false;
        }
        else {
            for (Course course : newCourse) {
                if (newCourse.get(index) == course && newCourse.get(index).getCourseType() != Course.CourseType.COMPULSORY) {
                    newCourse.remove(index);
                    newCourse.get(index).deleteStudent(this);
                    break;
                }
                if (newCourse.get(index) == course && newCourse.get(index).getCourseType() == Course.CourseType.COMPULSORY) {
                    System.out.println("You cannot drop a compulsory course.");
                    b = false;
                    break;
                }
            }
        }
        return b;
    }

    public boolean deleteCourse(Course course) {
        boolean b = true;

        if (!newCourse.contains(course)) {
            System.out.println("You do not offer this course.");
            b = false;
        }
        else {
            for (Course course2 : newCourse) {
                if (course2 == course && course.getCourseType() == Course.CourseType.COMPULSORY) {
                    System.out.println("You cannot drop a compulsory course.");
                    b = false;
                    break;
                }
                if (course2 == course && course.getCourseType() != Course.CourseType.COMPULSORY) {
                    newCourse.remove(course);
                    course.deleteStudent(this);
                    break;
                }
            }
        }
        return b;
    }

    public void withdraw(School school) {
        school.deleteStudent(studentId - 1);
    }

    public int totalCoursesOfferedByStudent() {
        return newCourse.size();
    }

    public void updateCourseList(ArrayList<Course> courseList) {
        newCourse = courseList;

        for (Course course:newCourse) {
            course.addStudent(this);
        }
    }

    @Override
    public String toString() {
        return String.format("Student ID: SCN/%03d%nName: %s%nAge: %d%n" +
                        "Gender: %s%nNo. of Courses Offered: %d%n%n",
                studentId, studentName, age, gender, totalCoursesOfferedByStudent());
    }
}

