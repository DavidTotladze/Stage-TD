package Bancaire;
import java.util.Date;

public class Compte{
    private String numero;
    private int solde;
    private Date dateOuverture;

    public Compte(String numero){
        this.numero = numero;
        this.solde = 0;
        this.dateOuverture = new Date();
    }

    public String getNumero(){
        return numero;
    }

    public int getSolde(){
        return solde;
    }

    public Date getDateOuverture(){
        return dateOuverture;
    }

    public void debiter(int montant){
        this.solde -= montant;
    }

    public void crediter(int montant){
        this.solde += montant;
    }

    public boolean equals(Object o){
        return super.equals(o);
    }

    public int hashCode(){
        return super.hashCode();
    }
}
