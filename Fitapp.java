import java.util.Scanner;
public class Fitanalyzer{
    public static int[] analyzeSteps(int[] day_steps){
        int ActiveDays = 0;
        int total_steps = 0;
        for (int i = 0; i < 7; i++){
            total_steps += day_steps[i];
            if (day_steps[i] >= 8000) {
                ActiveDays++;
            }
            System.out.println("Active days: " + ActiveDays);
            System.out.println("Average steps : " + (total_steps)/(i+1));
        }
        int average_steps = total_steps / day_steps.length;
        if(ActiveDays >= 5){
            total_steps += 500;
        }else{
            total_steps -= 500;
        }
        return new int[]{ActiveDays, average_steps, total_steps};
    }
}
public class Fitapp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day_steps[] = new int[7];
        for (int i = 0; i < 7; i++) {
            System.out.print("Enter steps for day " + (i + 1) + ": ");
            day_steps[i] = scanner.nextInt();
        }
        scanner.close();
        int[] results = Fitanalyzer.analyzeSteps(day_steps);
        int ActiveDays = results[0];
        int avg_steps = results[1];
        int total_steps = results[2];
        if(avg_steps/7 >= 8500){
            System.out.println("Fitness Goal Achieved");
            System.out.println("Total Steps :" + avg_steps + " and Average Steps: " + (avg_steps/7));
        }else{
            System.out.println("Fitness Goal Not Achieved");
            System.out.println("Total Steps :" + avg_steps + " and Average Steps: " + (avg_steps/7));
        }
    }   
}
