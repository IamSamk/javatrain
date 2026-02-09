public class day2_3 {
    public static void main(String[] args) {
        int a=2;
        int b=3;
        int temp;
        System.out.println("Before swapping: a = "+a+" b = "+b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a = "+a+" b = "+b);
    }
}
