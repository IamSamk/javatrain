class addition{
    int sum(int a , int b){
        return a + b;
    }
}
public class object {
    private static void main(String[] args) {
     int sum = addition.sum(6, 7);
        System.out.println("Sum: " + sum);   
    }
}
