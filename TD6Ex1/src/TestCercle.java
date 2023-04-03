import cercle.*;

public class TestCercle {
    public static void main(String[] args) {
        final Cercle[] cercles = new Cercle[4];

        final Cercle cercle = new Cercle();
        final CercleGraphique cercleGraphique = new CercleGraphique();
        final Cercle cercleR10 = new Cercle(10.0);
        final CercleGraphique cercleGraphiqueR20 = new CercleGraphique(20.0);

        cercles[0] = cercle;
        cercles[1] = cercleGraphique;
        cercles[2] = cercleR10;
        cercles[3] = cercleGraphiqueR20;

        for (int i = 0; i < cercles.length; i++){
            System.out.println(cercles[i]);
        }


        final Geometrique[] cerclesGeometriques = cercles;
        //variable redondant

        for (int i = 0; i < cerclesGeometriques.length; i++){
            System.out.println(cerclesGeometriques[i].aire());
        }

        System.out.println("cercles redimensionnés :");
        for (int i = 0; i < cercles.length; i++){
            if (cercles[i].getClass() == CercleGraphique.class){
                ((CercleGraphique) cercles[i]).redimensionner(0.5);
                /*
                final CercleGraphique cercleARedimensionner = cercles[i];
                cercleARedimensionner.redimensionner(0.5);
                cercles[i] = cercleARedimensionner;
                */
            }
            System.out.println(cerclesGeometriques[i].aire());
        }
    }
}
