import Forme.Cercle;

public class Main {
    public static void main(String [] args){
        Cercle c1 = new Cercle();
        System.out.println(Cercle.getNbrCercle());
        Cercle c2 = new Cercle(2.0);
        System.out.println(Cercle.getNbrCercle());

        System.out.println("Aire de c1 : " + c1.aire());
        System.out.println("Aire de c2 : " + c2.aire());
        System.out.println("Couleur de c1 : " + c1.getCouleur());
        System.out.println("Couleur de c2 : " + c2.getCouleur());

        System.out.println("Caractéristiques de c1 : " + c1.toString());
        System.out.println("Caractéristiques de c2 : " + c2.toString());

        Cercle c3 = new Cercle(2.0, "Violet");
        c3.setRayon(5.0);
        System.out.println("Caractéristiques de c3 : " + c3.toString());
        System.out.println("Aire de c3 : " + c3.aire());
        System.out.println(Cercle.getNbrCercle());
    }
}