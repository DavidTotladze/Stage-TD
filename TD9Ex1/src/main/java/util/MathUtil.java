package util;

public class MathUtil {
    public static int factoriel(int nombre){
        if (nombre < 0){
            throw new IllegalArgumentException("Un nombre négatif n'a pas de factoriel");
        }
        if (nombre == 0){
            return 1;
        }
        if (nombre == 1){
            return 1;
        }

        int somme = 1;
        for (int i = 2; i <= nombre; i++){
            somme = somme * i;
        }
        return somme;
    }
}
