package skladniki;
import java.util.List;
import java.util.ArrayList;

import main.java.skladniki.Kawy;

public class Skladniki {
    public int kawa;
    public int mleko;
    public int woda;

    public Skladniki() {
        this.kawa = 10;
        this.mleko = 5;
        this.woda = 10;
    }
    public boolean sprawdzSkladniki(String wybor) {
        Kawy kawy = null;
        List<String> brakujaceSkladniki = new ArrayList<>();
        if (wybor.equals("1")) {
            kawy = Kawy.ESPRESSO;
        } else if (wybor.equals("2")) {
            kawy = Kawy.CAPPUCCINO;
        } else if (wybor.equals("3")) {
            kawy = Kawy.AMERICANO;
        } else if (wybor.equals("5")) {
            kawy = Kawy.BRAK;
        } else if (wybor.equals("4")) {
            kawy = Kawy.MLEKO;
        }
        int mlekoPotrzebna = kawy.getMleko();
        int wodaPotrzebna = kawy.getWoda();
        int kawaPotrzebna = kawy.getKawa();

        if (kawa >= kawaPotrzebna && woda >= wodaPotrzebna && mleko >= mlekoPotrzebna) {
            return true;
        } else {
            if (kawa < kawaPotrzebna) {
                brakujaceSkladniki.add("kawa");
            }
            if (woda < wodaPotrzebna) {
                brakujaceSkladniki.add("woda");
            }
            if (mleko < mlekoPotrzebna) {
                brakujaceSkladniki.add("mleko");
            }
            System.out.println("Brakuje: " + String.join(", ", brakujaceSkladniki));
            return false  ;
        }


        }


        public void pokazSkladniki(){
            System.out.println("Aktualny stan skladnikow to: ");
            System.out.println("kawa - " +kawa);
            System.out.println("mleko - "+mleko);
            System.out.println("woda - "+woda);
        }
        public void uzupelnijSkladniki(){
        int ileKawyDodac = 10 - kawa;
        kawa += ileKawyDodac;
        int ileMlekaDodac = 5 - mleko;
        mleko += ileMlekaDodac;
        int ileWodyDodac = 10 - woda;
        woda += ileWodyDodac;
        System.out.println("Dodałem "+ ileKawyDodac+ " Kawy, " +ileMlekaDodac+ " mleka, " + ileWodyDodac+ " wody");
        }



}
