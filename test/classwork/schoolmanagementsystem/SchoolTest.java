package classwork.schoolmanagementsystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {
    School newSchool;
    Course course1;
    Course course2;
    Student student1;
    Student student2;
    Student student3;

    @BeforeEach
    void setUp() {
        newSchool = new School("Semicolon Institute", "Yaba");
        course1 = new Course(1, "Java", "JAV101", 3);
        course2 = new Course(1, "Database", "DBS101", 3);
        student1 = new Student("Babatunde", 1);
        student2 = new Student("David", 2);
        student3 = new Student("tofunmi", 3);
    }

    @Test
    public void schoolCanBeCreated(){
        assertNotNull(newSchool);
    }

    @Test
    public void schoolCanAdmitStudents(){
        newSchool.admitStudent(student1);

        assertEquals(student1, newSchool.getStudent(0));

        newSchool.admitStudent(student2);

        assertEquals(student2, newSchool.getStudent(1));

        newSchool.admitStudent(student3);

        assertEquals(student3, newSchool.getStudent(2));

        assertEquals(3, newSchool.totalStudents());
    }

    @Test
    public void schoolCanExpelStudents(){
        newSchool.admitStudent(student1);
        newSchool.admitStudent(student2);
        newSchool.admitStudent(student3);

        newSchool.deleteStudent(1);

        assertEquals(2, newSchool.totalStudents());

        newSchool.deleteStudent(0);

        assertEquals(1, newSchool.totalStudents());
    }

    @Test
    public void schoolCanCreateCourse(){
        newSchool.createCourse(course1);

        assertEquals(course1, newSchool.getCourse(0));

        newSchool.createCourse(course2);

        assertEquals(course2, newSchool.getCourse(1));

        assertEquals(2, newSchool.totalCourses());
    }

    @Test
    public void courseCanBeDeleted(){
        newSchool.createCourse(course1);
        newSchool.createCourse(course2);

        newSchool.deleteCourse(0);

        assertEquals(1, newSchool.totalCourses());
    }
}