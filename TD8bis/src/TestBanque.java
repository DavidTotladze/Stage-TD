import fusion.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class TestBanque {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        int reponse = 0;
        int numero = 0;
        Banque banque = new Banque();
        Collection<Compte> comptes = null;

        while (reponse != 8) {
            System.out.println("1 - Charger des comptes");
            System.out.println("2 - Ajouter un compte");
            System.out.println("3 - Lister les comptes");
            System.out.println("4 - Afficher un compte");
            System.out.println("5 - Créditer un compte");
            System.out.println("6 - Débiter un compte");
            System.out.println("7 - Sauvegarder des comptes");
            System.out.println("8 - Quitter");
            System.out.println("Choix (1-8) : ");
            reponse = user.nextInt();

            if (reponse == 1) {
                comptes = banque.chargerComptes("lesComptes");
            }

            if (reponse == 2){
                System.out.println("Numero du compte :");
                numero = user.nextInt();
                List listeCompte = new ArrayList(comptes);
                banque.ajouterUnCompte((Compte) listeCompte.get(numero));
            }

            if (reponse == 3) {
                System.out.println(banque.getTousLesComptes());
            }

            if (reponse == 4) {
                System.out.println("Numero du compte :");
                numero = user.nextInt();
                List listeCompte = new ArrayList(comptes);
                System.out.println(banque.getUnCompte((String) listeCompte.get(numero)));
            }

            if (reponse == 5) {
                System.out.println("Numero du compte :");
                numero = user.nextInt();
                List listeCompte = new ArrayList(comptes);
            }

            if (reponse == 6) {
                System.out.println("Numero du compte :");
                numero = user.nextInt();
                List listeCompte = new ArrayList(comptes);
            }

            if (reponse == 7) {
                banque.sauvegarderComptes(comptes, "lesComptes");
            }


        }
    }
}