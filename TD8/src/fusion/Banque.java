package fusion;

import java.io.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Banque implements BanqueIHM{
    private final Map<Compte, Compte> banque = new HashMap<Compte, Compte>();
    private Compte compte;

    public Banque(){
        this.compte = new Compte(compte.getNumero(), compte.getTitulaire());
    }

    /**
     * ajoute la solde du compte passé en paramètre
     * @param compte solde
     */
    @Override
    public void ajouterUnCompte(Compte compte){
        if (this.compte != null){
            this.compte.crediter(compte.getSolde());
        }
    }

    /**
     * @param comptes à ajouter dans le hashmap
     */
    public void ajouterDesComptes(Collection<Compte> comptes){
        for (int i = 0; i < comptes.size(); i++){
            this.banque.put(this.compte, comptes.iterator().next());
        }
    }

    /**
     * @return le nombre de comptes dans la banque
     */
    public int getNbComptes(){
        return banque.size();
    }

    /**
     * @return une collection de comptes de banque
     */
    @Override
    public Collection<Compte> getTousLesComptes(){
        return this.banque.values();
    }

    /**
     * @param numero utilisé
     * @return un compte en fonction d'un numero
     */
    @Override
    public Compte getUnCompte(String numero){
        Collection<Compte> comptes = this.getTousLesComptes();
        for (int i = 0; i < comptes.size(); i++){
            if (comptes.iterator().next().getNumero() == numero){
                return comptes.iterator().next();
            }
        }
        return null;
    }

    /**
     * sérialise dans un fichier une collection de comptes
     * @param comptes à sérialiser
     * @param nomFichier fichier créé
     * @throws SerialisationException
     */
    /*
    public void sauvegarderComptes(Collection<Compte> comptes, String nomFichier){
        try {
            File file = new File(nomFichier);
            file.createNewFile();
            final FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(String.valueOf(comptes.iterator().next()));
            fileWriter.close();
        } catch (IOException serialisationException) {
            throw new SerialisationException("Erreur, fichier déjà existant.");
        }
    }*/
    @Override
    public void sauvegarderComptes(Collection<Compte> comptes, String nomFichier) throws SerialisationException {
        try (final ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(nomFichier))){
            objectOutputStream.writeObject(comptes);
        } catch (IOException serialisationException) {
            //throw new SerialisationException("Erreur.");
            serialisationException.printStackTrace();
        }
    }


    /**
     * @param nomFichier à désérialiser
     * @return compts
     * @throws SerialisationException
     */
    @Override
    public Collection<Compte> chargerComptes(String nomFichier) throws SerialisationException {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(nomFichier))){
            System.out.println(objectInputStream.readObject());
            final Collection<Compte> comptes = null;
            comptes.addAll((Collection<? extends Compte>) objectInputStream.readObject());
            return comptes;
        } catch (IOException | ClassNotFoundException serialisationException) {
            throw new SerialisationException("Erreur.");
        }
    }

}
