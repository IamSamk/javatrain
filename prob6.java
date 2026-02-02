public class prob6 {
    public static void main(String[] args) {
        double sal = 50000;
        double hiked = calculate(sal);
        double finalSalary = hiked + (sal * 0.05);
        System.out.println("The final salary is: " + finalSalary);
    }
    public static double calculate(double salary) {
        double da = salary * 0.05;
        double hra = salary * 0.08;
        return salary + da + hra;
    }
}