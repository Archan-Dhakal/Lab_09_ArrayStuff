import java.util.Random;
import java.util.Scanner;

public class Lab_09_ArrayStuff {
    public static void main(String[] args) {
        int[] dataPoints = new int[100];
        Random rand = new Random();

        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rand.nextInt(100) + 1;
        }
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);
            if (i < dataPoints.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println();

        int sum = 0;
        for (int value : dataPoints) {
            sum += value;
        }
        double average = (double) sum / dataPoints.length;
        System.out.println("The sum of the array is: " + sum + ", and the average of the array is: " + average);

        Scanner scanner = new Scanner(System.in);
        int userValue = SafeInput.getRangedInt(scanner, "Enter a value between 1 and 100", 1, 100);

        int count = 0;
        for (int val : dataPoints) {
            if (val == userValue) {
                count++;
            }
        }
        System.out.println("The value " + userValue + " appears " + count + " times in the dataPoints array.");

        boolean found = false;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userValue) {
                System.out.println("The value " + userValue + " was found at array index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("The value " + userValue + " was not found in the array.");
        }
        int min = dataPoints[0];
        int max = dataPoints[0];
        for (int val : dataPoints) {
            if (val < min) min = val;
            if (val > max) max = val;
        }
        System.out.println("The minimum value in dataPoints is: " + min);
        System.out.println("The maximum value in dataPoints is: " + max);

        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));

    }
    public static double getAverage(int[] values) {
        int sum = 0;
        for (int val : values) {
            sum += val;
        }
        return (double) sum / values.length;
    }
}
