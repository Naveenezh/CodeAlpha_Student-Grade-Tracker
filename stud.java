import java.util.Scanner;

public class stud {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Input student details
        System.out.print("Enter Student Index No : ");
        String indexNo = scan.next();

        System.out.print("Enter Student Name : ");
        String name = scan.next();

        System.out.print("Enter Number of Subjects : ");
        int numberOfSubjects = scan.nextInt();

        int max = 0;
        int total = 0;

        // Input marks
        for (int i = 0; i < numberOfSubjects; i++) {

            System.out.print("Enter Subject " + (i + 1) + " Marks : ");
            int marks = scan.nextInt();

            if (marks > max) {
                max = marks;
            }

            total += marks;
        }

        boolean running = true;

        while (running) {

            System.out.println("\n===== MENU =====");
            System.out.println("A. Display Student Details");
            System.out.println("B. Display Maximum Marks");
            System.out.println("C. Display Total, Average & Result");
            System.out.println("X. Exit");

            System.out.print("Select one option : ");
            String option = scan.next().toUpperCase();

            switch (option) {

                case "A":
                    System.out.println("\nStudent Index No : " + indexNo);
                    System.out.println("Student Name     : " + name);
                    break;

                case "B":
                    System.out.println("\nMaximum Marks : " + max);
                    break;

                case "C":
                    double average = (double) total / numberOfSubjects;

                    String grade;
                    if (average >= 50) {
                        grade = "Pass";
                    } else {
                        grade = "Fail";
                    }

                    System.out.println("\nTotal   : " + total);
                    System.out.println("Average : " + average);
                    System.out.println("Grade   : " + grade);
                    break;

                case "X":
                    System.out.println("Exit");
                    running = false;
                    break;

                default:
                    System.out.println("Please select a valid option.");
            }
        }

        scan.close();
    }
}