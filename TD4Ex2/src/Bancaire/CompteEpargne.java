package Bancaire;

public class CompteEpargne extends Compte{
    private double tauxInteret;

    public CompteEpargne(String numero){
        super(numero);
        this.tauxInteret = 3.0;
    }

    public CompteEpargne(String numero, double tauxInteret){
        super(numero);
        this.tauxInteret = tauxInteret;
    }

    public double getTauxInteret() {
        return tauxInteret;
    }

    public void setTauxInteret(double tauxInteret) {
        this.tauxInteret = tauxInteret;
    }

    public int calculerInterets(){
        if (super.getSolde() > 0){
            double interets = super.getSolde() * (tauxInteret/100);
            return (int) interets;
        } else {
            return 0;
        }
    }

    public String toString(){
        return "CompteEpargne [numero=" + super.getNumero() + ", solde=" + super.getSolde()
                + ", dateOuverture=" + super.getDateOuverture()
                + ", tauxInteret=" + tauxInteret + "]";
    }
}
