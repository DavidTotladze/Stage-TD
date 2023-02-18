import wrapper.*;
public class Main {
    public static void main(String[] args) {
        final int dix = 10;
        final int cinq = 5;
        final Entier dixEntier = new Entier(dix);
        final Entier cinqEntier = new Entier(cinq);
        System.out.println("cinq == 5 : " + (cinq == 5));
        System.out.println("cinq == dix : " + (cinq == dix));
        final Entier dixEntierAlias = dixEntier;
        System.out.println("dixEntier == dixEntierAlias : "
                + (dixEntier == dixEntierAlias));
        System.out.println("dixEntier == new Entier(dix) : "
                + (dixEntier == new Entier(dix)));
        System.out.println("dixEntier.equals(new Entier(dix)) : "
                + dixEntier.equals(new Entier(dix)));
        System.out.println(dixEntier);
        System.out.println("dixEntier.getClass() == cinqEntier.getClass() : "
                + (dixEntier.getClass() == cinqEntier.getClass()));
        System.out.println("dixEntier.getClass().equals(cinqEntier.getClass()) : "
                + dixEntier.getClass().equals(cinqEntier.getClass()));
        System.out.println(dixEntier.getClass());
    }
}