import librairie.*;

public class TestAuteur {
    public static void main(String[] args) {
        Auteur Hugo = new Auteur("Hugo", Sexe.MASCULIN);
        Hugo.setEmail("victor.hugo@orange.fr");
        Auteur Sand = new Auteur("Sand", Sexe.FEMININ);
        Sand.setEmail("georges.sand@free.fr");

        System.out.println(Hugo.toString());
        System.out.println(Sand.toString());
    }
}