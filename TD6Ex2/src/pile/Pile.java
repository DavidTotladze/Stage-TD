package pile;

public interface Pile {

    /**
     * @return retourne l'élément au sommet de la pile et lève une exception PileVideException
     */
    public Integer sommet() throws PileVideException;

    /**
     * détermine si la pile est vide ou non
     * @return boolean
     */
    public boolean estVide();

    /**
     * empile un élément de type Integer sur la pile
     * @param element element de type Integer à empiler
     */
    public void empiler(Integer element) throws PilePleineException;

    /**
     * retire l'élément au sommet de la pile et lève une exception PileVideException
     */
    public void depiler() throws PileVideException;
}
