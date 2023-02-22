package initialisation;

public class Insecte {
    private static int X = init("Initialisation statique X");
    private static int Y;
    static {
        System.out.println("Entrée static initialisation Insecte X= " + X
                + ", Y = " + Y);
        Y = 200;
        System.out.println("Sortie static initialisation Insecte X= " + X
                + ", Y = " + Y);
    }
    static int init(String s) {
        System.out.println(s);
        return 100;
    }
    private int i = Insecte.init("Insecte initialisation instance i");
    private int j;
    public Insecte() {
        System.out.println("Entrée Insecte() i = " + i + ", j = " + j);
        i = 15;
        j = 25;
        System.out.println("Sortie Insecte() i = " + i + ", j = " + j);
    }
}
