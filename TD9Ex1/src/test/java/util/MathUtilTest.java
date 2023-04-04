package util;


import org.junit.Test;

import static org.junit.Assert.*;

public class MathUtilTest {

    /**
     * Test si un nombre négatif est utilisé comme argument;
     */
    @Test(expected = IllegalArgumentException.class)
    public void testFactorielNegatif() {
        MathUtil.factoriel(-1);
    }

    /**
     * test 0! = 1
     */
    @Test
    public void testFactorielZero(){
        assertEquals(1, MathUtil.factoriel(0));
    }

    /**
     * test 1! = 1
     */
    @Test
    public void testFactorielUn() {
        assertEquals(1, MathUtil.factoriel(1));
    }

    @Test
    public void testFactoriel() {
        assertEquals(720, MathUtil.factoriel(6));
    }
}