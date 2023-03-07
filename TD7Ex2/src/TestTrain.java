import tri.*;
import java.util.*;

public class TestTrain {
    public static void main(String[] args) {
        final List<Train> listeTrains = new ArrayList<>(0);

        final Train tgv = new Train("TGV", 400);
        final Train ter = new Train("TER", 150);
        final Train corail = new Train("CORAIL", 200);
        final Train teoz = new Train("TEOZ", 250);

        listeTrains.add(tgv);
        listeTrains.add(ter);
        listeTrains.add(corail);
        listeTrains.add(teoz);

        System.out.println("Afficher méthode 1 :");
        for (int i = 0; i < listeTrains.size(); i++){
            System.out.println(listeTrains.get(i));
        }

        System.out.println("Afficher méthode 2 :");
        System.out.println(listeTrains);


        //Affichez tous les trains triés par type : ???

        System.out.println("Tri vitesse croissante :");
        Collections.sort(listeTrains, new TrainComparateurVitesse());

        for (int i = 0; i < listeTrains.size(); i++){
            System.out.println(listeTrains.get(i));
        }

        System.out.println("Tri vitesse décroissante :");
        Collections.sort(listeTrains, new TrainComparateurVitesse().reversed());

        for (int i = 0; i < listeTrains.size(); i++){
            System.out.println(listeTrains.get(i));
        }
    }
}