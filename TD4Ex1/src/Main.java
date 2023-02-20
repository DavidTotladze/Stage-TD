import Forme.Rectangle;
import Formebis.Carre;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5.0, 6.0);
        Carre c1 = new Carre();
        Carre c2 = new Carre(5.0);

        System.out.println(r1.toString());
        System.out.println(r1.aire());
        System.out.println(r1.perimetre());

        System.out.println(r2.toString());
        System.out.println(r2.aire());
        System.out.println(r2.perimetre());

        System.out.println(c1.toString());
        System.out.println(c1.aire());
        System.out.println(c1.perimetre());

        System.out.println(c2.toString());
        System.out.println(c2.aire());
        System.out.println(c2.perimetre());

        System.out.println("Egalité r1 et r2 : " + r1.equals(r2));
        System.out.println("Egalité c1 et c2 : " + c1.equals(c2));
        System.out.println("Egalité r1 et c1 : " + r1.equals(c1));
        System.out.println("Egalité r1 et c2 : " + r1.equals(c2));

        // c1 = r1 marche pas parce c'est le carré qui hérite du rectangle
        r1 = c1;
        System.out.println(r1);
    }
}