package interfaces;

import java.util.ArrayList;
import java.util.List;

public class StudentSort {
    public static void main(String[] args) {

    	List<StudentSolved> names = new ArrayList<StudentSolved>();

        names.add(new StudentSolved("Joan", "Smith", 3));
        names.add(new StudentSolved("Karen", "Chen", 4));
        names.add(new StudentSolved("Jeff", "Smith", 3));
        names.add(new StudentSolved("Tom", "Richy", 3));
        names.add(new StudentSolved("Jack", "Li", 2));
        names.add(new StudentSolved("Luke", "Macabe", 2));

        System.out.println("Unsorted names:");
        System.out.println(names);

        // Collections.sort(names);		// Uncomment this to sort!
        System.out.println("\n\nSorted names:");
        System.out.println(names);
    }
}
