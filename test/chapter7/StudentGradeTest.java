package chapter7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class StudentGradeTest {

   /* @BeforeEach

    void setUp() {
        StudentGrade citadel = new StudentGrade();
    }*/

    @Test

    void createNewObject() {
        StudentGrade citadel = new StudentGrade(2,2);

        String name = citadel.whoIsStudent(0);
        assertNull(name);

        String name2 = citadel.whatIsSubject(0);
        assertNull(name2);
    }

    @Test

    void createNewArrayValues() {
        StudentGrade citadel = new StudentGrade(2,2);

        citadel.enterStudentName(0,"David Oluyole");

        String name = citadel.whoIsStudent(0);
        assertEquals("David Oluyole", name);

        citadel.enterSubjectName(0,"Java");

        String name2 = citadel.whatIsSubject(0);
        assertEquals("Java", name2);
    }

    @Test

    void lowestScoreTest() {
        StudentGrade citadel = new StudentGrade(2,2);

        int[] score = {82, 71, 24, 59, 90};
        citadel.enterStudentName(0, "Grace");
        citadel.enterStudentName(1, "Chi");
        citadel.enterStudentName(2, "Tee");
        citadel.enterStudentName(3, "Dee");
        citadel.enterStudentName(4, "Gee");
        citadel.enterSubjectName(0, "Java");

        for(int i = 0; i < score.length; i++) citadel.enterScore(i, 0, score[i]);

        //int lowest = citadel.subjectLowest(0);
        //assertEquals(24, lowest);


    }

}
