package vehicule;

public abstract class Bus{
    private final String immatriculation;
    private double vitesseMaximale;

    private static final double DEF_VITESSE_MAXIMALE = 90;

    /**
     * @param immatriculation
     */
    public Bus(String immatriculation){
        this.immatriculation = immatriculation;
        this.vitesseMaximale = this.DEF_VITESSE_MAXIMALE;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public double getVitesseMaximale() {
        return vitesseMaximale;
    }

    public void setVitesseMaximale(double vitesseMaximale) {
        this.vitesseMaximale = vitesseMaximale;
    }

    /**
     * @return l'autonomie dépend du type de bus
     */
    public abstract double getAutonomie();

    /**
     * @return caractéristiques d'un bus
     */
    @Override
    public String toString() {
        return "Bus{" +
                "immatriculation='" + immatriculation + '\'' +
                ", vitesseMaximale=" + vitesseMaximale +
                '}';
    }
}
