package aggregationPrac;

public class Course{
    private String courseName;
    private Instructor instructor;
    private Textbook textbook;

    private Instructor instructor2;
    private Textbook textbook2;

    // section 1 with 1 instructor and textbook
    public Course(String courseName, Instructor instructor, Textbook textbook) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.textbook = textbook;
    }

    //section 2 with 2 instructors and textbooks
    public Course(String courseName, Instructor instructor, Textbook textbook, Instructor instructor2,
                  Textbook textbook2) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.textbook = textbook;
        this.instructor2 = instructor2;
        this.textbook2 = textbook2;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public Textbook getTextbook() {
        return textbook;
    }

    public void setTextbook(Textbook textbook) {
        this.textbook = textbook;
    }

    // section 1 print function
    public void print(){
        System.out.printf("\nCourse name: %s\nInstructor: %s %s\nRequired Textbook: %s by %s",
                this.courseName, this.instructor.getFirstName(), this.instructor.getLastName(),
                this.textbook.getTitle(), this.textbook.getAuthor());
    }

    public Instructor getInstructor2() {
        return instructor2;
    }

    public void setInstructor2(Instructor instructor2) {
        this.instructor2 = instructor2;
    }

    public Textbook getTextbook2() {
        return textbook2;
    }

    public void setTextbook2(Textbook textbook2) {
        this.textbook2 = textbook2;
    }

    // section 2 print function
    public void printWith2(){
        System.out.printf("\nCourse name: %s\nInstructor: %s %s and %s %s\nRequired Textbook: %s by %s and %s by %s",
                this.courseName, this.instructor.getFirstName(), this.instructor.getLastName(),
                this.instructor2.getFirstName(), this.instructor2.getLastName(),
                this.textbook.getTitle(), this.textbook.getAuthor(),this.textbook2.getTitle(), this.textbook2.getAuthor());
    }
}

