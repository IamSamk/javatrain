import java.util.Scanner;
public class prob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day_steps[] = new int[7];
        for (int i = 0; i < 7; i++) {
            System.out.print("Enter steps for day " + (i + 1) + ": ");
            day_steps[i] = scanner.nextInt();
        }
        scanner.close();
        int ActiveDays = 0;
        int avg_steps = 0;
        for (int i = 0; i < 7; i++) {
            avg_steps = avg_steps + day_steps[i];
            if (day_steps[i] >= 8000) {
                ActiveDays++;
            }
            System.out.println("Active days: " + ActiveDays);
            System.out.println("Average steps : " + (avg_steps)/(i+1));
        }
        if(ActiveDays >= 5){
            avg_steps += 500;
            }else{
            avg_steps -= 500;
            }
        if(avg_steps/7 >= 8500){
            System.out.println("Fitness Goal Achieved");
            System.out.println("Total Steps :" + avg_steps + " and Average Steps: " + (avg_steps/7));
        }else{
            System.out.println("Fitness Goal Not Achieved");
            System.out.println("Total Steps :" + avg_steps + " and Average Steps: " + (avg_steps/7));
        }
    }
}
