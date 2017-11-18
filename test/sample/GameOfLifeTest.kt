package sample

import junit.framework.Assert.assertEquals
import org.junit.Test

class GameOfLifeTest {
    
    @Test
    fun `same universe does not change`() {
        val gameOfLife = GameOfLife()

        val board = "__"
        val evolved = gameOfLife.evolve(board)
        assertEquals(evolved, board)
    }

    @Test
    fun `single cell - dies`() {
        val gameOfLife = GameOfLife()

        val board = "_X"
        val evolved = gameOfLife.evolve(board)
        assertEquals(evolved, "__")
    }
}

class GameOfLife {
    fun evolve(board: String) : String {
        return "__"
    }

}
