import java.util.Scanner;

interface Exam {
    double percentage();
}

class Student {
    String name;
    int roll;
    double marks;
    double totalMarks;

    Student(String name, int roll, double marks, double totalMarks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
        this.totalMarks = totalMarks;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + roll);
        System.out.println("Marks Obtained: " + marks);
        System.out.println("Total Marks: " + totalMarks);
    }
}

class Result extends Student implements Exam {
    Result(String name, int roll, double marks, double totalMarks) {
        super(name, roll, marks, totalMarks);
    }

    @Override
    public double percentage() {
        return (marks / totalMarks) * 100;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Percentage: " + percentage() + "%");
    }
}

public class Program5a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter roll number: ");
        int roll = scanner.nextInt();
        
        System.out.print("Enter marks obtained: ");
        double marks = scanner.nextDouble();
        
        System.out.print("Enter total marks: ");
        double totalMarks = scanner.nextDouble();
        
        Result result = new Result(name, roll, marks, totalMarks);
        result.display();
        
        scanner.close();
    }
}