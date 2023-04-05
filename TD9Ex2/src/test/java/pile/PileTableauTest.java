package pile;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

public class PileTableauTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test(expected = PileVideException.class)
    public void sommetVide() throws PileVideException {
        PileTableau pile = new PileTableau();
        pile.sommet();

    }


    @Test
    public void sommet() throws PileVideException {
        PileTableau pile = new PileTableau();
        Integer element = 1;
        pile.empiler(element);
        assertEquals(element, pile.sommet());

    }
}
/*
    @Test
    public void estVideTrue() {
        PileTableau pile = new PileTableau();
        assertTrue(pile.estVide());
    }

    @Test
    public void estVideFalse() {
        PileTableau pile = new PileTableau();
        Integer element = 1;
        pile.empiler(element);
        assertFalse(pile.estVide());
    }

    @Test
    public void empiler() throws PileVideException {
        PileTableau pile = new PileTableau();
        Integer element = 1;
        pile.empiler(element);
        assertEquals(element, pile.sommet());
    }

    @Test
    public void depiler() {
    }
}

     */