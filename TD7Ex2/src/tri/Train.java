package tri;

import java.lang.Comparable;
import java.util.Objects;

public class Train implements Comparable<Train>{
    private final String type;
    private final int vitesse;

    //private final Comparable<Train>

    /**
     * @param type type de train, non nul et doit commencer par une majuscule suivi de charactères
     *             alphabétique
     * @param vitesse vitesse du train entre 100 et 1000
     */
    public Train(String type, int vitesse) {
        if (!type.matches("[A-Z].[a-zA-Z]+")){
            throw new IllegalArgumentException(type + " doit être non nul et commencer par une majuscule " +
                    "suivi de charactères alphabétique");
        }
        if (vitesse < 100 || vitesse > 1000){
            throw new IllegalArgumentException(vitesse + " vitesse seulement entre 100 et 1000");
        }

        this.type = type;
        this.vitesse = vitesse;
    }

    /**
     * basé sur l'attribut type
     * @param o train comparé
     * @return true si même attribut sinon false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Train train = (Train) o;
        return getType().equals(train.getType());
    }

    /**
     * basé sur l'attribut type
     * @return hashcode du type
     */
    @Override
    public int hashCode() {
        return Objects.hash(getType());
    }

    @Override
    public String toString() {
        return "Train{" +
                "type='" + type + '\'' +
                ", vitesse=" + vitesse +
                '}';
    }

    public String getType() {
        return type;
    }

    public int getVitesse() {
        return vitesse;
    }

    //je ne sais pas si c'est ce qu'il faut faire pour compareTo
    /**
     * basé sur l'attribut type
     * @param train the object to be compared.
     * @return 0 si les types sont égaux
     *         1 si les types ne sont pas égaux
     */
    @Override
    public int compareTo(Train train) {
        if (this.getType() == train.getType()){
            return 0;
        } else{
            return 1;
        }
    }
}
