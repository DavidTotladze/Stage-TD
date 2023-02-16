package librairie;

public class Livre {
    private String titre;
    private float prix;
    private int quantiteEnStock;
    private Auteur auteur;

    public Livre(String titre, Auteur auteur){
        this.titre = titre;
        this.auteur = auteur;
        this.quantiteEnStock = 0;
    }

    public Livre(String titre, Auteur auteur, float prix){
        this.titre = titre;
        this.prix = prix;
        this.auteur = auteur;
        this.quantiteEnStock = 0;
    }

    public String getTitre(){
        return titre;
    }

    public float getPrix(){
        return prix;
    }

    public int getQuantiteEnStock(){
        return quantiteEnStock;
    }

    public Auteur getAuteur(){
        return auteur;
    }

    public void setQuantiteEnStock(int quantiteEnStock){
        this.quantiteEnStock = quantiteEnStock;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public String toString() {
        return "Titre = " + titre + "; Auteur = " + auteur.getNom() + "; Prix = " + prix + "; Quantité en stock = " + quantiteEnStock;
    }

}
