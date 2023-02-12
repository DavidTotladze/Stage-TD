package Convertisseur;

public class Devise {
    private String nom;
    private double taux;

    public Devise(String nom){
        this.taux = 1.0;
        this.nom = nom;
    }

    public Devise(String nom, Double taux){
        this.nom = nom;
        this.taux = taux;
    }

    public double getTaux(){
        return taux;
    }

    public String getNom(){
        return nom;
    }

    public double convertirEnEuro(double montantDevise){
        return montantDevise / taux;
    }

    public double convertirEnDevise(double montantEuro){
        return montantEuro * taux;
    }

    public String toString() {
        return "Nom : " + nom + "; Taux : " + taux;
    }
}
