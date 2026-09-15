class Subject {

    // TODO 4: Declare instance variables and create a constructor to initialize them
    // Hint: Use instance variables `title` (String)
    // and `credits` (double) to declare instance variable,
    // and a constructor with parameters (String title, double credits)
    String title;
    double credits;
    public Subject(String title, double credits){
        this.credits=credits;
        this.title=title;
    }
    //TODO 5: define toString() method

    @Override
    public String toString() {
        return "Subject{" +
                "title='" + title + '\'' +
                ", credits=" + credits +
                '}';
    }

    // Hint: return a string representation of the Subject object
}
