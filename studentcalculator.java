import java.util.Scanner;

public class studentcalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input student name
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        // Input number of subjects
        System.out.print("Enter number of subjects: ");
        int subjectCount = scanner.nextInt();

        int[] marks = new int[subjectCount];
        int total = 0;

        // Input marks for each subject
        for (int i = 0; i < subjectCount; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            total += marks[i];
        }

        double average = (double) total / subjectCount;
        char grade;

        // Calculate grade based on average
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Output results
        System.out.println("\n--- Grade Report ---");
        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.printf("Average Marks: %.2f\n", average);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
