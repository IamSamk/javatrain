public class prob5 {
    public static void main(String[] args) {
        int n = 4;
        int total = sum(n);
        System.out.println("The sum of first " + n + " natural numbers is: " + total);
    }

    public static int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
        sum += i;
        }
        return sum;
    }
}