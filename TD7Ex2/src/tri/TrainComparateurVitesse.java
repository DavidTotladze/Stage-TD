package tri;

import java.util.Comparator;

public class TrainComparateurVitesse implements Comparator<Train> {

    /**
     * compare la vitesse de deux objets train
     * @param reference the first object to be compared.
     * @param compare   the second object to be compared.
     * @return 1 si la vitesse de reference est supérieur à compare
     *         -1 si la vitesse de reference est inférieur à compare
     *         0 si les vitesses sont égaux
     */
    @Override
    public int compare(Train reference, Train compare) {
        if (reference.getVitesse() > compare.getVitesse()){
            return 1;
        } else if (reference.getVitesse() < compare.getVitesse()){
            return -1;
        } else{
            return 0;
        }
    }
}
