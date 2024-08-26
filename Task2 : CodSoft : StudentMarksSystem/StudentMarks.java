import java.util.ArrayList;
import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.println("Enter the number of students:");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        for (int i = 1; i <= numberOfStudents; i++) {
            System.out.println("Enter name for student " + i + ":");
            String name = scanner.nextLine();
            Student student = new Student(name);

            // Input marks for predefined subjects with validation
            String[] subjects = student.getSubjects();
            for (String subject : subjects) {
                double mark;
                do {
                    System.out.println("Enter marks for " + subject + " (less than 100):");
                    mark = scanner.nextDouble();
                    if (mark >= 100 || mark < 0) {
                        System.out.println("Invalid input! Please enter a mark less than 100 and greater than or equal to 0.");
                    }
                } while (mark >= 100 || mark < 0);
                student.addMark(mark);
            }
            students.add(student);
            scanner.nextLine(); // Consume the newline character
        }

        // Output results
        System.out.println("\nStudent Results:");
        System.out.printf("%-15s %-10s %-10s %-10s %-10s %-10s %-10s%n", 
                          "Name", "English", "Maths", "Science", "Social", "Languages", "Total Marks");
        System.out.println("--------------------------------------------------------------------------------");
        for (Student student : students) {
            double total = student.calculateTotal();
            double average = student.calculateAverage();
            char grade = student.determineGrade();
            ArrayList<Double> marks = student.getMarks();
            System.out.printf("%-15s %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f%n", 
                              student.getName(), marks.get(0), marks.get(1), marks.get(2), marks.get(3), marks.get(4), total);
            System.out.printf("Average Marks: %.2f, Grade: %c%n", average, grade);
            System.out.println("--------------------------------------------------------------------------------");
        }
        scanner.close();
    }
}