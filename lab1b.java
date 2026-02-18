import java.util.Scanner;
public class lab1b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.print("Enter your age: ");
        age = sc.nextInt();
        if(age >= 18){
            System.out.println("You are eligible to vote.");
        }else{
            System.out.println("You are not eligible to vote.");
        }
        sc.close();
    }
}
