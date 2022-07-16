
public class GradeBookTest {

    public static void main(String[] args) {
        int[] gradeArrray = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};

        GradeBook myGradeBook = new GradeBook("Introduction to Java Programming", gradeArrray);

        System.out.printf("Welcome to the grade book for%n%s%n%n", myGradeBook.getCourseName());

        myGradeBook.processGradea();
    }
    
}
