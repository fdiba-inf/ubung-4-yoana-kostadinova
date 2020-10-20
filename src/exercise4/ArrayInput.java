package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

         System.out.println("Enter how many numbers: ");

         int count = input.nextInt();

        int[] numbers = new int[count];

       
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }

        String numbersAsString = Arrays.toString(numbers);
        System.out.println("The array is: " + count);
        System.out.println("Numbers: " + numbersAsString);
    }

}
