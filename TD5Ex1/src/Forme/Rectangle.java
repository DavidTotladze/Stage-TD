package Forme;

public class Rectangle extends Figure {
    private double longueur;
    private double largeur;

    public Rectangle(){
        this.longueur = 2.0;
        this.largeur = 1.0;
    }

    public Rectangle(double longueur, double largeur){
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public double getLongueur(){
        return longueur;
    }

    public double getLargeur(){
        return largeur;
    }

    @Override
    public String toString(){
        return "Rectangle [longueur=" + longueur + ", largeur=" + largeur + "]";
    }

    @Override
    public double aire(){
        return longueur * largeur;
    }

    @Override
    public double perimetre(){
        return (longueur * 2) + (largeur * 2);
    }

    public boolean equals(Object o){
        return super.equals(o);
    }

    public int hashCode() {
        return super.hashCode();
    }
}
