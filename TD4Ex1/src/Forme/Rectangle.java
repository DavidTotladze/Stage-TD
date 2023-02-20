package Forme;

public class Rectangle {
    protected double longueur;
    protected double largeur;

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

    public String toString(){
        return "Rectangle [longueur=" + longueur + ", largeur=" + largeur + "]";
    }

    public double aire(){
        return longueur * largeur;
    }

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
