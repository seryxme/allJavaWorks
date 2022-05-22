package chapter7;

import java.util.Arrays;

public class StudentGrade {
    private String[] students;
    private String[] subjects;
    private int[][] scores;
    private int[] totalStudentScores;
    private  int[] position;
    private int total = 0;

    public StudentGrade(int numOfStudents, int numOfSubjects) {
        students = new String[numOfStudents];
        subjects = new String[numOfSubjects];
        scores = new int[students.length][subjects.length];
        totalStudentScores = new int[numOfStudents];
        position = new int[numOfStudents];
    }

    public void enterStudentName(int index, String name) {
        students[index] = name;
    }

    public String whoIsStudent(int index) {
        return students[index];
    }

    public void enterSubjectName(int index, String name) {
        subjects[index] = name;
    }

    public String whatIsSubject(int index) {
        return subjects[index];
    }

    public void enterScore(int studentIndex, int subjectIndex, int score) {
        scores[studentIndex][subjectIndex] = score;
    }

    public int checkScore(int studentIndex, int subjectIndex) {
        return scores[studentIndex][subjectIndex];
    }

    public void gradeReport(){

        calculateTotalScores();

        setPosition();

        gradeTable();

        subjectSummary();

        classSummary();

    }

    public void calculateTotalScores() {
        for (int student = 0; student < students.length; student++) {
            total = 0;
            for (int subject = 0; subject < subjects.length; subject++) {
                total += scores[student][subject];
            }
            totalStudentScores[student] = total;
        }
    }

    public void setPosition() {
        calculateTotalScores();

        int[] sortedTotalScores = new int[totalStudentScores.length];

        System.arraycopy(totalStudentScores, 0, sortedTotalScores, 0, totalStudentScores.length);
        Arrays.sort(sortedTotalScores);

        for (int i = 0; i < sortedTotalScores.length; i++) {
            int scoreIndex = Arrays.binarySearch(sortedTotalScores, totalStudentScores[i]);

            position[i] = students.length - scoreIndex;
        }
    }

    public void gradeTable() {
        for (int student = 0;student < 1; student++) {
            System.out.println("\n=====================================================================================");
            System.out.print("    STUDENT             ");
            for (String s : subjects) {
                System.out.printf("%-10s", s);
            }
            System.out.println("TOT  AVE    POS");
            System.out.println("=====================================================================================");
        }

        for (int student = 0;student < students.length; student++) {
            System.out.printf("%2d. %-20s", student+1, students[student]);
            total = 0;
            for (int subject = 0; subject < subjects.length; subject++) {
                System.out.printf("%-10d", scores[student][subject]);
            }
            double average = (double) totalStudentScores[student] / subjects.length;

            System.out.printf("%-5d%-6.2f%3d%n", totalStudentScores[student], average, position[student]);
        }

        System.out.println("=====================================================================================");
    }

    public void subjectSummary() {
        System.out.println("SUBJECT SUMMARY");
        for (int subject = 0; subject < subjects.length; subject++) {
            System.out.printf("%s%n", subjects[subject]);
            subjectHighest(subject);
            subjectLowest(subject);
            subjectTotalScore(subject);
            subjectAverageScore(subject);
            System.out.printf("""
                    No. of passes: %d
                    No. of failures: %d
                    """, subjectPasses(subject), subjectFailures(subject));
            System.out.println("-------------------------------------------------------------------------------------");
        }
        highestFailures();
        highestPasses();

        overallHighest();
        overallLowest();
        System.out.println("=====================================================================================\n");

    }

    public void classSummary() {

        System.out.println("CLASS SUMMARY");

        System.out.println("=========================================================");
        bestStudent();
        System.out.println("=========================================================\n");

        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        worstStudent();
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

        System.out.println("=========================================================");
        classTotalScore();
        classAverageScore();
        System.out.println("=========================================================");

    }

    public void subjectHighest(int subjectIndex) {
        int highestScore = scores[0][subjectIndex];

        for (int student = 0; student < students.length; student++) {
            if (scores[student][subjectIndex] > highestScore) {
                highestScore = scores[student][subjectIndex];
            }
        }

        for (int student = 0; student < students.length; student++) {

            if (scores[student][subjectIndex] == highestScore) {
                System.out.printf("Highest Scoring student is: %s scoring %d%n", students[student], highestScore);
            }
        }
    }

    public void subjectLowest(int subjectIndex) {
        int lowestScore = scores[0][subjectIndex];

        for (int student = 0; student < students.length; student++) {
            if (scores[student][subjectIndex] < lowestScore) {
                lowestScore = scores[student][subjectIndex];
            }
        }

        for (int student = 0; student < students.length; student++) {
            if (scores[student][subjectIndex] == lowestScore) {
                System.out.printf("Lowest Scoring student is: %s scoring %d%n", students[student], lowestScore);
            }
        }
    }

