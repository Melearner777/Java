import java.util.Scanner;

public class Lowestage{
    public static void main(String[] args){
        Scanner ages = new Scanner(System.in);
        int size = ages.nextInt();
        int number[] = new int[size];

        for(int i = 0; i < size; i++){
            number[i] = ages.nextInt();
        }

        int lowest = number[0];
        for(int i = 1; i < number.length; i++){
            if(number[i] < lowest){
                lowest = number[i];
            }
        }

        System.out.println("Lowest age of your input is: " + lowest);
    }
}

