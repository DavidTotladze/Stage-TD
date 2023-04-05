package pile;

public class PileTableau implements Pile {
    private final Integer[] elements = new Integer[10];
    private int nbElements;

    private static final int DEF_NBELEMENTS = 0;

    public PileTableau() {
        this.nbElements = DEF_NBELEMENTS;
    }

    /**
     * @return retourne l'élément au sommet de la pile
     * @throws PileVideException pile = null
     */
    @Override
    public Integer sommet() throws PileVideException {
        System.out.println("fd");
        Integer res = null;
        if(elements != null && elements.length>0){
            for (int i = elements.length - 1; i > 0; i--) {
                if (elements[i] != null) {
                    res= elements[i];
                    break;
                }
            }
        }else{
            throw new PileVideException("La pile est vide.");
        }
   return res;
    }

    /**
     * détermine si la pile est vide ou non
     * @return boolean
     */
    @Override
    public boolean estVide(){
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] != null) {
                return false;
            }
        }
        return true;
    }

    /**
     * empile un élément de type Integer sur la pile
     * lève une exception PilePleineException
     * @param element element de type Integer à empiler
     */
    @Override
    public void empiler(Integer element) throws PilePleineException{
        boolean pleine = true;
        for (int i = 0; i < elements.length; i++) {
            System.out.println(elements[i]);
            if (elements[i] == null) {
                elements[i] = element;
                pleine = false;
                break;
            }
        }
        if (pleine == true){
            throw new PilePleineException("La pile est pleine.");
        }
    }

    /**
     * retire l'élément au sommet de la pile et lève une exception PileVideException
     */
    @Override
    public void depiler() throws PileVideException{
        if (estVide()){
            throw new PileVideException("La pile est vide.");
        }
        for (int i = elements.length - 1; i > 0; i--) {
            if (elements[i] != null) {
                elements[i] = null;
                break;
            }
        }
    }
}
