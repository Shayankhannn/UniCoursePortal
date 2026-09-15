import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //TODO 20: accept user input for learner's name
        // Hint: use Scanner.nextLine()

        //TODO 18: display available courses and accept user choice
        // Hint: show a numbered list (e.g., 1 = Java, 2 = Java Online, etc.)
        //       and read choice using Scanner

        //TODO 19: initialize object of chosen course
        // Hint: choose ClassroomCourse or OnlineCourse based on user input

        //TODO 8: declare and initialize the object of ClassroomCourse class
        // Hint: provide subject, instructor, fee, school, and session
        Subject subject = new Subject("Math",2.0);
        ClassroomCourse classroomCourse = new ClassroomCourse(subject,"johnson",200,"republic of russia","morning");
        //TODO 9: declare and initialize the Learner object
        // Hint: pass learner's name and chosen Course object
        Learner learner = new Learner("harry",classroomCourse);
        //TODO 21: call assignmentScore() and quizScore() methods
        // Hint: prompt the user for marks and call the respective methods

        //TODO 22: call calculateGrade() method and display result
        // Hint: if gradeScore >= 5, print "successfully passed"; otherwise, "successfully completed"
    }
}