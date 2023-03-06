package cafe;
import java.util.Date;

/**
 * A chaque commande de boisson, une nouvelle trace est créée comprenant la boisson commandée, la date
 * et l'heure de la commande et le fait que la demande ait été servie ou non.
 */
public class Trace {
    private final Date date;
    private final boolean estServi;
    private final Boisson boisson;

    private static final Date DEF_DATE_COURANTE = new Date();

    /**
     * @param boisson type de boissons : CAFE, CHOCOLAT, THE
     * @param estServi commande servi ou non
     */
    public Trace(Boisson boisson, boolean estServi){
        this.boisson = boisson;
        this.estServi = estServi;
        this.date = this.DEF_DATE_COURANTE;
    }

    /**
     * @return caractéristiques d'une trace
     */
    @Override
    public String toString() {
        return "Trace{" +
                "date=" + date +
                ", estServi=" + estServi +
                ", boisson=" + boisson +
                '}';
    }
}
