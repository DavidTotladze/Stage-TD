package cercle;

public class CercleGraphique extends Cercle implements Dimensionnable{

    /**
     * constructeur par défaut d'un CercleGraphique
     */
    public CercleGraphique(){
        super();
    }

    /**
     * constructeur de CercleGraphique avec un paramètre rayon
     * @param rayon attribut rayon
     */
    public CercleGraphique(double rayon){
        super(rayon);
    }

    /**
     * redimensionne un cercle en multipliant son rayon par un pourcentage
     * @param pourcent pourcentage
     */
    public void redimensionner(double pourcent){
        super.setRayon(super.getRayon() * pourcent);
    }
}
