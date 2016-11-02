package interfaces;

import java.util.ArrayList;
import java.util.List;

public class StudentSort {
    public static void main(String[] args) {

    	List<Student> names = new ArrayList<Student>();

        names.add(new Student("Joan", "Smith", 3));
        names.add(new Student("Karen", "Chen", 4));
        names.add(new Student("Jeff", "Smith", 3));
        names.add(new Student("Tom", "Richy", 3));
        names.add(new Student("Jack", "Li", 2));
        names.add(new Student("Luke", "Macabe", 2));

        System.out.println("Unsorted names:");
        System.out.println(names);

        // Collections.sort(names);		// Uncomment this to sort!
        System.out.println("\n\nSorted names:");
        System.out.println(names);
    }
}
