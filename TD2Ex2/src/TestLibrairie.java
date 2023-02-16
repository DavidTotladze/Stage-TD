import librairie.*;

public class TestLibrairie {
    public static void main(String[] args) {
        Auteur Hugo = new Auteur("Hugo", Sexe.MASCULIN);
        Livre livre1 = new Livre("La mare au diable", Hugo, 10f);
        livre1.setQuantiteEnStock(15);

        Auteur Sand = new Auteur("Sand", Sexe.FEMININ);
        Livre livre2 = new Livre("Contemplations", Sand, 15.75f);
        livre2.setQuantiteEnStock(3);

        System.out.println(livre1.toString());
        System.out.println(livre2.toString());

        Librairie uneLibrairie = new Librairie("Une Librairie");
        uneLibrairie.ajouterLivre(livre1);
        uneLibrairie.ajouterLivre(livre2);

        System.out.println("Valeur du stock = " + uneLibrairie.valoriserLeStock());
    }
}
