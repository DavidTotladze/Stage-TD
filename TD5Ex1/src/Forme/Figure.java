package Forme;

public abstract class Figure {
    private Couleur couleur;

    public Figure(){
        this.couleur = Couleur.ROUGE;
    }

    public Couleur getCouleur() {
        return couleur;
    }

    public void setCouleur(Couleur couleur) {
        this.couleur = couleur;
    }

    public abstract double aire();

    public abstract double perimetre();

    public String toString(){
        return "Couleur = " + couleur;
    }


}
