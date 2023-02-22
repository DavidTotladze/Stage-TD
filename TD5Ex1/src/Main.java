import Forme.*;

public class Main {
    public static void main(String[] args) {
        Cercle cercle1 = new Cercle();
        Rectangle rectangle1 = new Rectangle();
        Cercle cercle2 = new Cercle(2.0);
        Rectangle rectangle2 = new Rectangle(4.0, 4.0);
        Carre carre1 = new Carre();

        Figure [] figures = new Figure[5];
        figures[0] = cercle1;
        figures[1] = rectangle1;
        figures[2] = cercle2;
        figures[3] = rectangle2;
        figures[4] = carre1;

        System.out.println(figures[0].toString());
        System.out.println(figures[0].getCouleur());
        System.out.println(figures[0].aire());
        System.out.println(figures[0].perimetre());
        System.out.println();

        System.out.println(figures[1].toString());
        System.out.println(figures[1].getCouleur());
        System.out.println(figures[1].aire());
        System.out.println(figures[1].perimetre());
        System.out.println();

        System.out.println(figures[2].toString());
        System.out.println(figures[2].getCouleur());
        System.out.println(figures[2].aire());
        System.out.println(figures[2].perimetre());
        System.out.println();

        System.out.println(figures[3].toString());
        System.out.println(figures[3].getCouleur());
        System.out.println(figures[3].aire());
        System.out.println(figures[3].perimetre());
        System.out.println();

        System.out.println(figures[4].toString());
        System.out.println(figures[4].getCouleur());
        System.out.println(figures[4].aire());
        System.out.println(figures[4].perimetre());
        System.out.println();

        //Figure figure = new Figure();
        //c'est abstrait, ne marche pas
    }
}