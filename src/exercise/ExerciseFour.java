package exercise;

import java.util.Scanner;

public class ExerciseFour {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    // dichiarazione della variabile e reperimento del valore
    System.out.println("Inserisci il numero intero da cui eseguire il countdown: ");
    int number = in.nextInt();

    // corpo del programma
    for (int i = number; i >= 0; i--) {
      System.out.println(i);
    }

    in.close();
  }
}
