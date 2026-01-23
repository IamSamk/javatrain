public class method {
    public static int add(int a , int b){
        return a + b;
    }
    public static int sub(int a, int b){
        return a - b;
    }
    public static int mult(int a,int b){
        return a*b;
    }
    public static float div(int a, int b){
        return a/b;
    }
    public static void main(String[] args) {
        int sum = add(6,7);
        int difference = sub(10,4);
        int product = mult(3,5);
        float quotient = div(20,4);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}