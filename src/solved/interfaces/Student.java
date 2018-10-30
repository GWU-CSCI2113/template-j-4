package solved.interfaces;


public class Student implements Comparable<Student> {
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


    public int compareTo(Student o) {
        if(gpa < o.gpa) {
            return -1;
        }
        else if(gpa > o.gpa) {
            return 1;
        }
        int nameComp = lastName.compareTo(o.lastName);
        if(nameComp == 0) {
            nameComp = firstName.compareTo(o.firstName);
        }
        return nameComp;
    }
}
