import pile.*;

public class TestPile {
    public static void main(String[] args) {
        final PileTableau pile = new PileTableau();
        try {
            pile.empiler(1);
            pile.empiler(1);
            pile.empiler(1);
            pile.empiler(1);
            pile.empiler(1);
            pile.empiler(1);
            pile.empiler(1);
            pile.empiler(1);
            pile.empiler(1);
            pile.empiler(1);
            pile.empiler(1);

            System.out.println(pile.sommet());

        } catch (PileVideException pileVideException){
            System.out.println(pileVideException);
        } catch (PilePleineException pilePleineException){
            System.out.println(pilePleineException);
        }
    }
}