import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int sum = 0;
        int count = 0;

        System.out.println("Enter the elements:");

        do {
            int number = sc.nextInt();
            sum += number;
            count++;
        } while (count < n);

        double average = (double) sum / n;
        System.out.println("Average: " + average);

        sc.close();
    }
}
