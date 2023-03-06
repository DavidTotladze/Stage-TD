import vehicule.*;
public class TestBus {
    public static void main(String[] args) {
        Bus [] bus = new Bus[3];

        BusEssence busEssence = new BusEssence("busEssence", 100);
        BusElectrique busElectrique = new BusElectrique("busElectrique", 100);
        BusHybride busHybride = new BusHybride("busHybride", 100, 100);

        bus[0] = busEssence;
        bus[1] = busElectrique;
        bus[2] = busHybride;

        for (int i = 0; i < bus.length; i++){
            System.out.println(bus[i].toString());
            System.out.println("Autonomie = " + bus[i].getAutonomie());
        }
    }
}