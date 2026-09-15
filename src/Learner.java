//TODO 12: make Learner class implement Assessments interface
public class Learner implements Assessments{

    //TODO 1: declare instance variables
    // Hint: name (String), course (Course), gradeScore (double)
    String name;
    Course course ;
    double  gradeScore = 0.0;
    //TODO 2: create a constructor to initialize instance variables
    public Learner(String name,Course course){
        this.name=name;
        this.course=course;
    }
    public String toString() {
        return "Name: " + this.name + " " + "Course: " + this.course.subject.title;
    }

    //TODO 13: override assignmentScore() method
    // Hint: set the assignment marks in the associated Course object

    @Override
    public void assignmentScore(int marks) {
        course.setQuizMarks(marks);
    }

    //TODO 14: override quizScore() method
    // Hint: set the quiz marks in the associated Course object

    @Override
    public void quizScore(int marks) {

    }

    public double calculateGrade() {
        int maxAssignmentMarks=0, maxQuizMarks=0;
        if (course instanceof OnlineCourse)
        {
            maxAssignmentMarks = 30;
            maxQuizMarks = 10;


        } else if (course instanceof ClassroomCourse) {
            maxAssignmentMarks = 100;
            maxQuizMarks = 30;
        }
        double assignmentPercentage = ((double)course.getAssignmentMarks()/maxAssignmentMarks)*10;
        double quizPercentage = ((double) course.getQuizMarks()/maxQuizMarks)*10;
        gradeScore = (assignmentPercentage+quizPercentage)/2;

        //TODO 17: calculate gradeScore as per the instructions
        // - For online courses: assignment max = 30, quiz max = 10
        // - For classroom courses: assignment max = 100, quiz max = 30
        // - Compute assignmentGrade and quizGrade out of 10
        // - gradeScore = average of assignmentGrade and quizGrade

        return this.gradeScore;
    }
}
