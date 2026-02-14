package edu.sdccd.cisc191;

/**
 * Module 1 - Demo runner.
 * This is primarily for your video demo.
 */
public class Main {
    public static void main(String[] args) {
        // TODO: Create at least 6 students and demonstrate:
        Student[] students = {
                new Student("Andre",   3.8, 1),
                new Student("Chris",     4.0, 2),
                new Student("Abe",  4.0, 3),
                new Student("Collin",   3.8, 4),
                new Student("Jace",     3.7, 5),
                new Student("Justin",   2.1, 6)
        };
        // - original order
        System.out.println("Original Order");
        for (Student s : students) {
            System.out.println(s);
        }

        // - sorted-by-GPA order
        Student[] sorted = StudentArrayToolkit.copySortedByGpaDesc(students);
        System.out.println("\nSorted by GPA (Descending)");
        for (Student s : sorted) {
            System.out.println(s);
        }

        // - topNByGpa with N=3
        Student[] top3 = StudentArrayToolkit.topNByGpa(students, 3);
        System.out.println("\nTop 3 by GPA");
        for (Student s : top3) {
            System.out.println(s);
        }

        // - findByIdLinear with existing and non-existing id
        Student found = StudentArrayToolkit.findByIdLinear(students, 3);
        System.out.println("\nfindByIdLinear(1004)");
        System.out.println(found != null ? found : "Not found");

        //defensive copy
        System.out.println("\nDefensive Copy");
        System.out.println("Original[0] before tampering: " + students[0]);
        sorted[0] = new Student("Hacker", 0.1, 9998);
        System.out.println("Original[0] after modifying sorted copy: " + students[0]);
        System.out.println("(Original is unchanged - defensive copy success.)");
    }
}
