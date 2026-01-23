import java.util.Scanner;
class Numarray{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] numbers = new int[10];
    for(int i=0;i<10;i++){
	   numbers[i] = scanner.nextInt();
        }
    for(int i=0;i<10;i++){
	  System.out.println(numbers[i]);
        }
    }

}