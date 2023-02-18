package wrapper;
import java.lang.Object;

public class Entier extends Object {
    private int entier;

    public Entier(int entier){
        this.entier = entier;
    }

    public int getEntier(){
        return entier;
    }

    public boolean equals(Object o){
        return super.equals(o);
    }

    public int hashcode(){
        return super.hashCode();
    }

    public String toString(){
        return super.toString();
    }
}
