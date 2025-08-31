package main.java;

import main.java.skladniki.Kawy;
import skladniki.Skladniki;
import ekspres.Ekspres;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Skladniki skladniki = new Skladniki();
        while (true) {
            Ekspres.inicjalizuj();
            skladniki.pokazSkladniki();
            String dzialanie = Ekspres.PobierzDzialanie();
            boolean czyWystarczySkladnikow = skladniki.sprawdzSkladniki(dzialanie);
            if (czyWystarczySkladnikow == true) {
                if (dzialanie.equals("1")) {
                    Ekspres.zrobEspresso();
                    skladniki.kawa -= 2;
                    skladniki.woda -= 1;
                } else if (dzialanie.equals("2")) {
                    Ekspres.zrobCappuccino();
                    skladniki.kawa -= 1;
                    skladniki.mleko -= 2;
                } else if (dzialanie.equals("3")) {
                    Ekspres.zrobAmericano();
                    skladniki.kawa -= 2;
                    skladniki.woda -= 2;
                } else if (dzialanie.equals("5")) {
                    skladniki.uzupelnijSkladniki();
                } else if (dzialanie.equals("4")) {
                    Ekspres.zrobMleko();
                    skladniki.mleko -= 3;

                }
            } else {
                System.out.println("Niestety brakuje skladnikow na wykonanie twojego zamówienia");
            }
            System.out.println("Czy chcesz zrobic jeszcze jakiś napój? tak/nie ");
            String czyDalej = scanner.nextLine();
            if (czyDalej.equals("nie")){
                break;
            }


        }

    }
}