import cafe.*;

public class TestDistributeur {
    public static void main(String[] args) {
        Distributeur distributeur = null;
        try {
            distributeur = new Distributeur("1111");
            for (int i = 0; i < 10; i++) {
                distributeur.commanderBoisson(Boisson.CAFE);
            }

        } catch (ProduitException produitException) {
            System.out.println(produitException);
        } catch (MonnaieException monnaieException) {
            System.out.println(monnaieException);
        } catch (IllegalStateException illegalStateException) {
            System.out.println(illegalStateException);
        } finally {
            System.out.println(distributeur.getCollectionTraces().toString());
        }
    }
}