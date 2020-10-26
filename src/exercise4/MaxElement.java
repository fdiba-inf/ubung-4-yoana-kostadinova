package exercise4;

import java.util.Scanner;
import java.util.Arrays;

public class MaxElement {
  public static void main (String [] args) {

    Scanner input = new Scanner (System.in);

    System.out.println ("Enter limit of numbers: ");

    int limit = input.nextInt();
    double[] numbers = new double[limit];

    System.out.println ("Enter numbers: ");

     for (int index = 0; index < numbers.length; index++) {
       numbers[index] = input.nextInt ();
     }
     
     double max = 0;

     for (int index = 0; index < numbers.length; index++) {
       if (max < numbers[index]) {
         max = numbers[index];         
       }
     }
          System.out.println (max);
  }
}