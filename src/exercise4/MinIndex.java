package exercise4;

import java.util.Scanner;
import java.util.Arrays;

public class MinIndex {
  public static void main (String [] args) {

    Scanner input = new Scanner (System.in);

    System.out.println ("Enter limit of numbers: ");
    int limit = input.nextInt();
    double[] numbers = new double[limit];

    System.out.println ("Enter numbers: ");

    for (int index = 0; index < numbers.length; index++) {
       numbers[index] = input.nextInt ();
     }    
     double min = 0;
     int i = 0;     

     for (int index = 0; index < numbers.length; index++) {
       if (numbers[index]<min) {
         min = numbers[index];
         i = index;         
       }

     }
     System.out.println ("Min Index = " + i);

  }
}