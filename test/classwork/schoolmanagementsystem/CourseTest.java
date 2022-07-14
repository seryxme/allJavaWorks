package classwork.schoolmanagementsystem;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CourseTest {
    Contact course;
    Student student;
    Student tunde;
    Student david;
    Student elom;
    Student samuel;
    @BeforeEach
    public void SetUp(){
        course = new Contact(1, "Java", "JAV101", 3);
        student = new Student("student", 200, 19, "Female");
        tunde = new Student("tunde", 210, 29, "Male");
        david = new Student("dave", 212, 23, "Male");
        elom = new Student("musk", 7, 25, "Male");
        samuel = new Student("tofunmi", 10, 18, "Female");
    }
    @Test
    public void courseCanBeCreated(){
        assertNotNull(course);
    }

    @Test
    public void checkThatCourseDetailsCanBeChanged(){
        course.setCourseTitle("Database");
        assertEquals("Database", course.getCourseTitle());

        course.setCourseCode("DBS101");
        assertEquals("DBS101", course.getCourseCode());

        course.setCourseUnit(6);
        assertEquals(6, course.getCourseUnit());
    }

    @Test
    public void studentCanBeAddedToThoseOfferingCourse(){
        student.addCourse(course);
        assertEquals(1, course.totalStudentsOfferingCourse());

        tunde.addCourse(course);
        assertEquals(2, course.totalStudentsOfferingCourse());

        david.addCourse(course);
        assertEquals(3, course.totalStudentsOfferingCourse());

        elom.addCourse(course);
        assertEquals(4, course.totalStudentsOfferingCourse());

        samuel.addCourse(course);
        assertEquals(5, course.totalStudentsOfferingCourse());
    }

    @Test
    public void studentCanBeDeletedFromThoseOfferingCourse(){
        student.addCourse(course);
        tunde.addCourse(course);
        david.addCourse(course);

        assertEquals(3, course.totalStudentsOfferingCourse());

        tunde.deleteCourse(course);
        assertEquals(2, course.totalStudentsOfferingCourse());

        student.deleteCourse(course);
        assertEquals(1, course.totalStudentsOfferingCourse());
    }
}
