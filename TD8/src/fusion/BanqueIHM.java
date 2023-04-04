package fusion;

import java.util.Collection;

public interface BanqueIHM {

    Collection<Compte> chargerComptes(String nomFichier);

    void ajouterUnCompte(Compte compte);

    Collection<Compte> getTousLesComptes();

    Compte getUnCompte(String numero);

    void sauvegarderComptes(Collection<Compte> comptes, String nomFichier);

}
