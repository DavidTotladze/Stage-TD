import Convertisseur.Devise;

public class Main {
    static Devise euro = new Devise("Euro");
    static Devise franc = new Devise("Franc", 6.5596);
    static Devise dollarUS = new Devise("Dollar US", 1.1672);
    static Devise livreSterling = new Devise("Livre Sterling", 0.7276);

    public static void main(String [] args){
        System.out.println("2 euros = " + franc.convertirEnDevise(2.0) + " francs.");
        System.out.println("2 euros = " + dollarUS.convertirEnDevise(2.0) + " dollars US.");
        System.out.println("2 euros = " + livreSterling.convertirEnDevise(2.0) + " livres Sterling.");

        System.out.println("2 francs = " + franc.convertirEnEuro(2.0) + " euros.");
        System.out.println("2 dollars US = " + dollarUS.convertirEnEuro(2.0) + " euros.");
        System.out.println("2 livres Sterling = " + livreSterling.convertirEnEuro(2.0) + " euros.");

        System.out.println(franc.toString());
        System.out.println(dollarUS.toString());
        System.out.println(livreSterling.toString());

        //System.out.println(franc.nom);
        //cela ne marche pas parce que le nom est en private
    }
}