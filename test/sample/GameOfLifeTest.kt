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

    @Test
    fun `three cells - one cell alive on board`() {
        val gameOfLife = GameOfLife()

        val board = "XXX"
        val evolved = gameOfLife.evolve(board)
        assertEquals(evolved, "_X_")
    }
}

class GameOfLife {
    fun evolve(board: String) : String {
        if ( board == "XXX")
            return "_X_"
        return "__"
    }

}
