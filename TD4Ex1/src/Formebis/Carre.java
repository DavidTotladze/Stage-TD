package Formebis;
import Forme.*;

public class Carre extends Rectangle {
    public Carre(){
        this.longueur = 1.0;
        this.largeur = 1.0;
    }

    public Carre(double cote){
        this.longueur = cote;
        this.largeur = cote;
    }

    public double getCote(){
        return longueur;
    }

    public String toString(){
        return "Carré [côté=" + longueur + "]";
    }

}
