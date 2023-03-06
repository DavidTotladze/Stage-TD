package cafe;
import java.util.*;

/**
 *
 */
public class Distributeur {
    private final String id;
    private final Collection<Trace> collectionTraces = new ArrayList<Trace>();

    /**
     * @param id code alphanumérique
     */
    public Distributeur(String id){
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public Collection<Trace> getCollectionTraces() {
        return collectionTraces;
    }

    /**
     La méthode commanderBoisson simule la préparation d'une boisson comme suit :
     * Pour 10% des commandes, cette méthode lève une exception de type IllegalStateException liée au
     dysfonctionnement d'un composant interne. Le message de l'exception sera "ERC18 low
     conductivity interval".
     * Pour 10% des commandes, cette méthode lève une exception de type MonnaieException liée à
     l'absence de monnaie.
     * Pour 10% des commandes, cette méthode lève une exception de type ProduitException liée à
     l'absence de produits.
     * Pour les cas restants, le distributeur fonctionne et affiche "Boisson prête".
     En cas de succès, une trace est créée et ajoutée à la collection des traces.
     * @param boisson type de boisson
     */
    public void commanderBoisson(Boisson boisson){
        if (Math.random() <= 0.1){
            collectionTraces.add(new Trace(boisson, false));
            throw new IllegalStateException("ERC18 low conductivity interval");
        } else if (Math.random() <= 0.2){
            collectionTraces.add(new Trace(boisson, false));
            throw  new MonnaieException();
        } else if (Math.random() <= 0.3){
            collectionTraces.add(new Trace(boisson, false));
            throw new ProduitException();
        } else{
            collectionTraces.add(new Trace(boisson, true));
            System.out.println("Boisson prête");
        }
    }

}
