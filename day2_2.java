public class day2_2 {
    public static void main(String[] args) {
        int n = 6;
        int fact = 1;
        while(n>1){
            fact = fact * n;
            n--;
        }
        System.out.println("Factorial of "+ n +" is: "+fact);
    }
}
