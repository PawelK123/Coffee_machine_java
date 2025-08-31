package ekspres;

import java.util.Scanner;
public class Ekspres {

    public static void inicjalizuj(){
        System.out.println("Witaj w Coffee machine !!");
        System.out.println("Jaką czynność chcesz wykonać? ");
        System.out.println("[1] Przygotowanie espresso");
        System.out.println("[2] Przygotowanie cappuccino");
        System.out.println("[3] Przygotowanie americano ");
        System.out.println("[4] Przygotowoanie gorącego mleka ");
        System.out.println("[5] Uzupełnienie składników");

        System.out.println();



    }
    public static String PobierzDzialanie(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz odpowiedni numer ");
        String dzialanie = scanner.nextLine();
        return dzialanie;


    }
    public static void zrobEspresso(){
        System.out.println("Robię Espresso...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Skończyłem robić, Oto twoje Espresso!!");

    }
    public static void zrobAmericano(){
        System.out.println("Robię Americano...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Skończyłem robić, Oto twoje Americano!!");


    }
    public static void zrobCappuccino(){
        System.out.println("Robię Cappucino...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Skończyłem robić, Oto twoje Cappuccino!!");

    }
    public static void zrobMleko() {
        System.out.println("Robię Gorące mleko...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Skończyłem robić, Oto twoje Gorące mleko!!");

    }
}
