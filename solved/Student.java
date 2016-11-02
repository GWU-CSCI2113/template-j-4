package interfaces;


public class Student  implements Comparable<Student>{
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

	public int compareTo(Student otherStudent) {
		if(gpa < otherStudent.gpa) {
			return -1;
		}
		else if (gpa == otherStudent.gpa){
			if(lastName.compareTo(otherStudent.lastName) == 0) {
				return firstName.compareTo(otherStudent.firstName);
			}
			return lastName.compareTo(otherStudent.lastName);
		}
		else {
			return 1;
		}
	}


}
