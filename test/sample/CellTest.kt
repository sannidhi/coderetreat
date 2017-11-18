package sample

import junit.framework.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import sample.State.*

class CellTest {

    private lateinit var cell: Cell

    @Before
    fun setUp() {
        cell = Cell()
    }

    @Test
    fun `dies - when less than two neighbours`() {
        assertEquals(cell.evolve(1), DIE)
    }
    @Test
    fun `alive - when two or three neighbours`() {
        assertEquals(cell.evolve(2), LIVE)
    }

    @Test
    fun `die - when more than 3 neighbours`() {
        assertEquals(cell.evolve(4), DIE)
    }

    @Test
    fun `reproduce - when exactly 3 neighbours`() {
        assertEquals(cell.evolve(3), REPRODUCE)
    }
}
