package Formebis;
import Forme.*;

public class Carre extends Rectangle {
    public Carre(){
        super(1.0, 1.0);
    }

    public Carre(double cote){
        super(cote, cote);
    }

    public double getCote(){
        return super.getLongueur();
    }

    public String toString(){
        return "Carré [côté=" + super.getLongueur() + "]";
    }

}
