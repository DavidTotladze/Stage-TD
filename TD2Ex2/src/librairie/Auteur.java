package librairie;

public class Auteur {
    private String nom;
    private String email;
    private Sexe sexe;

    public Auteur(String nom, Sexe sexe){
        this.nom = nom;
        this.sexe = sexe;
    }

    public String getNom(){
        return nom;
    }

    public Sexe getSexe(){
        return sexe;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String toString() {
        return "Nom = " + nom + "; Sexe = " + sexe + " ; Email = " + email;
    }
}
