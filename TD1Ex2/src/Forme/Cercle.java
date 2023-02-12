package Forme;

public class Cercle {
    private static int nbrCercle;
    private double rayon;
    private String couleur;

    public static int getNbrCercle(){
        return nbrCercle;
    }

    public Cercle(){
        this.rayon = 1.0;
        this.couleur = "Rouge";
        this.nbrCercle ++;
    }

    public Cercle(double rayon){
        this.rayon = rayon;
        this.couleur = "Rouge";
        this.nbrCercle ++;
    }

    public Cercle(double rayon, String couleur) {
        this.rayon = rayon;
        this.couleur = couleur;
        this.nbrCercle++;
    }

    public double getRayon(){
        return rayon;
    }

    public String getCouleur(){
        return couleur;
    }

    public double aire(){
        return Math.pow(rayon, 2) * Math.PI;
    }

    public String toString() {
        return "Rayon = " + rayon + "; Couleur = " + couleur;
    }

    public void setRayon(double rayon){
        this.rayon = rayon;
    }

}
