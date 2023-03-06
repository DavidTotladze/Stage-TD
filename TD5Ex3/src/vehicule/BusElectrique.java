package vehicule;

public class BusElectrique extends Bus implements Electrique{
    private final double capaciteBatterie;
    private double consommationElectrique;

    private static final double DEF_CONSOMMATION_ELECTRIQUE = 11.0;

    /**
     * @param immatriculation
     * @param capaciteBatterie
     */
    public BusElectrique(String immatriculation, double capaciteBatterie) {
        super(immatriculation);
        this.capaciteBatterie = capaciteBatterie;
        this.consommationElectrique = this.DEF_CONSOMMATION_ELECTRIQUE;
    }

    @Override
    public double getCapaciteBatterie() {
        return capaciteBatterie;
    }

    /**
     * @return capacite de la batterie divisé par la consommation electrique
     */
    @Override
    public double getAutonomie(){
        return capaciteBatterie / consommationElectrique;
    }

    @Override
    public double getConsommationElectrique() {
        return consommationElectrique;
    }

    @Override
    public void setConsommationElectrique(double consommationElectrique) {
        this.consommationElectrique = consommationElectrique;
    }

    /**
     * @return caractéristiques d'un bus électrique
     */
    @Override
    public String toString() {
        return "BusElectrique{" +
                "capaciteBatterie=" + capaciteBatterie +
                ", consommationElectrique=" + consommationElectrique +
                "} " + super.toString();
    }
}
