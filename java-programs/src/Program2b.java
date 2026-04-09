public class Program2b {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter an integer for the multiplication table: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            int product = number * i;
            System.out.println(number + " × " + i + " = " + product);
        }

        scanner.close();
    }
}