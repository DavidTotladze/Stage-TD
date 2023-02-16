package librairie;
import java.util.ArrayList;
import java.util.List;

public class Librairie {
    private String nom;
    private List<Livre> livres = new ArrayList<>(100);
    private static int NbreLivres;

    public Librairie(String nom){
        this.nom = nom;
    }

    public void ajouterLivre(Livre livre){
        livres.add(livre);
        NbreLivres ++;
    }

    public Livre getLivre(int position){
        return livres.get(position);
    }

    public int getNbreLivres(){
        return NbreLivres;
    }

    public double valoriserLeStock(){
        double somme = 0;
        for (int position = 0; position < NbreLivres; position++){
            somme += getLivre(position).getQuantiteEnStock() * getLivre(position).getPrix();
        }
        return somme;
    }
}
