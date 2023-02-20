import Bancaire.*;
public class Main {
    public static void main(String[] args) {
        CompteCourant compte1 = new CompteCourant("123456A", 10.0, 1000);
        compte1.debiter(1999);

        CompteEpargne compte2 = new CompteEpargne("987654B", 7.0);
        compte2.crediter(3123);

        Compte [] comptes = new Compte[2];
        comptes[0] = compte1;
        comptes[1] = compte2;

        for (int i = 0; i < comptes.length; i++ ){
            System.out.println(comptes[i].toString());
        }

        System.out.println(((CompteCourant) comptes[0]).calculerAgios());
        System.out.println(((CompteEpargne) comptes[1]).calculerInterets());
    }
}