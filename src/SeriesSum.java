import java.util.Scanner;

public class SeriesSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of numbers in the row: ");
        int numbersInSeriesCount = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i <= numbersInSeriesCount; i++) {
            if (i % 2 == 0) {
                sum += -Math.pow(i, 2);
            } else {
                sum += Math.pow(i, 2);
            }
        }

        System.out.println("The result of summing a number series: " + sum);
    }
}
