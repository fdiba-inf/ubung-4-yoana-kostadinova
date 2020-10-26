package exercise4;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayReversal {
  public static void main (String [] args) {

    Scanner input = new Scanner(System.in);
    System.out.println ("Enter limit of characters: ");

    int limit = input.nextInt();
    
    char[] array = new char[limit];
    char[] reverse = new char[limit];
    int count = array.length-1;


    System.out.println ("Enter characters: ");

    for (int index = 0; index < array.length; index++) {
       array[index] = input.next().charAt(0);
     }
  
     for (int index = 0; index < array.length; index++) {
       reverse[index] = array[array.length - 1 -index];
       count--;         
  }
      
      String revsymbols = Arrays.toString(reverse);
      System.out.println("Reversed symbols: "+ revsymbols);

  
  
  }
}
