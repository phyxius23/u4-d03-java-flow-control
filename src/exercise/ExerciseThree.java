package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ExerciseThree {

  public static void main(String[] args) {

    // dichiarazione della variabile e reperimento del valore
    String text;

    Scanner in = new Scanner(System.in);

    // corpo del programma
    while (true) {
      System.out.println("Inserisci del testo oppure ':q' per uscire: ");
      text = in.nextLine();      

      if(text.equals(":q")) break;

      String[] arr = text.split("");
      text = Arrays.toString(arr);
      System.out.println(text.substring(1, text.length()-1));  
    }

    System.out.println("Addio!");

    in.close();
  }
}