    public void subjectTotalScore(int subjectIndex) {
        int sum = 0;

        for (int student = 0; student < students.length; student++) {
            sum += scores[student][subjectIndex];
        }

        System.out.printf("Total score is: %d%n", sum);
    }

    public void subjectAverageScore(int subjectIndex) {
        int sum = 0;

        for (int student = 0; student < students.length; student++) {
            sum += scores[student][subjectIndex];
        }

        double average = (double) sum / students.length;
        System.out.printf("Average score is: %.2f%n", average);
    }

    public int subjectPasses(int subjectIndex) {
        int passes = 0;

        for (int student = 0; student < students.length; student++) {
            if (scores[student][subjectIndex] > 50) {
                passes++;
            }
        }
        return passes;
    }

    public int subjectFailures(int subjectIndex) {
        int failures = 0;

        for (int student = 0; student < students.length; student++) {
            if (scores[student][subjectIndex] < 50) {
                failures++;
            }
        }
        return failures;
    }

    public void overallHighest() {
        int highestScore = scores[0][0];

        for (int student = 0; student < students.length; student++) {
            for (int subject = 0; subject < subjects.length; subject++) {
                if (scores[student][subject] > highestScore) {
                    highestScore = scores[student][subject];
                }
            }
        }
        for (int student = 0; student < students.length; student++) {
            for (int subject = 0; subject < subjects.length; subject++) {
                if (scores[student][subject] == highestScore) {
                    System.out.printf("Overall highest score is scored by %s in %s scoring %d.%n",
                            students[student], subjects[subject], highestScore);
                }
            }
        }
    }

    public void overallLowest() {
        int lowestScore = scores[0][0];

        for (int student = 0; student < students.length; student++) {
            for (int subject = 0; subject < subjects.length; subject++) {
                if (scores[student][subject] < lowestScore) {
                    lowestScore = scores[student][subject];
                }
            }
        }
        for (int student = 0; student < students.length; student++) {
            for (int subject = 0; subject < subjects.length; subject++) {
                if (scores[student][subject] == lowestScore) {
                    System.out.printf("Overall lowest score is scored by %s in %s scoring %d.%n",
                            students[student], subjects[subject], lowestScore);
                }
            }
        }
    }

    public void highestPasses() {

        int highestPasses = subjectPasses(0);
        for (int subject = 0; subject < subjects.length; subject++) {
            if (subjectPasses(subject) > highestPasses) {
                highestPasses = subjectPasses(subject);
            }
        }

        for (int subject = 0; subject < subjects.length; subject++) {
            if (subjectPasses(subject) == highestPasses){
                System.out.printf("Easiest subject is %s with %d passes.%n", subjects[subject], highestPasses);
            }
        }

    }

    public void highestFailures() {

        int highestFailures = subjectFailures(0);
        for (int subject = 0; subject < subjects.length; subject++) {
            if (subjectFailures(subject) > highestFailures) {
                highestFailures = subjectFailures(subject);
            }
        }
        for (int subject = 0; subject < subjects.length; subject++) {
            if (subjectFailures(subject) == highestFailures){
                System.out.printf("Hardest subject is %s with %d failures.%n", subjects[subject], highestFailures);
            }
        }

    }

    public void classTotalScore() {
        int sum = 0;

        for (int student = 0; student < students.length; student++) {
            sum += totalStudentScores[student];
        }

        System.out.printf("Class total score is: %d%n", sum);
    }

    public void classAverageScore() {
        int sum = 0;

        for (int student = 0; student < students.length; student++) {
            sum += totalStudentScores[student];
        }
        double average = (double) sum / students.length;
        System.out.printf("Class average score is: %.2f%n", average);
    }

    public void bestStudent() {
        int highestTotal = totalStudentScores[0];

        for (int student = 0; student < students.length; student++) {
            if (totalStudentScores[student] > highestTotal) {
                highestTotal = totalStudentScores[student];
            }

        }
        for (int student = 0; student < students.length; student++) {
            if (totalStudentScores[student] == highestTotal) {
                System.out.printf("Best Graduating Student is: %s scoring %d.%n",
                        students[student], highestTotal);
            }

        }
    }

    public void worstStudent() {
        int lowestTotal = totalStudentScores[0];

        for (int student = 0; student < students.length; student++) {
            if (totalStudentScores[student] < lowestTotal) {
                lowestTotal = totalStudentScores[student];
            }

        }
        for (int student = 0; student < students.length; student++) {
            if (totalStudentScores[student] == lowestTotal) {
                System.out.printf("Worst Graduating Student is: %s scoring %d.%n",
                        students[student], lowestTotal);
            }
        }
    }


}