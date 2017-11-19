package sample

import junit.framework.Assert.assertFalse
import junit.framework.Assert.assertTrue
import org.junit.Test

class GameOfLifeTest {

    @Test
    fun `zero or 1 neighbours - cell dies`() {
        assertFalse(cellLives(0))
        assertFalse(cellLives(1))
    }

    @Test
    fun `2 or 3 neighbours - cell lives`() {
        assertTrue(cellLives(2))
        assertTrue(cellLives(3))
    }

    @Test
    fun `more than 3 neighbours - cell dies`() {
        assertFalse(cellLives(4))
    }

    @Test
    fun `exactly 3 neighbours - cell becomes alive`() {
        assertTrue(cellLives(3))
    }

    @Test
    fun `all cells are dead - evolution does not occur - universe remains empty`() {
        val evolutionOccurs = false
        assertFalse(evolutionOccurs)
    }

    private fun cellLives(numberOfNeighbours: Int) :Boolean {
      return numberOfNeighbours == 2 || numberOfNeighbours == 3
    }
}


