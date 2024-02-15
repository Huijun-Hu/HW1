package aggregationPrac;

public class Driver {
    public static void main(String[] args) {
         // section 1
         Instructor Nima = new Instructor("Nima", "Davarpanah", "3-263");
         Textbook cleanCode = new Textbook("Clean Code", "Robert C. Martin", "Pearson");

         Course cs4800 = new Course("Software Engineering", Nima, cleanCode);
         cs4800.print();

         System.out.println();

         //section 2
         Instructor anotherInstructor = new Instructor("John", "Smith", "8-8");
         Textbook anotherTextbook = new Textbook("Good Code", "Mary Smith", "EID");

         Course anotherCourse = new Course("Course 2", Nima, cleanCode, anotherInstructor, anotherTextbook);
         anotherCourse.printWith2();

    }
}

