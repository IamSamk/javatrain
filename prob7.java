public class prob7{
    public static void main(String[] args) {
    int x = -67;
    String status = check(x);
    System.out.println("The number " + x + " is: " + status);
    }
    public static String check(int n) {
    if (n > 0) {
    return "Positive";
    } else if (n < 0) {
        return "Negative";
    }else{
        return"Zero"; }
    }
}