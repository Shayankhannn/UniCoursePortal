class OnlineCourse extends Course {
    int weeks;
    int videoLessons;

    public OnlineCourse(Subject subject,String instructor,int fee,int weeks,int videoLessons)
    {
        super(subject,instructor,fee);
        this.videoLessons=videoLessons;
        this.weeks=weeks;
    }
    //TODO 15: declare instance variables



    // Hint: weeks (int), videoLessons (int)

    //TODO 16: create a constructor
    // Hint: parameters (Subject subject, String instructor, int fee, int weeks, int videoLessons)
    // - Call the superclass constructor to initialize subject, instructor, and fee
    // - Initialize weeks and videoLessons
}