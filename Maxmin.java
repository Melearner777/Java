import java.util.Scanner;

public class MaxMin {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of size of an array: ");
        int size = sc.nextInt();
        System.out.println("Enter the numbers for an array: ");
        int numbers[] = new int[size];

        for(int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] < min) {
                min = numbers[i];
            }
            if(numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Largest number is: " + max);
        System.out.println("Smallest number is: " + min);
    }
}
