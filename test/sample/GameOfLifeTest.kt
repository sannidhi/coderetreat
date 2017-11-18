package sample

import junit.framework.Assert.assertTrue
import org.junit.Test

class GameOfLifeTest {

    @Test
    fun `die - 0 or 1 neighbouring cells alive`() {
        assertTrue(!staysAlive(0))
        assertTrue(!staysAlive(1))
    }

    @Test
    fun `alive - 2 or 3 neighbouring cells alive`() {
        assertTrue(staysAlive(2))
        assertTrue(staysAlive(3))
    }

    private fun staysAlive(numberOfNeighbours: Int): Boolean {
        return numberOfNeighbours > 1
    }
}


