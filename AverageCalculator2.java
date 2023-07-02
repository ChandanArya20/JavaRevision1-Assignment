

public class AverageCalculator2 {
    public static void main(String[] args) {
    	
        int[] list= {2,5,9,3,12,5};
        
        int sum = 0;
        int i = 0;

        do {
            sum += list[i];
            i++;
        } while (i < list.length);

        double average = (double) sum / list.length;
        System.out.println("Average: " + average);

    }
}
