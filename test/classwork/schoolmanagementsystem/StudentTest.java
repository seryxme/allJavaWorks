package classwork.schoolmanagementsystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    School semicolon;
    Course java;
    Student student1;
    Student student2;

    @BeforeEach
    void setUp() {
        java = new Course(1, "Java", "JAV101", 3);
        student1 = new Student("Babatunde", 1);
        student2 = new Student("David", 2);
    }
    @Test
    public void studentCanBeCreated(){
        assertNotNull(student1);
        assertNotNull(student2);
    }
    @Test
    public void studentDetailsCanBeChanged(){
        student1.setStudentName("Tunde");
        student1.setStudentId(3);
        assertEquals("Tunde", student1.getStudentName());
        assertEquals(3, student1.getStudentId());
    }
    @Test
    public void courseCanBeSelected(){
        student1.addCourse(java);
        assertEquals(1, student1.totalCoursesOfferedByStudent());

        student2.addCourse(java);
        assertEquals(1, student2.totalCoursesOfferedByStudent());

        assertEquals(2, java.totalStudentsOfferingCourse());

    }
    @Test
    public void courseCanBeDropped(){
        student1.addCourse(java);
        assertEquals(1, student1.totalCoursesOfferedByStudent());

        student2.addCourse(java);
        assertEquals(1, student1.totalCoursesOfferedByStudent());

        assertEquals(2, java.totalStudentsOfferingCourse());

        student1.deleteCourse(0);
        assertEquals(0, student1.totalCoursesOfferedByStudent());

        assertEquals(1, java.totalStudentsOfferingCourse());

    }
    @Test
    public void studentCanWithdraw(){

    }
}