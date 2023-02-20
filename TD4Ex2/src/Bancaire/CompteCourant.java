package Bancaire;
import java.lang.Math;

public class CompteCourant extends Compte{
    private double agios;
    private double decouvertAutorise;

    public CompteCourant(String numero){
        super(numero);
        this.agios = 10.0;
        this.decouvertAutorise = 10000;
    }

    public CompteCourant(String numero, double agios, double decouvertAutorise){
        super(numero);
        this.agios = agios;
        this.decouvertAutorise = decouvertAutorise;
    }

    public double getDecouvertAutorise() {
        return decouvertAutorise;
    }

    public void setDecouvertAutorise(double decouvertAutorise) {
        this.decouvertAutorise = decouvertAutorise;
    }

    public double getAgios() {
        return agios;
    }

    public void setAgios(double agios) {
        this.agios = agios;
    }

    public int calculerAgios(){
        double montantDecouvert = decouvertAutorise + super.getSolde();
        //je n'ai pas vraiment compris le calcul à faire
        if (montantDecouvert < 0){
            double lesAgios = (-1 * montantDecouvert) * (agios/100);
            return (int) lesAgios;
        } else {
            return 0;
        }
    }

    public String toString(){
        return "CompteCourant [numero=" + super.getNumero() + ", solde=" + super.getSolde()
                + ", dateOuverture=" + super.getDateOuverture() + ", agios=" + agios
                + ", decouvertAutorise=" + decouvertAutorise + "]";
    }
}
