package initialisation;

public class Papillon extends Insecte{
    private static int Z = Insecte.init("Initialisation statique Z");
    static {
        System.out.println("Entrée static initialisation Papillon Z= " + Z);
        Z = 300;
        System.out.println("Sortie static initialisation Papillon Z= " + Z);
    }
    private int k = Insecte.init("Papillon initialisation instance k");
    private int l;
    Papillon() {
        System.out.println("Entrée Papillon() k = " + k + " l = " + l);
        k = 35;
        l = 45;
        System.out.println("Sortie Papillon() k = " + k + " l = " + l);
    }
}
