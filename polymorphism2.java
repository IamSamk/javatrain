import java.util.Scanner;
class A{
    void display(int a){
        System.out.println("This is method with one parameter: " + a);
    }
    void display(int a, int b){
        System.out.println("This is method with two parameters: " + a + " and " + b);
    }
}
class polymorphism{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int val = sc.nextInt();
        int val2 = sc.nextInt();
        A a = new A();
        a.display(val); // Here at compile time, the method to be called is determined based on the number and type of parameters passed to the method. Since we are passing one parameter of type int, the method with one parameter will be called.
        a.display(val, val2); // Here at compile time, the method to be called is determined based on the number and type of parameters passed to the method. Since we are passing two parameters of type int, the method with two parameters will be called.
    }
}