package vehicule;

/**
 * un bus hybride utilise l'essence et l'électricité
 */
public class BusHybride extends Bus implements Essence, Electrique{
    private final double capaciteReservoir;
    private double consommationEssence;
    private final double capaciteBatterie;
    private double consommationElectrique;

    private static final double DEF_CONSOMMATION_ESSENCE = 4.0;
    private static final double DEF_CONSOMMATION_ELECTRIQUE = 10.0;

    /**
     * @param immatriculation
     * @param capaciteReservoir
     * @param capaciteBatterie
     */
    public BusHybride(String immatriculation, double capaciteReservoir, double capaciteBatterie) {
        super(immatriculation);
        this.capaciteReservoir = capaciteReservoir;
        this.consommationEssence = this.DEF_CONSOMMATION_ESSENCE;
        this.capaciteBatterie = capaciteBatterie;
        this.consommationElectrique = this.DEF_CONSOMMATION_ELECTRIQUE;
    }

    @Override
    public double getCapaciteReservoir() {
        return capaciteReservoir;
    }

    @Override
    public double getCapaciteBatterie() {
        return capaciteBatterie;
    }

    /**
     * @return capacite du réservoir divisé par la concommation d'essence + capacite de la batterie divisé par la consommation electrique
     */
    @Override
    public double getAutonomie(){
        return (capaciteReservoir / consommationEssence) + (capaciteBatterie / consommationElectrique);
    }

    @Override
    public double getConsommationEssence() {
        return consommationEssence;
    }

    @Override
    public void setConsommationEssence(double consommationEssence) {
        this.consommationEssence = consommationEssence;
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
     * @return caractéristique d'un bus hybride
     */
    @Override
    public String toString() {
        return "BusHybride{" +
                "capaciteReservoir=" + capaciteReservoir +
                ", consommationEssence=" + consommationEssence +
                ", capaciteBatterie=" + capaciteBatterie +
                ", consommationElectrique=" + consommationElectrique +
                "} " + super.toString();
    }
}
