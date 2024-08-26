import java.util.ArrayList;

public class Student
{
    private String name;
    private ArrayList<Double> marks;
    private final String[] subjects = {"English", "Maths", "Science", "Social", "Languages"};

    public Student(String name) {
        this.name = name;
        this.marks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void addMark(double mark) {
        marks.add(mark);
    }

    public double calculateTotal() {
        double sum = 0;
        for (double mark : marks) {
            sum += mark;
        }
        return sum;
    }

    public double calculateAverage() {
        return marks.size() > 0 ? calculateTotal() / marks.size() : 0;
    }

    public char determineGrade()
    {
        double average = calculateAverage();
        if (average >= 90) {
            return 'A';
        } else if (average >= 80) {
            return 'B';
        } else if (average >= 70) {
            return 'C';
        } else if (average >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public ArrayList<Double> getMarks()
    {
        return marks;
    }
}