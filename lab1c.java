import java.util.Scanner;
public class lab1c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number : ");
        int num = sc.nextInt();
        if(num < 1){
            System.out.println("Please enter a natural number greater than 0.");
            sc.close();
            return;
        }
        int sum = 0;
        for(int i = 1; i <= num; i++){
            sum += i;
        }
        System.out.println("The sum of natural numbers up to " + num + " is: " + sum);
        sc.close();
    }
}
