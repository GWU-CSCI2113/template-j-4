package interfaces;


public class Student {
    private String firstName, lastName;
    private int gpa;

    public Student(String firstName, String lastName, int gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    public String firstName() { return firstName; }
    public String lastName()  { return lastName;  }
    public int getGPA() { return gpa; }

    public String toString() {
    	return firstName + " " + lastName + ": " + gpa;
    }


}
