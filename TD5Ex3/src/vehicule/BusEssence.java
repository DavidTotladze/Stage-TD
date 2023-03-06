package vehicule;

public class BusEssence extends Bus implements Essence{
    private final double capaciteReservoir;
    private double consommationEssence;

    private static final double DEF_CONSOMMATION_ESSENCE = 5.0;

    /**
     * @param immatriculation
     * @param capaciteReservoir
     */
    public BusEssence(String immatriculation, double capaciteReservoir) {
        super(immatriculation);
        this.capaciteReservoir = capaciteReservoir;
        this.consommationEssence = this.DEF_CONSOMMATION_ESSENCE;
    }

    @Override
    public double getCapaciteReservoir() {
        return capaciteReservoir;
    }

    /**
     * @return capacite du réservoir divisé par la concommation d'essence
     */
    @Override
    public double getAutonomie(){
        return capaciteReservoir / consommationEssence;
    }

    @Override
    public double getConsommationEssence() {
        return consommationEssence;
    }

    @Override
    public void setConsommationEssence(double consommationEssence) {
        this.consommationEssence = consommationEssence;
    }

    /**
     * @return caractéristiques d'un bus à essence
     */
    @Override
    public String toString() {
        return "BusEssence{" +
                "capaciteReservoir=" + capaciteReservoir +
                ", consommationEssence=" + consommationEssence +
                "} " + super.toString();
    }
}
