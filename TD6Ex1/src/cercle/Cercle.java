package cercle;

public class Cercle implements Geometrique {

    private double rayon;
    private static final double DEF_RAYON = 2.0;

    /**
     * constructeur par défaut d'un cercle
     */
    public Cercle(){
        this.rayon = DEF_RAYON;
    }

    /**
     * constructeur de cercle avec un paramètre rayon
     * @param rayon attribut rayon
     */
    public Cercle(double rayon){
        this.rayon = rayon;
    }

    /**
     * getter de rayon
     * @return attribut rayon
     */
    public double getRayon() {
        return rayon;
    }

    /**
     * setter de rayon
     * @param rayon attribut rayon
     */
    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    /**
     * retourne l'aire d'un cercle
     * @return rayon * rayon * PI
     */
    @Override
    public double aire(){
        return rayon * rayon * Math.PI;
    }

    /**
     * retourne le perimètre d'un cercle
     * @return 2.0 * PI * rayon
     */
    @Override
    public double perimetre(){
        return 2.0 * Math.PI * rayon;
    }

    /**
     * affiche les attributs d'un cercle
     * @return string des attributs
     */
    @Override
    public String toString() {
        return "Cercle{" +
                "rayon=" + rayon +
                '}';
    }
}
