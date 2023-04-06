package fusion;

import java.io.Serializable;
import java.util.Objects;

public class Compte implements Serializable, Comparable<Compte> {
    private static final long serialVersionUID = 1L;
    private final String numero;
    private final String titulaire;
    private double solde;

    private static final double DEF_SOLDE = 0;

    /**
     * constructeur de Compte
     * solde initialisé à 0
     * @param numero d'un compte
     * @param titulaire du compte
     */
    public Compte(String numero, String titulaire) {
        this.numero = numero;
        this.titulaire = titulaire;
        this.solde = DEF_SOLDE;
    }

    public String getNumero() {
        return numero;
    }

    public String getTitulaire() {
        return titulaire;
    }

    public double getSolde() {
        return solde;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Compte compte = (Compte) o;
        return Objects.equals(getNumero(), compte.getNumero());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumero(), getTitulaire(), getSolde());
    }

    @Override
    public String toString() {
        return "Compte{" +
                "numero='" + numero + '\'' +
                ", titulaire='" + titulaire + '\'' +
                ", solde=" + solde +
                '}';
    }

    /**
     * @param montant à débiter de solde
     */
    public void debiter(double montant){
        this.solde -= montant;
    }

    /**
     * @param montant à créditer à solde
     */
    public void crediter(double montant){
        this.solde += montant;
    }

    /**
     * compare en fonction du numéro d'un compte
     * @param compte object à comparer
     * @return 0 si ils sont égaux
     *         1 si ils ne sont pas égaux
     */
    @Override
    public int compareTo(Compte compte){
        if (this.getNumero() == compte.getNumero()){
            return 0;
        } else {
            return 1;
        }
    }


}
