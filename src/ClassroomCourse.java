class ClassroomCourse extends Course {
    //TODO 6: declare instance variables
    String school;
    String  session;
    // Hint: school (String), session (String)

    //TODO 7: create a constructor
    // Hint: parameters (Subject subject, String instructor, int fee, String school, String session)
    public ClassroomCourse(Subject subject, String instructor, int fee, String school, String session){
        super(subject,instructor,fee);
        this.school=school;
        this.session=session;

    }
    // - Call the superclass constructor to initialize subject, instructor, and fee
    // - Initialize school and session
}