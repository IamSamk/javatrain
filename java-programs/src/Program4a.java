public class Student {
    String name;
    int rollNumber;

    public void displayStudentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }
}

class Test extends Student {
    int marks;

    public void displayTestDetails() {
        System.out.println("Marks: " + marks);
    }
}

class Sports extends Test {
    String sport;

    public void displaySportsDetails() {
        System.out.println("Sport: " + sport);
    }
}

public class Program4a {
    public static void main(String[] args) {
        Sports student = new Sports();
        student.name = "John Doe";
        student.rollNumber = 101;
        student.marks = 85;
        student.sport = "Basketball";

        student.displayStudentDetails();
        student.displayTestDetails();
        student.displaySportsDetails();
    }
}