package IntList;

import static org.junit.Assert.*;
import org.junit.Test;

public class SquarePrimesTest {

    /**
     * Here is a test for isPrime method. Try running it.
     * It passes, but the starter code implementation of isPrime
     * is broken. Write your own JUnit Test to try to uncover the bug!
     */
    @Test
    public void testSquarePrimesSimple() {
        IntList lst = IntList.of(7, 11, 2, 17, 18);
        boolean changed = true;
        boolean changed2 = false;
        for(int i = 0; i < lst.size(); i ++){
            changed = IntListExercises.squarePrimes(lst);
            if(changed) changed2 = true;
        }
        assertEquals("49 -> 121 -> 4 -> 289 -> 18", lst.toString());
        assertTrue(changed2);
    }
}
