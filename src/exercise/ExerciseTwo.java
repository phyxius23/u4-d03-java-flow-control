package exercise;

import java.util.Scanner;

public class ExerciseTwo {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    // dichiarazione della variabile e reperimento del valore
    System.out.println("Scrivere un numero intero: ");
    int number = in.nextInt();

    // corpo del programma
    switch (number) {
      case 0:
        System.out.println("Hai inserito l'intero zero");
        break;
      case 1:
        System.out.println("Hai inserito l'intero uno");
        break;
      case 2:
        System.out.println("Hai inserito l'intero due");
        break;
      case 3:
        System.out.println("Hai inserito l'intero tre");
        break;
      default:
        System.out.println("Errore");
        break;
    }

    in.close();
  }
}
