package Forme;
import java.lang.Math;

public class Cercle extends Figure {
    private double rayon;

    public Cercle(){
        this.rayon = 1.0;
    }

    public Cercle(double rayon){
        this.rayon = rayon;
    }

    public double getRayon(){
        return rayon;
    }

    @Override
    public double aire(){
        return Math.pow(rayon, 2) * Math.PI;
    }

    @Override
    public String toString() {
        return "Rayon = " + rayon;
    }

    @Override
    public double perimetre(){
        return rayon * 2 * Math.PI;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public boolean equals(Object o){
        return super.equals(o);
    }
}
