package exercise;

import java.util.Scanner;

public class ExerciseOne {

	public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    // dichiarazione della variabile e reperimento del valore 
    System.out.println("Inserisci una stringa: ");
    String text = in.nextLine();
    
    // dichiarazione della variabile e reperimento del valore
    System.out.println("Inserisci l'anno di cui vuoi calcolare se è o no bisestile: ");
    int year = in.nextInt();

    // corpo del programma
    if (stringOddEven(text)) {
      System.out.println("La stringa è composta da " + text.length() + " caratteri, quindi sono pari");
    } else {
      System.out.println("La stringa è composta da " + text.length() + " caratteri, quindi sono dispari");
    }

    if (leapYear(year)) {
      System.out.println("L'anno " + year + " è bisestile");
    } else {
      System.out.println("L'anno " + year + " non è bisestile");
    }

    in.close();
	}

  // funzioni
	public static Boolean stringOddEven(String text) {
    return (text.length() % 2 == 0) ? true : false;
  }

  public static Boolean leapYear(int y) {
    return (y % 400 == 0 || (y % 4 == 0 && !(y % 100 == 0))) ? true : false;
  }

}
