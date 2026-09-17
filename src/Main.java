import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        //TODO 18: display available courses and accept user choice
        // Hint: show a numbered list (e.g., 1 = Java, 2 = Java Online, etc.)
        //       and read choice using Scanner
        System.out.println("select from the available courses : 1 = Java, 2 = Java Online, 3 = JavaScript, and 4 = JavaScript Online.");
        int courseChoice = in.nextInt();

        //TODO 19: initialize object of chosen course
        // Hint: choose ClassroomCourse or OnlineCourse based on user input
        Course course;
        in.nextLine();
        switch (courseChoice)
        {
            case 1 :
                 course = new ClassroomCourse(   new Subject("Java", 3.0),
                         "John",
                         200,
                         "ABC School",
                         "Morning");
                break;
            case 2 :
                 course = new OnlineCourse(   new Subject("Java Online", 3.0),
                         "John",
                         200,
                         4,12);
                break;
            case 3 :
                 course = new ClassroomCourse(   new Subject("Javascript", 4.0),
                         "John",
                         200,
                         "ABC School",
                         "Morning");
                break;
            case 4 :
                 course = new OnlineCourse(   new Subject("Javascript Online", 3.0),
                         "John",
                         200,
                         5,
                         14);
                break;
            default:
                System.out.println("unexpected option choosen ! ");
                return;
        }
        //TODO 20: accept user input for learner's name
        // Hint: use Scanner.nextLine()
        System.out.println("Enter Learner's Name :");
        String learnerName = in.nextLine();
        Learner learner = new Learner(learnerName ,course);
        //TODO 8: declare and initialize the object of ClassroomCourse class
        // Hint: provide subject, instructor, fee, school, and session
//        Subject subject = new Subject("Math",2.0);
//        ClassroomCourse classroomCourse = new ClassroomCourse(subject,"johnson",200,"republic of russia","morning");
        //TODO 9: declare and initialize the Learner object
        // Hint: pass learner's name and chosen Course object
//        Learner learner = new Learner("harry",classroomCourse);
        //TODO 21: call assignmentScore() and quizScore() methods
        // Hint: prompt the user for marks and call the respective method
        System.out.println("Enter Your Marks : in an online course, the maximum mark for an assignment is 30, and for a quiz, it is 10. In the classroom course, the maximum mark for an assignment is 100, and for a quiz, it is 30.");
        System.out.println("Enter your Assignment Marks : ");
//        int assignmentMarks = in.nextInt();
        learner.assignmentScore(in.nextInt());
        System.out.println("Enter your Quiz Marks : ");
        learner.quizScore(in.nextInt());
        //TODO 22: call calculateGrade() method and display result
        // Hint: if gradeScore >= 5, print "successfully passed"; otherwise, "successfully completed"
       double grade =learner.calculateGrade();
        if ( grade>= 5)System.out.println("Your grade is " + grade + " and You have successfully passed!");
        else System.out.println("Your grade is " + grade + " and You have successfully completed!");
    }
}