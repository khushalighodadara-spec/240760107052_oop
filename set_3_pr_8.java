class University {

    // Static variable
    static int totalStudents;
    static String universityName;

    // Static block (executed once when class is loaded)
    static {
        universityName = "Gujarat Technological University (GTU)";
        System.out.println("Static Block Executed");
        System.out.println("University Name: " + universityName);
    }

    // Instance block (executed every time object is created)
    {
        System.out.println("Instance Block Executed - New Student Object Created");
    }

    // Constructor
    University() {
        totalStudents++;
        System.out.println("Constructor Executed");
    }

    // Static method
    static int getTotalStudents() {
        return totalStudents;
    }
}

public class UniversityDemo {
    public static void main(String[] args) {

        System.out.println("Main Method Started\n");

        University s1 = new University();
        System.out.println();

        University s2 = new University();
        System.out.println();

        University s3 = new University();
        System.out.println();

        System.out.println("Total Students: " + University.getTotalStudents());
    }
}
