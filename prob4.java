public class prob4{
    public static void main(String[] args) {
        check(67);
    }
    public static void check(int num) {
        if (num % 2 == 0) {
        System.out.println(num + " is Even");
        } else {
        System.out.println(num + " is Odd");
        }
    }
}